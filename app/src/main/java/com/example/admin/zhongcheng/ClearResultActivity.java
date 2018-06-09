package com.example.admin.zhongcheng;

/**
 * Created by admin on 2018/5/8.
 */

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.io.File;




public class ClearResultActivity extends Activity {

    private static final String TAG = "savefileactivity";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        File file = new File("/mnt/sdcard/test.xml");//创建文件
        File shared_prefs = new File("/data/data/con.example.admin.zhongcheng/shared_prefs/tag.xml");
        if (!file.exists()) {

            Toast.makeText(this, "清除成功！", Toast.LENGTH_SHORT).show();
            // TODO Auto-generated catch block

        } else {

            file.delete();
            Toast.makeText(this, "清除成功！", Toast.LENGTH_SHORT).show();

            // TODO Auto-generated catch block

        }

        SharedPreferences prf = getSharedPreferences("tag", MODE_PRIVATE);
        SharedPreferences.Editor edit_c=prf.edit();
        edit_c.clear();
        edit_c.commit();

        // Intent intent=getIntent();
        // Bundle bundle=intent.getBundleExtra("data");


        //  String name=bundle.getString("name");
        // String result=bundle.getString("result");
        //Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();


        //file.delete();//删除文件
        //PhotoActivity.editText.setText("null");
        //  RecordActivity.editText.setText("null");
        //  VideoActivity.editText.setText("null");
        //  WifiActivity.editText.setText("null");

        finish();
    }



}