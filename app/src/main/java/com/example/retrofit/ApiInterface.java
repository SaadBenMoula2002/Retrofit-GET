package com.example.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //@GET("posts/1")
    // public Call<Post> getPost ();

    //@GET("posts/id")
    // public Call<Post> getPost (@Path("id") int postId);

    @GET("posts")
    public Call<List<Post>> getPost (@Query("userId") String userId);

}
