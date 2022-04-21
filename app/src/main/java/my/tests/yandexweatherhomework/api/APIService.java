package my.tests.yandexweatherhomework.api;

import my.tests.yandexweatherhomework.entity.ResponseYandexWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface APIService {
    @GET("v2/forecast")
    Call<ResponseYandexWeather> getWeather(
            @Query("lat") Double lat,
            @Query("lon") Double lon,
            @Header("X-Yandex-API-Key") String key
    );

}
