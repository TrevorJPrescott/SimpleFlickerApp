package com.trevorpc.simpleflickerapp.data;

import com.trevorpc.simpleflickerapp.models.FlickerImage;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RemoteService {
    @GET("dog")
    Single<FlickerImage> getFlickerImage(@Query("tag") String tag);
}
