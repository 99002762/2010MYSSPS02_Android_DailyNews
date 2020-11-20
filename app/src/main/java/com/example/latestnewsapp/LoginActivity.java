package com.example.latestnewsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.latestnewsapp.database.DbAccessObj;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;


    DbAccessObj dbAccessObj;
    EditText nameEditText,pwdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.i(TAG,"onCreate");



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onstop");

    }

    public void clickHandler(View view) {
        Log.e(TAG,"clickHandler");

        switch (view.getId()){
            case R.id.buttonlogin:

                break;
            case R.id.buttonput:

                break;

        }
    }

    private void startHome() {
        Intent hIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(hIntent);
    }


    public void handleDb(View view) {

    }




}

