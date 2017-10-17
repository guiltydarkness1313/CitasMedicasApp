package com.shibuyaxpress.citasmedicasapp.interfaces;

import com.shibuyaxpress.citasmedicasapp.models.Usuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by paulf on 16-Oct-17.
 */

public interface Api {
    //@GET("val.php?usu={username}&pass={password}")
    @GET("val.php")
    Call<List<Usuarios>>authenticate(@Query("usu") String username, @Query("pass") String password);

}
