package com.orange.module_main;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.orange.networkwrappermodule.TestClass;
import com.orange.networkwrappermodule.common.Url;
import com.orange.networkwrappermodule.httpUtils.ApiUrl;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MainActivity.class.getSimpleName(),"onCreate");
        Toast.makeText(this, getTaskId()+"",Toast.LENGTH_LONG).show();

        findViewById(R.id.bt_http).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
    }

    private void initData() {
 /*       Retrofit retrofit=new Retrofit.Builder().baseUrl(Url.BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
        ApiUrl api=retrofit.create(ApiUrl.class);
        Call<Object> rsp=api.getData();
        rsp.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                Log.e(TestClass.class.getSimpleName(),response.body().toString());
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                Log.e(TestClass.class.getSimpleName(),"失败了"+t.getMessage());
            }
        });*/
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,BActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("aa","valueaa");
        bundle.putString("bb","valuebb");
        intent.putExtras(bundle);
        startActivityForResult(intent,00);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==00){
            Toast.makeText(this,"回来了",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.class.getSimpleName(),"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.class.getSimpleName(),"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivity.class.getSimpleName(),"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MainActivity.class.getSimpleName(),"onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MainActivity.class.getSimpleName(),"onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MainActivity.class.getSimpleName(),"onDestroy");

    }
}
