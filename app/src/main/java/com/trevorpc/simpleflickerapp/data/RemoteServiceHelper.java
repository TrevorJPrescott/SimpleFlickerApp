package com.trevorpc.simpleflickerapp.data;


import android.util.Log;

import com.trevorpc.simpleflickerapp.Constants;
import com.trevorpc.simpleflickerapp.models.FlickerImage;

import javax.inject.Inject;

import io.reactivex.Single;
import retrofit2.Retrofit;

import static com.trevorpc.simpleflickerapp.Constants.BASE_URL;

public class RemoteServiceHelper {

    @Inject
    public RemoteServiceHelper() {
    }


   private Retrofit getRetrofit(String tag)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL+tag)
                .build();
        Log.d("TAG", "retrofit: " + BASE_URL+tag );
        return retrofit;
    }


    public Single<FlickerImage> getFlickerImage(String tag) {
        Retrofit retrofit = getRetrofit(tag);
        RemoteService service = retrofit.create(RemoteService.class);
        return service.getFlickerImage(tag);
    }


}
