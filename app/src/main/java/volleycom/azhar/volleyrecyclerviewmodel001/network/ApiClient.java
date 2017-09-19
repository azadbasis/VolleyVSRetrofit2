package volleycom.azhar.volleyrecyclerviewmodel001.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Azhar on 9/18/2017.
 */

public class ApiClient {

    //public static final String BASE_URL = "http://shaoniiuc.com/";
   // public static final String BASE_URL = "https://jsonplaceholder.typicode.com/posts/1/comments";
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getRetrofit() {
        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }


}
