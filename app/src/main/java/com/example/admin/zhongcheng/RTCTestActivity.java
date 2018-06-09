package com.example.admin.zhongcheng;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RTCTestActivity extends Activity implements OnClickListener {
    public static String wifi;
    private Button btn_pass, btn_fail,btn_notest;
    public static EditText editText;
    int flag = 0;
    int a;
    String tag;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            a = savedInstanceState.getInt("MyInt");
            if (a == 0) {
                btn_fail.setBackgroundColor(Color.RED);
                btn_pass.setBackgroundColor(Color.GRAY);
                if (a == 1) {
                    btn_pass.setBackgroundColor(Color.GREEN);
                    btn_fail.setBackgroundColor(Color.GRAY);

                }

            }

        }


        setContentView(R.layout.rtctest_result);

        btn_pass = findViewById(R.id.btn_pass);
        editText=(EditText)findViewById(R.id.result_text);

        btn_pass.setOnClickListener(this);
        btn_fail = findViewById(R.id.btn_fail);
        btn_fail.setOnClickListener(this);
        btn_notest=findViewById(R.id.btn_notest);
        btn_notest.setOnClickListener(this);
        SharedPreferences prf = getSharedPreferences("tag",MODE_PRIVATE);
        String content = prf.getString("RTC测试", "");
        editText.setText(content);
        int tag=prf.getInt("tag_rtc",6);
        if (tag==1){
            btn_pass.setBackgroundColor(Color.GREEN);
            btn_fail.setBackgroundColor(Color.GRAY);
            btn_notest.setBackgroundColor(Color.GRAY);

        }
        if (tag==0){

            btn_fail.setBackgroundColor(Color.RED);
            btn_pass.setBackgroundColor(Color.GRAY);
            btn_notest.setBackgroundColor(Color.GRAY);
        }
        if (tag==2){
            btn_fail.setBackgroundColor(Color.GRAY);
            btn_pass.setBackgroundColor(Color.GRAY);
            btn_notest.setBackgroundColor(Color.YELLOW);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pass:
                flag = 1;
                break;
            case R.id.btn_fail:
                flag = 0;
                break;
            case R.id.btn_notest:
                flag =2;
                break;
        }

        if (flag == 1) {
            btn_pass.setBackgroundColor( Color.GREEN );
            btn_fail.setBackgroundColor( Color.GRAY );
            btn_notest.setBackgroundColor( Color.GRAY );
            editText.setText("PASS");
            finish();
        }

        if (flag == 0) {
            btn_fail.setBackgroundColor(Color.RED);
            btn_pass.setBackgroundColor(Color.GRAY);
            btn_notest.setBackgroundColor( Color.GRAY );
            editText.setText("FAIL");
            finish();
        }

        if (flag==2){
            btn_fail.setBackgroundColor( Color.GRAY );
            btn_pass.setBackgroundColor( Color.GRAY );
            btn_notest.setBackgroundColor( Color.YELLOW );
            editText.setText("No Test");
            finish();
        }
    wifi=editText.getText().toString();
        SharedPreferences.Editor editor = getSharedPreferences("tag",MODE_PRIVATE).edit();
        editor.putString("RTC测试", editText.getText().toString());
        editor.putInt("tag_rtc",flag);
        editor.commit();

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // 保存savedInstanceState的UI的状态改变
        //  如果这个进程被杀死、重新打开，这个包将被传递给onCreate
        //savedInstanceState.putBoolean("MyBoolean", true);
        //savedInstanceState.putDouble("myDouble", 1.9);
        savedInstanceState.putInt("MyInt", 0);
        //savedInstanceState.putString("MyString", "Welcome back to Android");
        // 等等
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // 从savedInstanceState中重新打开UI状态
        // 这个包已经被传递给了onCreate
        //boolean myBoolean = savedInstanceState.getBoolean("MyBoolean");
        //double myDouble = savedInstanceState.getDouble("myDouble");
        int a = savedInstanceState.getInt("MyInt");
        // String myString = savedInstanceState.getString("MyString");


    }



}





