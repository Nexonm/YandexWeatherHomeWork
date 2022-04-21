package my.tests.yandexweatherhomework.entity;

import com.google.gson.JsonArray;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseYandexWeather {

    @SerializedName("now")
    private Integer now;
    @SerializedName("now_dt")
    private String nowDt;
    @SerializedName("info")
    private Info info;
    @SerializedName("fact")
    private Fact fact;
    @SerializedName("forecast")
    private Forecast forecast;

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }

    public String getNowDt() {
        return nowDt;
    }

    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("now");
        sb.append('=');
        sb.append(((this.now == null) ? "<null>" : this.now));
        sb.append(',');
        sb.append('\n');
        sb.append("nowDt");
        sb.append('=');
        sb.append(((this.nowDt == null) ? "<null>" : this.nowDt));
        sb.append(',');
        sb.append('\n');
        sb.append("fact");
        sb.append('=');
        sb.append(((this.fact == null) ? "<null>" : this.fact));
        return sb.toString();
    }

}

class Fact {

    @SerializedName("temp")
    private Integer temp;
    @SerializedName("feels_like")
    private Integer feelsLike;
    @SerializedName("icon")
    private String icon;
    @SerializedName("condition")
    private String condition;
    @SerializedName("wind_speed")
    private Double windSpeed;
    @SerializedName("wind_gust")
    private Double windGust;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mm")
    private Integer pressureMm;
    @SerializedName("pressure_pa")
    private Integer pressurePa;
    @SerializedName("humidity")
    private Integer humidity;
    @SerializedName("daytime")
    private String daytime;
    @SerializedName("polar")
    private Boolean polar;
    @SerializedName("season")
    private String season;
    @SerializedName("obs_time")
    private Integer obsTime;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(Integer pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Integer getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(Integer pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Boolean getPolar() {
        return polar;
    }

    public void setPolar(Boolean polar) {
        this.polar = polar;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getObsTime() {
        return obsTime;
    }

    public void setObsTime(Integer obsTime) {
        this.obsTime = obsTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null) ? "<null>" : this.temp));
        sb.append(',');
        sb.append('\n');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null) ? "<null>" : this.feelsLike));
        sb.append(',');
        sb.append('\n');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null) ? "<null>" : this.condition));
        sb.append(',');
        sb.append('\n');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null) ? "<null>" : this.windSpeed));
        sb.append(',');
        sb.append('\n');
        sb.append("windGust");
        sb.append('=');
        sb.append(((this.windGust == null) ? "<null>" : this.windGust));
        sb.append(',');
        sb.append('\n');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null) ? "<null>" : this.windDir));
        sb.append(',');
        sb.append('\n');
        sb.append("pressureMm");
        sb.append('=');
        sb.append(((this.pressureMm == null) ? "<null>" : this.pressureMm));
        sb.append(',');
        sb.append('\n');
        sb.append("pressurePa");
        sb.append('=');
        sb.append(((this.pressurePa == null) ? "<null>" : this.pressurePa));
        sb.append(',');
        sb.append('\n');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null) ? "<null>" : this.humidity));
        sb.append(',');
        sb.append('\n');
        sb.append("daytime");
        sb.append('=');
        sb.append(((this.daytime == null) ? "<null>" : this.daytime));
        sb.append(',');
        sb.append('\n');
        sb.append("polar");
        sb.append('=');
        sb.append(((this.polar == null) ? "<null>" : this.polar));
        sb.append(',');
        sb.append('\n');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null) ? "<null>" : this.season));
        sb.append(',');
        sb.append('\n');
        return sb.toString();
    }

}

class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_ts")
    @Expose
    private Integer dateTs;
    @SerializedName("week")
    @Expose
    private Integer week;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("moon_code")
    @Expose
    private Integer moonCode;
    @SerializedName("moon_text")
    @Expose
    private String moonText;
    @SerializedName("parts")
    @Expose(serialize = false,deserialize = false)
    private JsonArray parts = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDateTs() {
        return dateTs;
    }

    public void setDateTs(Integer dateTs) {
        this.dateTs = dateTs;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(Integer moonCode) {
        this.moonCode = moonCode;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public JsonArray getParts() {
        return parts;
    }

    public void setParts(JsonArray parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Forecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null) ? "<null>" : this.date));
        sb.append(',');
        sb.append("dateTs");
        sb.append('=');
        sb.append(((this.dateTs == null) ? "<null>" : this.dateTs));
        sb.append(',');
        sb.append("week");
        sb.append('=');
        sb.append(((this.week == null) ? "<null>" : this.week));
        sb.append(',');
        sb.append("sunrise");
        sb.append('=');
        sb.append(((this.sunrise == null) ? "<null>" : this.sunrise));
        sb.append(',');
        sb.append("sunset");
        sb.append('=');
        sb.append(((this.sunset == null) ? "<null>" : this.sunset));
        sb.append(',');
        sb.append("moonCode");
        sb.append('=');
        sb.append(((this.moonCode == null) ? "<null>" : this.moonCode));
        sb.append(',');
        sb.append("moonText");
        sb.append('=');
        sb.append(((this.moonText == null) ? "<null>" : this.moonText));
        sb.append(',');
        sb.append("parts");
        sb.append('=');
        sb.append(((this.parts == null) ? "<null>" : this.parts));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

class Info {

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("url")
    @Expose
    private String url;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null) ? "<null>" : this.lat));
        sb.append(',');
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null) ? "<null>" : this.lon));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

class Part {

    @SerializedName("part_name")
    @Expose
    private String partName;
    @SerializedName("temp_min")
    @Expose
    private Integer tempMin;
    @SerializedName("temp_max")
    @Expose
    private Integer tempMax;
    @SerializedName("temp_avg")
    @Expose
    private Integer tempAvg;
    @SerializedName("feels_like")
    @Expose
    private Integer feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("daytime")
    @Expose
    private String daytime;
    @SerializedName("polar")
    @Expose
    private Boolean polar;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_gust")
    @Expose
    private Integer windGust;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mm")
    @Expose
    private Integer pressureMm;
    @SerializedName("pressure_pa")
    @Expose
    private Integer pressurePa;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("prec_mm")
    @Expose
    private Integer precMm;
    @SerializedName("prec_period")
    @Expose
    private Integer precPeriod;
    @SerializedName("prec_prob")
    @Expose
    private Integer precProb;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getTempMin() {
        return tempMin;
    }

    public void setTempMin(Integer tempMin) {
        this.tempMin = tempMin;
    }

    public Integer getTempMax() {
        return tempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getTempAvg() {
        return tempAvg;
    }

    public void setTempAvg(Integer tempAvg) {
        this.tempAvg = tempAvg;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Boolean getPolar() {
        return polar;
    }

    public void setPolar(Boolean polar) {
        this.polar = polar;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindGust() {
        return windGust;
    }

    public void setWindGust(Integer windGust) {
        this.windGust = windGust;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(Integer pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Integer getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(Integer pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getPrecMm() {
        return precMm;
    }

    public void setPrecMm(Integer precMm) {
        this.precMm = precMm;
    }

    public Integer getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(Integer precPeriod) {
        this.precPeriod = precPeriod;
    }

    public Integer getPrecProb() {
        return precProb;
    }

    public void setPrecProb(Integer precProb) {
        this.precProb = precProb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Part.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partName");
        sb.append('=');
        sb.append(((this.partName == null) ? "<null>" : this.partName));
        sb.append(',');
        sb.append("tempMin");
        sb.append('=');
        sb.append(((this.tempMin == null) ? "<null>" : this.tempMin));
        sb.append(',');
        sb.append("tempMax");
        sb.append('=');
        sb.append(((this.tempMax == null) ? "<null>" : this.tempMax));
        sb.append(',');
        sb.append("tempAvg");
        sb.append('=');
        sb.append(((this.tempAvg == null) ? "<null>" : this.tempAvg));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null) ? "<null>" : this.feelsLike));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null) ? "<null>" : this.icon));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null) ? "<null>" : this.condition));
        sb.append(',');
        sb.append("daytime");
        sb.append('=');
        sb.append(((this.daytime == null) ? "<null>" : this.daytime));
        sb.append(',');
        sb.append("polar");
        sb.append('=');
        sb.append(((this.polar == null) ? "<null>" : this.polar));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null) ? "<null>" : this.windSpeed));
        sb.append(',');
        sb.append("windGust");
        sb.append('=');
        sb.append(((this.windGust == null) ? "<null>" : this.windGust));
        sb.append(',');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null) ? "<null>" : this.windDir));
        sb.append(',');
        sb.append("pressureMm");
        sb.append('=');
        sb.append(((this.pressureMm == null) ? "<null>" : this.pressureMm));
        sb.append(',');
        sb.append("pressurePa");
        sb.append('=');
        sb.append(((this.pressurePa == null) ? "<null>" : this.pressurePa));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null) ? "<null>" : this.humidity));
        sb.append(',');
        sb.append("precMm");
        sb.append('=');
        sb.append(((this.precMm == null) ? "<null>" : this.precMm));
        sb.append(',');
        sb.append("precPeriod");
        sb.append('=');
        sb.append(((this.precPeriod == null) ? "<null>" : this.precPeriod));
        sb.append(',');
        sb.append("precProb");
        sb.append('=');
        sb.append(((this.precProb == null) ? "<null>" : this.precProb));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}