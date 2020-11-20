package com.example.latestnewsapp;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.latestnewsapp.database.DbAccessObj;
public class LoginActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName() ;
    public static final String MYPREFS = "myprefs";
    public static final String NAMEKEY = "namekey";
    public static final String PWDKEY = "pwdkey";
    DbAccessObj dbAccessObj;
    EditText nameEditText,pwdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.i(TAG,"onCreate");
        nameEditText =  findViewById(R.id.editTextName);
        pwdEditText = findViewById(R.id.editTextPwd);
        dbAccessObj = new DbAccessObj(this);
        dbAccessObj.openDb();
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
                getCredentials();
                break;
            case R.id.buttonput:
                String title = nameEditText.getText().toString();
                String subtitle = pwdEditText.getText().toString();
                if(!title.isEmpty()) {
                    dbAccessObj.createRow(title, subtitle);
                }
                else{
                    Toast.makeText(this, "Kindly Enter Username & Password", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
