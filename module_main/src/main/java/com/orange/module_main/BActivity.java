package com.orange.module_main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * 测试activity
 */
public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Log.e(BActivity.class.getSimpleName(),"onCreate");
        Toast.makeText(this, getTaskId()+"",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(BActivity.class.getSimpleName(),"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(BActivity.class.getSimpleName(),"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(BActivity.class.getSimpleName(),"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(BActivity.class.getSimpleName(),"onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(BActivity.class.getSimpleName(),"onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(BActivity.class.getSimpleName(),"onDestroy");

    }
}
