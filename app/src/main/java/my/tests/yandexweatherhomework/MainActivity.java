package my.tests.yandexweatherhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;

import my.tests.yandexweatherhomework.api.APIConfig;
import my.tests.yandexweatherhomework.api.APIService;
import my.tests.yandexweatherhomework.api.APIServiceConstructor;
import my.tests.yandexweatherhomework.entity.ResponseYandexWeather;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView tv_text;
    Button bt_retro, bt_okhttp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        bt_retro.setOnClickListener(view -> {
            loadRetro();
        });
        bt_okhttp.setOnClickListener(view -> {
            loadOkHttp();
        });
    }

    private void loadOkHttp() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        okhttp3.Request request = new Request.Builder()
                .url(APIConfig.HOST_URL + "v2/forecast?lat=" + APIConfig.CITY_EKB_LAT
                        + "&lon=" + APIConfig.CITY_EKB_LON
                )
                .method("GET", null)
                .addHeader("X-Yandex-API-Key", APIConfig.API_YANDEX_KEY)
                .addHeader("Content-Type", "application/json")
                .build();

        client.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                tv_text.setText("Ошибка в запресе OkHttp");
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                if (response.body() != null) {
//                    Log.v("okhttp", response.body().string());
                    ResponseYandexWeather responseYandexWeather = (new Gson()).fromJson(response.body().string(), ResponseYandexWeather.class);

                    runOnUiThread(new Runnable() {
                                      @Override
                                      public void run() {
                                          tv_text.setText(responseYandexWeather.toString());
                                      }
                                  });
                } else
                    tv_text.setText("Тело запроса OkHttp пустое");
            }
        });

    }

    private void loadRetro() {
        APIService service = APIServiceConstructor.CreateService(APIService.class);
        Call<ResponseYandexWeather> call = service.getWeather(
                APIConfig.CITY_EKB_LAT,
                APIConfig.CITY_EKB_LON,
                APIConfig.API_YANDEX_KEY
        );
        call.enqueue(new Callback<ResponseYandexWeather>() {
            @Override
            public void onResponse(Call<ResponseYandexWeather> call, Response<ResponseYandexWeather> response) {
                if (response.body() != null)
                    tv_text.setText(response.body().toString());
                else
                    tv_text.setText("Тело запроса Retrofit пустое");
            }

            @Override
            public void onFailure(Call<ResponseYandexWeather> call, Throwable t) {
                tv_text.setText("Ошибка в запресе Retrofit");
            }
        });
    }


    private void initView() {
        tv_text = findViewById(R.id.tv_text);
        bt_okhttp = findViewById(R.id.bt_okhttp);
        bt_retro = findViewById(R.id.bt_retrofit);
    }
}