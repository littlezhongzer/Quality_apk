package com.example.admin.zhongcheng;

import android.app.Activity;

/**
 * Created by admin on 2018/5/3.
 */



import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    private static final String TAG = "savefileactivity";
    final static int COUNTS = 3;// 点击次数
    final static long DURATION = 1000;// 规定有效时间
    long[] mHits = new long[COUNTS];
    private Button btn_AIUIinterface, btn_androidinterface, btn_bluetoothswitch, btn_boottimes, btn_bootup, btn_ethernetconnect,
            btn_ethernetswitch, btn_findbluetooth, btn_ididentify, btn_longprinter, btn_photo, btn_powerinterface, btn_printer,
            btn_record, btn_robotstudioconnect, btn_robotstudioultrasound, btn_rosaction, btn_rosconnect, btn_rostestconnect,
            btn_rostestforward, btn_rostestrotate, btn_rtc, btn_screentest, btn_screentouch, btn_shutdown, btn_slrostestconnect,
            btn_slrostestforward, btn_slrostestrotate, btn_slrosteststate, btn_softwareversion, btn_speakernormalvolume, btn_speakertouchvolume,
            btn_stop, btn_threed, btn_ultrasound, btn_video, btn_wakeupangle, btn_wifi, btn_wlanswitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        TextView textview = (TextView) LayoutInflater.from(MainActivity.this).inflate(R.layout.video_result, null).findViewById(R.id.result_text);
        findViewById(R.id.btn_result).setOnClickListener(this);
        findViewById(R.id.btn_clear).setOnClickListener(this);
        btn_AIUIinterface = findViewById(R.id.btn_AIUIinterface);
        btn_AIUIinterface.setOnClickListener(this);

        btn_androidinterface = findViewById(R.id.btn_androidinterface);
        btn_androidinterface.setOnClickListener(this);

        btn_bluetoothswitch = findViewById(R.id.btn_bluetoothswitch);
        btn_bluetoothswitch.setOnClickListener(this);

        btn_boottimes = findViewById(R.id.btn_boottimes);
        btn_boottimes.setOnClickListener(this);

        btn_bootup = findViewById(R.id.btn_bootup);
        btn_bootup.setOnClickListener(this);

        btn_ethernetconnect = findViewById(R.id.btn_ethernetconnect);
        btn_ethernetconnect.setOnClickListener(this);

        btn_ethernetswitch = findViewById(R.id.btn_ethernetswitch);
        btn_ethernetswitch.setOnClickListener(this);

        btn_findbluetooth = findViewById(R.id.btn_findbluetooth);
        btn_findbluetooth.setOnClickListener(this);

        btn_ididentify = findViewById(R.id.btn_ididentify);
        btn_ididentify.setOnClickListener(this);

        btn_longprinter = findViewById(R.id.btn_longprinter);
        btn_longprinter.setOnClickListener(this);

        btn_photo = findViewById(R.id.btn_cp_photo);
        btn_photo.setOnClickListener(this);

        btn_powerinterface = findViewById(R.id.btn_powerinterface);
        btn_powerinterface.setOnClickListener(this);

        btn_printer = findViewById(R.id.btn_printer);
        btn_printer.setOnClickListener(this);

        btn_record = findViewById(R.id.btn_rcd);
        btn_record.setOnClickListener(this);

        btn_robotstudioconnect = findViewById(R.id.btn_robotstudioconnect);
        btn_robotstudioconnect.setOnClickListener(this);

        btn_robotstudioultrasound = findViewById(R.id.btn_robotstudioultrasound);
        btn_robotstudioultrasound.setOnClickListener(this);

        btn_rosaction = findViewById(R.id.btn_rosaction);
        btn_rosaction.setOnClickListener(this);

        btn_rosconnect = findViewById(R.id.btn_rosconnect);
        btn_rosconnect.setOnClickListener(this);

        btn_rostestconnect = findViewById(R.id.btn_rostestconnect);
        btn_rostestconnect.setOnClickListener(this);

        btn_rostestforward = findViewById(R.id.btn_rostestforward);
        btn_rostestforward.setOnClickListener(this);

        btn_rostestrotate = findViewById(R.id.btn_rostestrotate);
        btn_rostestrotate.setOnClickListener(this);

        btn_rtc = findViewById(R.id.btn_rtctest);
        btn_rtc.setOnClickListener(this);

        btn_screentest = findViewById(R.id.btn_screentest);
        btn_screentest.setOnClickListener(this);

        btn_screentouch = findViewById(R.id.btn_screentouchtest);
        btn_screentouch.setOnClickListener(this);

        btn_shutdown = findViewById(R.id.btn_shutdown);
        btn_shutdown.setOnClickListener(this);

        btn_slrostestconnect = findViewById(R.id.btn_slrostestconnect);
        btn_slrostestconnect.setOnClickListener(this);

        btn_slrostestforward = findViewById(R.id.btn_slrostestforward);
        btn_slrostestforward.setOnClickListener(this);

        btn_slrostestrotate = findViewById(R.id.btn_slrostestrotate);
        btn_slrostestrotate.setOnClickListener(this);

        btn_slrosteststate = findViewById(R.id.btn_slrosteststate);
        btn_slrosteststate.setOnClickListener(this);

        btn_softwareversion = findViewById(R.id.btn_softwareversion);
        btn_softwareversion.setOnClickListener(this);

        btn_speakernormalvolume = findViewById(R.id.btn_speakernormalvolume);
        btn_speakernormalvolume.setOnClickListener(this);

        btn_speakertouchvolume = findViewById(R.id.btn_speakertouchvolume);
        btn_speakertouchvolume.setOnClickListener(this);

        btn_stop = findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(this);

        btn_threed = findViewById(R.id.btn_threed);
        btn_threed.setOnClickListener(this);

        btn_ultrasound = findViewById(R.id.btn_ultrasound);
        btn_ultrasound.setOnClickListener(this);

        btn_video = findViewById(R.id.btn_cp_video);
        btn_video.setOnClickListener(this);

        btn_wakeupangle = findViewById(R.id.btn_AIUIwakeupangle);
        btn_wakeupangle.setOnClickListener(this);

        btn_wifi = findViewById(R.id.btn_wifi);
        btn_wifi.setOnClickListener(this);

        btn_wlanswitch = findViewById(R.id.btn_wlanswitch);
        btn_wlanswitch.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_cp_photo:
                startActivity(new Intent().setClass(this, PhotoActivity.class));
                break;
            case R.id.btn_cp_video:
                startActivity(new Intent().setClass(this, VideoActivity.class));
                break;
            case R.id.btn_wifi:
                startActivity(new Intent().setClass(this, WifiActivity.class));
                break;
            case R.id.btn_AIUIinterface:
                startActivity(new Intent().setClass(this, AIUIInterfaceActivity.class));
                break;
            case R.id.btn_rcd:
                startActivity(new Intent().setClass(this, RecordActivity.class));
                break;
            case R.id.btn_result:
                startActivity(new Intent().setClass(this, SavefileActivity.class));
                break;
            case R.id.btn_clear:
                continuesClick(COUNTS, DURATION);
                break;
            case R.id.btn_androidinterface:
                startActivity(new Intent().setClass(this, AndroidInterfaceActivity.class));
                break;
            case R.id.btn_bluetoothswitch:
                startActivity(new Intent().setClass(this, BluetoothSwitchActivity.class));
                break;
            case R.id.btn_boottimes:
                startActivity(new Intent().setClass(this, BootTimesActivity.class));
                break;
            case R.id.btn_bootup:
                startActivity(new Intent().setClass(this, BootUpActivity.class));
                break;
            case R.id.btn_ethernetconnect:
                startActivity(new Intent().setClass(this, EthernetConnectActivity.class));
                break;
            case R.id.btn_ethernetswitch:
                startActivity(new Intent().setClass(this, EthernetSwitchActivity.class));
                break;
            case R.id.btn_findbluetooth:
                startActivity(new Intent().setClass(this, FindBluetoothActivity.class));
                break;
            case R.id.btn_ididentify:
                startActivity(new Intent().setClass(this, IDIdentifyActivity.class));
                break;
            case R.id.btn_longprinter:
                startActivity(new Intent().setClass(this, LongPrinterActivity.class));
                break;
            case R.id.btn_powerinterface:
                startActivity(new Intent().setClass(this, PowerInterfaceActivity.class));
                break;
            case R.id.btn_printer:
                startActivity(new Intent().setClass(this, PrinterActivity.class));
                break;
            case R.id.btn_robotstudioconnect:
                startActivity(new Intent().setClass(this, RobotStudioConnectActivity.class));
                break;
            case R.id.btn_robotstudioultrasound:
                startActivity(new Intent().setClass(this, RobotStudioUltrasoundActivity.class));
                break;
            case R.id.btn_rosaction:
                startActivity(new Intent().setClass(this, ROSActionActivity.class));
                break;
            case R.id.btn_rosconnect:
                startActivity(new Intent().setClass(this, ROSConnectActivity.class));
                break;
            case R.id.btn_rostestconnect:
                startActivity(new Intent().setClass(this, RosTestConnectActivity.class));
                break;
            case R.id.btn_rostestforward:
                startActivity(new Intent().setClass(this, RosTestForwardActivity.class));
                break;
            case R.id.btn_rostestrotate:
                startActivity(new Intent().setClass(this, RosTestRotateActivity.class));
                break;
            case R.id.btn_rtctest:
                startActivity(new Intent().setClass(this, RTCTestActivity.class));
                break;
            case R.id.btn_screentest:
                startActivity(new Intent().setClass(this, ScreenTestActivity.class));
                break;
            case R.id.btn_screentouchtest:
                startActivity(new Intent().setClass(this, ScreenTouchActivity.class));
                break;
            case R.id.btn_shutdown:
                startActivity(new Intent().setClass(this, ShutDownActivity.class));
                break;
            case R.id.btn_slrostestconnect:
                startActivity(new Intent().setClass(this, SLRosTestConnectActivity.class));
                break;
            case R.id.btn_slrostestforward:
                startActivity(new Intent().setClass(this, SLRosTestForwardActivity.class));
                break;
            case R.id.btn_slrostestrotate:
                startActivity(new Intent().setClass(this, SLRosTestRotateActivity.class));
                break;
            case R.id.btn_slrosteststate:
                startActivity(new Intent().setClass(this, SLRosTestStateActivity.class));
                break;
            case R.id.btn_softwareversion:
                startActivity(new Intent().setClass(this, SoftwareVersionActivity.class));
                break;
            case R.id.btn_speakernormalvolume:
                startActivity(new Intent().setClass(this, SpeakerNormalVolumeActivity.class));
                break;
            case R.id.btn_speakertouchvolume:
                startActivity(new Intent().setClass(this, SpeakerTouchVolumeActivity.class));
                break;
            case R.id.btn_stop:
                startActivity(new Intent().setClass(this, StopActivity.class));
                break;
            case R.id.btn_threed:
                startActivity(new Intent().setClass(this, ThreeDActivity.class));
                break;
            case R.id.btn_ultrasound:
                startActivity(new Intent().setClass(this, UltrasoundActivity.class));
                break;
            case R.id.btn_AIUIwakeupangle:
                startActivity(new Intent().setClass(this, WakeupAngleActivity.class));
                break;
            case R.id.btn_wlanswitch:
                startActivity(new Intent().setClass(this, WlanSwitchActivity.class));
                break;
        }
    }
    private void continuesClick(int count, long time) {

        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = SystemClock.uptimeMillis();
        if (mHits[0] >= (SystemClock.uptimeMillis() - DURATION)) {
            mHits = new long[COUNTS];//重新初始化数组
            Toast.makeText(this, "连续点击了3次", Toast.LENGTH_LONG).show();
            startActivity(new Intent().setClass(this, ClearResultActivity.class));

        }
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){

        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("result",VideoActivity.video);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){

        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prf = getSharedPreferences("tag", MODE_PRIVATE);
        final int tag_aiuiinterface=prf.getInt("tag_aiuiinterface",6);

        if (tag_aiuiinterface==0){
            btn_AIUIinterface.setBackgroundColor(Color.RED);
        }else if (tag_aiuiinterface==1) {
            btn_AIUIinterface.setBackgroundColor(Color.GREEN);
        } else if (tag_aiuiinterface==2){
            btn_AIUIinterface.setBackgroundColor(Color.YELLOW);
        }else {
            btn_AIUIinterface.setBackgroundColor(Color.LTGRAY);
        }




        final int tag_androidinterface=prf.getInt("tag_androidinterface",6);

        if (tag_androidinterface==0){
            btn_androidinterface.setBackgroundColor(Color.RED);
        }else if (tag_androidinterface==1) {
            btn_androidinterface.setBackgroundColor(Color.GREEN);
        } else if (tag_androidinterface==2){
            btn_androidinterface.setBackgroundColor(Color.YELLOW);
        } else {
            btn_androidinterface.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_bluetoothswitch=prf.getInt("tag_bluetoothswitch",6);

        if (tag_bluetoothswitch==0){
            btn_bluetoothswitch.setBackgroundColor(Color.RED);
        }else if (tag_bluetoothswitch==1) {
            btn_bluetoothswitch.setBackgroundColor(Color.GREEN);
        } else if(tag_bluetoothswitch==2){
            btn_bluetoothswitch.setBackgroundColor(Color.YELLOW);
        } else {
            btn_bluetoothswitch.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_boottimes=prf.getInt("tag_boottimes",6);

        if (tag_boottimes==0){
            btn_boottimes.setBackgroundColor(Color.RED);
        }else if (tag_boottimes==1) {
            btn_boottimes.setBackgroundColor(Color.GREEN);
        }else if (tag_boottimes==2){
            btn_boottimes.setBackgroundColor(Color.YELLOW);
        } else {
            btn_boottimes.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_bootup=prf.getInt("tag_bootup",6);

        if (tag_bootup==0){
            btn_bootup.setBackgroundColor(Color.RED);
        }else if (tag_bootup==1) {
            btn_bootup.setBackgroundColor(Color.GREEN);
        }else if (tag_bootup==2){
            btn_bootup.setBackgroundColor(Color.YELLOW);
        } else {
            btn_bootup.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_ethernetconnect=prf.getInt("tag_ethernetconnect",6);

        if (tag_ethernetconnect==0){
            btn_ethernetconnect.setBackgroundColor(Color.RED);
        }else if (tag_ethernetconnect==1) {
            btn_ethernetconnect.setBackgroundColor(Color.GREEN);
        }else if (tag_ethernetconnect==2){
            btn_ethernetconnect.setBackgroundColor(Color.YELLOW);
        } else {
            btn_ethernetconnect.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_ethernetswitch=prf.getInt("tag_ethernetswitch",6);
        if (tag_ethernetswitch==0){
            btn_ethernetswitch.setBackgroundColor(Color.RED);
        }else if (tag_ethernetswitch==1) {
            btn_ethernetswitch.setBackgroundColor(Color.GREEN);
        }else if (tag_ethernetswitch==2){
            btn_ethernetswitch.setBackgroundColor(Color.YELLOW);
        } else {
            btn_ethernetswitch.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_findbluetooth=prf.getInt("tag_findbluetooth",6);

        if (tag_findbluetooth==0){
            btn_findbluetooth.setBackgroundColor(Color.RED);
        }else if (tag_findbluetooth==1) {
            btn_findbluetooth.setBackgroundColor(Color.GREEN);
        }else if (tag_findbluetooth==2){
            btn_findbluetooth.setBackgroundColor(Color.YELLOW);
        } else {
            btn_findbluetooth.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_ididentify=prf.getInt("tag_ididentify",6);

        if (tag_ididentify==0){
            btn_ididentify.setBackgroundColor(Color.RED);
        }else if (tag_ididentify==1) {
            btn_ididentify.setBackgroundColor(Color.GREEN);
        }else if (tag_ididentify==2){
            btn_ididentify.setBackgroundColor(Color.YELLOW);
        } else {
            btn_ididentify.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_longprinter=prf.getInt("tag_longprinter",6);

        if (tag_longprinter==0){
            btn_longprinter.setBackgroundColor(Color.RED);
        }else if (tag_longprinter==1) {
            btn_longprinter.setBackgroundColor(Color.GREEN);
        }else if (tag_longprinter==2){
            btn_longprinter.setBackgroundColor(Color.YELLOW);
        } else {
            btn_longprinter.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_photo=prf.getInt("tag_photo",6);

        if (tag_photo==0){
            btn_photo.setBackgroundColor(Color.RED);
        }else if (tag_photo==1) {
            btn_photo.setBackgroundColor(Color.GREEN);
        }else if (tag_photo==2){
            btn_photo.setBackgroundColor(Color.YELLOW);
        } else {
            btn_photo.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_powerinterface=prf.getInt("tag_powerinterface",6);

        if (tag_powerinterface==0){
            btn_powerinterface.setBackgroundColor(Color.RED);
        }else if (tag_powerinterface==1) {
            btn_powerinterface.setBackgroundColor(Color.GREEN);
        }else if (tag_powerinterface==2){
            btn_powerinterface.setBackgroundColor(Color.YELLOW);
        } else {
            btn_powerinterface.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_printer=prf.getInt("tag_printer",6);

        if (tag_printer==0){
            btn_printer.setBackgroundColor(Color.RED);
        }else if (tag_printer==1) {
            btn_printer.setBackgroundColor(Color.GREEN);
        }else if (tag_printer==2){
            btn_printer.setBackgroundColor(Color.YELLOW);
        } else {
            btn_printer.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_record=prf.getInt("tag_record",6);

        if (tag_record==0){
            btn_record.setBackgroundColor(Color.RED);
        }else if (tag_record==1) {
            btn_record.setBackgroundColor(Color.GREEN);
        }else if (tag_record==2){
            btn_record.setBackgroundColor(Color.YELLOW);
        } else {
            btn_record.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_robotstudioconnect=prf.getInt("tag_robotstudioconnect",6);

        if (tag_robotstudioconnect==0){
            btn_robotstudioconnect.setBackgroundColor(Color.RED);
        }else if (tag_robotstudioconnect==1) {
            btn_robotstudioconnect.setBackgroundColor(Color.GREEN);
        }else if (tag_robotstudioconnect==2){
            btn_robotstudioconnect.setBackgroundColor(Color.YELLOW);
        } else {
            btn_robotstudioconnect.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_robotstudioultrasound=prf.getInt("tag_robotstudioultrasound",6);

        if (tag_robotstudioultrasound==0){
            btn_robotstudioultrasound.setBackgroundColor(Color.RED);
        }else if (tag_robotstudioultrasound==1) {
            btn_robotstudioultrasound.setBackgroundColor(Color.GREEN);
        }else if(tag_robotstudioultrasound==2){
            btn_robotstudioultrasound.setBackgroundColor(Color.YELLOW);
        } else {
            btn_robotstudioultrasound.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rosaction=prf.getInt("tag_rosaction",6);

        if (tag_rosaction==0){
            btn_rosaction.setBackgroundColor(Color.RED);
        }else if (tag_rosaction==1) {
            btn_rosaction.setBackgroundColor(Color.GREEN);
        }else if (tag_rosaction==2){
            btn_rosaction.setBackgroundColor(Color.YELLOW);
        } else {
            btn_rosaction.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rosconnect=prf.getInt("tag_rosconnect",6);

        if (tag_rosconnect==0){
            btn_rosconnect.setBackgroundColor(Color.RED);
        }else if (tag_rosconnect==1) {
            btn_rosconnect.setBackgroundColor(Color.GREEN);
        }else if (tag_rosconnect==2){
            btn_rosconnect.setBackgroundColor(Color.YELLOW);
        } else {
            btn_rosconnect.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rostestconnect=prf.getInt("tag_rostestconnect",6);

        if (tag_rostestconnect==0){
            btn_rostestconnect.setBackgroundColor(Color.RED);
        }else if (tag_rostestconnect==1) {
            btn_rostestconnect.setBackgroundColor(Color.GREEN);
        }else if (tag_rostestconnect==2){
            btn_rostestconnect.setBackgroundColor(Color.YELLOW);

        } else {
            btn_rostestconnect.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rostestforward=prf.getInt("tag_rostestforward",6);

        if (tag_rostestforward==0){
            btn_rostestforward.setBackgroundColor(Color.RED);
        }else if (tag_rostestforward==1) {
            btn_rostestforward.setBackgroundColor(Color.GREEN);
        }else if (tag_rostestforward==2){
            btn_rostestforward.setBackgroundColor(Color.YELLOW);
        } else {
            btn_rostestforward.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rostestrotate=prf.getInt("tag_rostestrotate",6);

        if (tag_rostestrotate==0){
            btn_rostestrotate.setBackgroundColor(Color.RED);
        }else if (tag_rostestrotate==1) {
            btn_rostestrotate.setBackgroundColor(Color.GREEN);
        }else if (tag_rostestrotate==2){
            btn_rostestrotate.setBackgroundColor(Color.YELLOW);
        } else {
            btn_rostestrotate.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_rtc=prf.getInt("tag_rtc",6);

        if (tag_rtc==0){
            btn_rtc.setBackgroundColor(Color.RED);
        }else if (tag_rtc==1) {
            btn_rtc.setBackgroundColor(Color.GREEN);
        }else if (tag_rtc==2){
            btn_rtc.setBackgroundColor(Color.YELLOW);
        } else {
            btn_rtc.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_screentest=prf.getInt("tag_screentest",6);

        if (tag_screentest==0){
            btn_screentest.setBackgroundColor(Color.RED);
        }else if (tag_screentest==1) {
            btn_screentest.setBackgroundColor(Color.GREEN);
        }else if (tag_screentest==2){
            btn_screentest.setBackgroundColor(Color.YELLOW);
        } else {
            btn_screentest.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_screentouch=prf.getInt("tag_screentouch",6);

        if (tag_screentouch==0){
            btn_screentouch.setBackgroundColor(Color.RED);
        }else if (tag_screentouch==1) {
            btn_screentouch.setBackgroundColor(Color.GREEN);
        }else if(tag_screentouch==2){
            btn_screentouch.setBackgroundColor(Color.YELLOW);
        } else {
            btn_screentouch.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_shutdown=prf.getInt("tag_shutdown",6);

        if (tag_shutdown==0){
            btn_shutdown.setBackgroundColor(Color.RED);
        }else if (tag_shutdown==1) {
            btn_shutdown.setBackgroundColor(Color.GREEN);
        }else if (tag_shutdown==2){
            btn_shutdown.setBackgroundColor(Color.YELLOW);
        } else {
            btn_shutdown.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_slrostestconnect=prf.getInt("tag_slrostestconnect",6);

        if (tag_slrostestconnect==0){
            btn_slrostestconnect.setBackgroundColor(Color.RED);
        }else if (tag_slrostestconnect==1) {
            btn_slrostestconnect.setBackgroundColor(Color.GREEN);
        }else if (tag_slrostestconnect==2){
            btn_slrostestconnect.setBackgroundColor(Color.YELLOW);
        } else {
            btn_slrostestconnect.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_slrostestforward=prf.getInt("tag_slrostestforward",6);

        if (tag_slrostestforward==0){
            btn_slrostestforward.setBackgroundColor(Color.RED);
        }else if (tag_slrostestforward==1) {
            btn_slrostestforward.setBackgroundColor(Color.GREEN);
        }else if (tag_slrostestforward==2){
            btn_slrostestforward.setBackgroundColor(Color.YELLOW);
        } else {
            btn_slrostestforward.setBackgroundColor(Color.LTGRAY);
        }




        final int tag_slrostestrotate=prf.getInt("tag_slrostestrotate",6);

        if (tag_slrostestrotate==0){
            btn_slrostestrotate.setBackgroundColor(Color.RED);
        }else if (tag_slrostestrotate==1) {
            btn_slrostestrotate.setBackgroundColor(Color.GREEN);
        }else if (tag_slrostestrotate==2){
            btn_slrostestrotate.setBackgroundColor(Color.YELLOW);
        } else {
            btn_slrostestrotate.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_slrosteststate=prf.getInt("tag_slrosteststate",6);

        if (tag_slrosteststate==0){
            btn_slrosteststate.setBackgroundColor(Color.RED);
        }else if (tag_slrosteststate==1) {
            btn_slrosteststate.setBackgroundColor(Color.GREEN);
        }else if (tag_slrosteststate==2){
            btn_slrosteststate.setBackgroundColor(Color.YELLOW);
        } else {
            btn_slrosteststate.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_softwareversion=prf.getInt("tag_softwareversion",6);

        if (tag_softwareversion==0){
            btn_softwareversion.setBackgroundColor(Color.RED);
        }else if (tag_softwareversion==1) {
            btn_softwareversion.setBackgroundColor(Color.GREEN);
        }else if (tag_softwareversion==2){
            btn_softwareversion.setBackgroundColor(Color.YELLOW);
        } else {
            btn_softwareversion.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_speakernormalvolume=prf.getInt("tag_speakernormalvolume",6);

        if (tag_speakernormalvolume==0){
            btn_speakernormalvolume.setBackgroundColor(Color.RED);
        }else if (tag_speakernormalvolume==1) {
            btn_speakernormalvolume.setBackgroundColor(Color.GREEN);
        }else if (tag_speakernormalvolume==2){
            btn_speakernormalvolume.setBackgroundColor(Color.YELLOW);
        } else {
            btn_speakernormalvolume.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_speakertouchvolume=prf.getInt("tag_speakertouchvolume",6);

        if (tag_speakertouchvolume==0){
            btn_speakertouchvolume.setBackgroundColor(Color.RED);
        }else if (tag_speakertouchvolume==1) {
            btn_speakertouchvolume.setBackgroundColor(Color.GREEN);
        }else if (tag_speakertouchvolume==2){
            btn_speakertouchvolume.setBackgroundColor(Color.YELLOW);
        } else {
            btn_speakertouchvolume.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_stop=prf.getInt("tag_stop",6);

        if (tag_stop==0){
            btn_stop.setBackgroundColor(Color.RED);
        }else if (tag_stop==1) {
            btn_stop.setBackgroundColor(Color.GREEN);
        }else if (tag_stop==2){
            btn_stop.setBackgroundColor(Color.YELLOW);
        } else {
            btn_stop.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_threed=prf.getInt("tag_threed",6);

        if (tag_threed==0){
            btn_threed.setBackgroundColor(Color.RED);
        }else if (tag_threed==1) {
            btn_threed.setBackgroundColor(Color.GREEN);
        }else if (tag_threed==2){
            btn_threed.setBackgroundColor(Color.YELLOW);
        } else {
            btn_threed.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_ultrasound=prf.getInt("tag_ultrasound",6);

        if (tag_ultrasound==0){
            btn_ultrasound.setBackgroundColor(Color.RED);
        }else if (tag_ultrasound==1) {
            btn_ultrasound.setBackgroundColor(Color.GREEN);
        }else if (tag_ultrasound==2){
            btn_ultrasound.setBackgroundColor(Color.YELLOW);
        } else {
            btn_ultrasound.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_video=prf.getInt("tag_video",6);

        if (tag_video==0){
            btn_video.setBackgroundColor(Color.RED);
        }else if (tag_video==1) {
            btn_video.setBackgroundColor(Color.GREEN);
        }else if (tag_video==2){
            btn_video.setBackgroundColor(Color.YELLOW);
        } else {
            btn_video.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_wakeupangle=prf.getInt("tag_wakeupangle",6);

        if (tag_wakeupangle==0){
            btn_wakeupangle.setBackgroundColor(Color.RED);
        }else if (tag_wakeupangle==1) {
            btn_wakeupangle.setBackgroundColor(Color.GREEN);
        }else if (tag_wakeupangle==2){
            btn_wakeupangle.setBackgroundColor(Color.YELLOW);
        } else {
            btn_wakeupangle.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_wifi=prf.getInt("tag_wifi",6);

        if (tag_wifi==0){
            btn_wifi.setBackgroundColor(Color.RED);
        }else if (tag_wifi==1) {
            btn_wifi.setBackgroundColor(Color.GREEN);
        }else if (tag_wifi==2){
            btn_wifi.setBackgroundColor(Color.YELLOW);
        } else {
            btn_wifi.setBackgroundColor(Color.LTGRAY);
        }



        final int tag_wlanswitch=prf.getInt("tag_wlanswitch",6);

        if (tag_wlanswitch==0){
            btn_wlanswitch.setBackgroundColor(Color.RED);
        }else if (tag_wlanswitch==1) {
            btn_wlanswitch.setBackgroundColor(Color.GREEN);
        }else if (tag_wlanswitch==2){
            btn_wlanswitch.setBackgroundColor(Color.YELLOW);
        } else {
            btn_wlanswitch.setBackgroundColor(Color.LTGRAY);
        }
    }
}











