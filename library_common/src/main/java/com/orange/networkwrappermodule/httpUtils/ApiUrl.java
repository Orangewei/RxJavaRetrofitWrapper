package com.orange.networkwrappermodule.httpUtils;

import com.orange.networkwrappermodule.common.Url;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 *Retrofit请求服务
 */
public interface ApiUrl {
    @GET(Url.NEWSURL)
    Call<Object> getData();
    @POST(Url.BWURL)
    Call<Object> postData(@Body String params);
}
