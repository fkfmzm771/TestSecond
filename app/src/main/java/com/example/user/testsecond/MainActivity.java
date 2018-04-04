package com.example.user.testsecond;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText et01;//전역변수선언
    Button bt01,bt02;
    TextView tv01;
    Context c;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = this;

        et01=(EditText)findViewById(R.id.et01);//전역변수생성
        bt01=(Button) findViewById(R.id.bt01);
        bt02=(Button) findViewById(R.id.bt02);
        bt01.setOnClickListener(oc);
        bt02.setOnClickListener(oc02);
        tv01=(TextView) findViewById(R.id.tv01);


    }
    View.OnClickListener oc = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            st =et01.getText().toString();
            tv01.setText(st);
        }
    };
    View.OnClickListener oc02 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            startActivity(new Intent(c,SActivity.class));
//            Intent i = new Intent(getApplicationContext(),SActivity.class);이렇게 하면 c를 쓰지않고 context를 불러올 수 있다.
            Intent i = new Intent(c,SActivity.class);
            i.putExtra("1", st);//인텐트로 넘어간 값을 저장해준다
            i.putExtra("2", tv01.getText().toString());
            startActivity(i);
        }
    };


    @Override
    protected void onStart() {
        super.onStart();
//        Log.e("!!!", "onStart");
        et01.setText("EditText");
        bt01.setText("Button");
        bt02.setText("Button02");
        tv01.setText("TextView");
    }
}
