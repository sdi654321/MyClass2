package com.example.dongikshin.myclass1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart()호출됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String name = data.getStringExtra("name");
        Toast.makeText(getApplicationContext(),"새 화면에서 전달받은 데이터" + name , Toast.LENGTH_LONG).show();
    }

    public void onButton1Clicked(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http//m.naver.com"));
        startActivity(intent);
    }
    public void onButton2Clicked(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01024499909"));
        startActivity(intent);
    }

    public void onButton5Clicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), NewActivity.class);
        intent.putExtra("loginName","Mike");
       User.Name ="My mike";
        startActivityForResult(intent, 1);
    }

}
