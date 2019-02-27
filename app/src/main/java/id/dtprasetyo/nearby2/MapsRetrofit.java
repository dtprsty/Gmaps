package id.dtprasetyo.nearby2;

import id.dtprasetyo.nearby2.model.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MapsRetrofit {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json")
    Call<Example> getNearbyPlaces(@Query("sensor") String sensor, @Query("key") String key, @Query("type") String type, @Query(value = "location", encoded = true) String location, @Query("radius") int radius);

}
