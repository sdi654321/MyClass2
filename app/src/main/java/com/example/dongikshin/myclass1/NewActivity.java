package com.example.dongikshin.myclass1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        if(intent !=null){
            String loginnames = intent.getStringExtra("loginName");
            Toast.makeText(getApplicationContext(),"전달받은 데이터."+ loginnames, Toast.LENGTH_LONG).show();
        }
        Toast.makeText(getApplicationContext(),"user 안의 이름"+ User.Name, Toast.LENGTH_LONG).show();

    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(),"돌아가기 버튼이 눌림", Toast.LENGTH_LONG).show();

        Intent intent = new Intent();
        intent.putExtra("name","john");
        setResult(1, intent);
        finish();

    }


}
