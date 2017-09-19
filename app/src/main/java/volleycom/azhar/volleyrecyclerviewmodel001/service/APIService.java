package volleycom.azhar.volleyrecyclerviewmodel001.service;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import volleycom.azhar.volleyrecyclerviewmodel001.model.Employee;

/**
 * Created by Azhar on 9/18/2017.
 */

public interface APIService {

    @GET("posts/1/comments")
    Call<List<Employee>> getUserData();

}
