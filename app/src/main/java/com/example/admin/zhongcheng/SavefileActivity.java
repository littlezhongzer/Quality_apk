package com.example.admin.zhongcheng;

/**
 * Created by admin on 2018/5/8.
 */
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.WildcardType;
import java.util.List;


public class  SavefileActivity  extends Activity {
    private static final String TAG = "savefileactivity";
    private File file;

    String str0 = "拍照";
    String str1 = "摄像";
    String str2 = "录音";
    String str3 = "Wifi";
    String str4 = "Wifi开关测试";
    String str5 = "EAI手机app检测超声波状态";
    String str6 = "AIUI接口测试";
    String str7 = "AIUI唤醒角度测试";
    String str8 = "android接口测试";
    String str9 = "蓝牙开关";
    String str10 = "开机时间";
    String str11 = "开机";
    String str12 = "有线连接";
    String str13 = "有线开关";
    String str14 = "蓝牙可被检测";
    String str15 = "身份证识别";
    String str16 = "长时间调用打印";
    String str17 = "电源接口";
    String str18 = "打印机";
    String str19 = "RobotStudio底盘连接";
    String str20 = "RobotStudio超声波检测";
    String str21 = "手机app检测EAI底盘动作";
    String str22 = "手机app连接EAI底盘";
    String str23 = "ROS-TEST连接底盘";
    String str24 = "ROS-TEST前进后退底盘";
    String str25 = "ROS-TEST旋转底盘";
    String str26 = "RTC测试";
    String str27 = "屏幕显示";
    String str28 = "屏幕触摸点测试";
    String str29= "关机";
    String str30 = "ROS-TEST连接SLAM底盘";
    String str31 = "ROS-TEST前进后退SLAM底盘";
    String str32 = "ROS-TEST旋转SLAM底盘";
    String str33 = "ROS-TEST获取SLAM底盘状态";
    String str34 = "软件版本";
    String str35 = "喇叭播音检测";
    String str36 = "喇叭按键功能检测";
    String str37 = "急停开关功能检测";
    String str38 = "3D测距";


    String[] s = {str0, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13,
                    str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25,
            str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38,};



    String tos_str_photo = "拍照没有选择结果，结果保存失败";
    String tos_str_video = "摄像没有选择结果，结果保存失败";
    String tos_str_record = "录音没有选择结果，结果保存失败";
    String tos_str_wifi = "Wifi没有选择结果，结果保存失败";
    String tos_str_wifiswitch = "Wifi开关测试没有选择结果，结果保存失败";
    String tos_str_ultrasound = "EAI手机app检测超声波状态没有选择结果，结果保存失败";
    String tos_str_aiuiinterface = "AIUI接口测试没有选择结果，结果保存失败";
    String tos_str_aiuiwakeup = "AIUI唤醒角度测试没有选择结果，结果保存失败";
    String tos_str_androidinterface = "android接口测试没有选择结果，结果保存失败";
    String tos_str_bluetootchswitch = "蓝牙开关没有选择结果，结果保存失败";
    String tos_str_boottimes = "开机时间没有选择结果，结果保存失败";
    String tos_str_bootup = "开机没有选择结果，结果保存失败";
    String tos_str_ethernetconnect = "有线连接没有选择结果，结果保存失败";
    String tos_str_ethernetswitch = "有线开关没有选择结果，结果保存失败";
    String tos_str_findbluetooth = "蓝牙可被检测没有选择结果，结果保存失败";
    String tos_str_ididentify = "身份证识别没有选择结果，结果保存失败";
    String tos_str_longprinter = "长时间调用打印没有选择结果，结果保存失败";
    String tos_str_powerinterface = "电源接口没有选择结果，结果保存失败";
    String tos_str_printer = "打印机没有选择结果，结果保存失败";
    String tos_str_robotstudioconnect = "RobotStudio底盘连接没有选择结果，结果保存失败";
    String tos_str_robotstudioultrasound = "RobotStudio超声波检测没有选择结果，结果保存失败";
    String tos_str_rosaction = "手机app检测EAI底盘动作没有选择结果，结果保存失败";
    String tos_str_rosconnect = "手机app连接EAI底盘没有选择结果，结果保存失败";
    String tos_str_rostestconnect = "ROS-TEST连接底盘没有选择结果，结果保存失败";
    String tos_str_rostestforward = "ROS-TEST前进后退底盘没有选择结果，结果保存失败";
    String tos_str_rostestrotate = "ROS-TEST旋转底盘没有选择结果，结果保存失败";
    String tos_str_rtc = "RTC测试没有选择结果，结果保存失败";
    String tos_str_screentest = "屏幕显示没有选择结果，结果保存失败";
    String tos_str_screentouch = "屏幕触摸点测试没有选择结果，结果保存失败";
    String tos_str_shutdown = "关机没有选择结果，结果保存失败";
    String tos_str_slrostestconnect = "ROS-TEST连接SLAM底盘没有选择结果，结果保存失败";
    String tos_str_slrostestforward = "ROS-TEST前进后退SLAM底盘没有选择结果，结果保存失败";
    String tos_str_slrostestrotate = "ROS-TEST旋转SLAM底盘没有选择结果，结果保存失败";
    String tos_str_slrosteststate = "ROS-TES获取SLAM底盘状态没有选择结果，结果保存失败";
    String tos_str_softwareversion = "软件版本没有选择结果，结果保存失败";
    String tos_str_speakernormalvolume = "喇叭播音检测没有选择结果，结果保存失败";
    String tos_str_speakertouchvolume = "喇叭按键功能检测没有选择结果，结果保存失败";
    String tos_str_stop = "急停开关功能检测没有选择结果，结果保存失败";
    String tos_str_threed = "3D测距没有选择结果，结果保存失败";


    String[] tos_s = {tos_str_photo, tos_str_video, tos_str_record, tos_str_wifi, tos_str_wifiswitch, tos_str_ultrasound, tos_str_aiuiinterface, tos_str_aiuiwakeup,
                      tos_str_androidinterface, tos_str_bluetootchswitch, tos_str_boottimes, tos_str_bootup, tos_str_ethernetconnect, tos_str_ethernetswitch, tos_str_findbluetooth,
                     tos_str_ididentify, tos_str_longprinter, tos_str_powerinterface, tos_str_printer, tos_str_robotstudioconnect, tos_str_robotstudioultrasound, tos_str_rosaction,
                     tos_str_rosconnect, tos_str_rostestconnect, tos_str_rostestforward, tos_str_rostestrotate, tos_str_rtc, tos_str_screentest, tos_str_screentouch, tos_str_shutdown,
                     tos_str_slrostestconnect, tos_str_slrostestforward, tos_str_slrostestrotate, tos_str_slrosteststate, tos_str_softwareversion, tos_str_speakernormalvolume, tos_str_speakertouchvolume,
                     tos_str_stop, tos_str_threed};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get sharepreference value
        SharedPreferences prf = getSharedPreferences("tag", MODE_PRIVATE);
        String content_record = prf.getString("录音", "");
        String record_str = content_record;

        String content_photo = prf.getString("拍照", "");
        String photo_str = content_photo;

        String content_video = prf.getString("摄像", "");
        String video_str = content_video;

        String content_wifi = prf.getString("wifi", "");
        String wifi_str = content_wifi;

        String content_aiuiinterface = prf.getString("AIUI接口", "");
        String aiuiinterface_str = content_aiuiinterface;

        String content_androidinterface = prf.getString("安卓接口", "");
        String androidinterface_str = content_androidinterface;

        String content_bluetoothswitch = prf.getString("蓝牙开关", "");
        String bluetoothswitch_str = content_bluetoothswitch;

        String content_boottimes = prf.getString("开机时间", "");
        String boottimes_str = content_boottimes;

        String content_bootup = prf.getString("开机", "");
        String bootup_str = content_bootup;

        String content_ethernetconnect = prf.getString("有线连接", "");
        String ethernetconnect_str = content_ethernetconnect;

        String content_ethernetswitch = prf.getString("有线开关", "");
        String ethernetswitch_str = content_ethernetswitch;

        String content_findbluetooth = prf.getString("蓝牙检测", "");
        String findbluetooth_str = content_findbluetooth;

        String content_ididentify = prf.getString("身份证识别", "");
        String ididentify_str = content_ididentify;

        String content_longprinter = prf.getString("频繁调用打印", "");
        String longprinter_str = content_longprinter;

        String content_powerinterface = prf.getString("充电接口", "");
        String powerinterface_str = content_powerinterface;

        String content_printer = prf.getString("打印机", "");
        String printer_str = content_printer;

        String content_robotstudioconnect = prf.getString("robotstudio连接机器人", "");
        String robotstudioconnect_str = content_robotstudioconnect;

        String content_robotstudioultrasound = prf.getString("robotstudio超声波", "");
        String robotstudioultrasound_str = content_robotstudioultrasound;

        String content_rosaction = prf.getString("底盘执行动作", "");
        String rosaction_str = content_rosaction;

        String content_rosconnect = prf.getString("底盘连接", "");
        String rosconnect_str = content_rosconnect;

        String content_rostestconnect = prf.getString("rostest连接底盘", "");
        String rostestconnect_str = content_rostestconnect;

        String content_rostestforward = prf.getString("rostest前进后退", "");
        String rostestforward_str = content_rostestforward;

        String content_rostestrotate = prf.getString("rostest旋转", "");
        String rostestrotate_str = content_rostestrotate;

        String content_rtctest = prf.getString("RTC测试", "");
        String rtctest_str = content_rtctest;

        String content_screentest = prf.getString("屏幕显示测试", "");
        String screentest_str = content_screentest;

        String content_screentouch = prf.getString("屏幕触摸点测试", "");
        String screentouch_str = content_screentouch;

        String content_shutdown = prf.getString("关机", "");
        String shutdown_str = content_shutdown;

        String content_slrostestconnect = prf.getString("SLrostest连接底盘", "");
        String slrostestconnect_str = content_slrostestconnect;

        String content_slrostestforward = prf.getString("SLrostest前进后退", "");
        String slrostestforward_str = content_slrostestforward;

        String content_slrostestrotate = prf.getString("SLrostest旋转", "");
        String slrostestrotate_str = content_slrostestrotate;

        String content_slrosteststate = prf.getString("SLrostest机器人状态", "");
        String slrosteststate_str = content_slrosteststate;

        String content_softwareversion = prf.getString("软件版本", "");
        String softwareversion_str = content_softwareversion;

        String content_speakernormalvolume = prf.getString("喇叭播放音乐", "");
        String speakernormalvolume_str = content_speakernormalvolume;

        String content_speakertouchvolume = prf.getString("喇叭按键播放音", "");
        String speakertouchvolume_str = content_speakertouchvolume;

        String content_stop = prf.getString("急停", "");
        String stop_str = content_stop;

        String content_threed = prf.getString("3D测距", "");
        String threed_str = content_threed;

        String content_ultrasound = prf.getString("超声波状态", "");
        String ultrasound_str = content_ultrasound;

        String content_wakeupangle = prf.getString("唤醒角度", "");
        String wakeupangle_str = content_wakeupangle;

        String content_wlanswitch = prf.getString("Wlan开关测试", "");
        String wlanswitch_str = content_wlanswitch;


        String[] s_r = {photo_str, video_str, record_str, wifi_str, wlanswitch_str, ultrasound_str, aiuiinterface_str, wakeupangle_str, androidinterface_str, bluetoothswitch_str, boottimes_str, bootup_str, ethernetconnect_str, ethernetswitch_str, findbluetooth_str, ididentify_str, longprinter_str, powerinterface_str, printer_str, robotstudioconnect_str, robotstudioultrasound_str, rosaction_str, rosconnect_str, rostestconnect_str, rostestforward_str, rostestrotate_str, rtctest_str, screentest_str, screentouch_str, shutdown_str, slrostestconnect_str, slrostestforward_str, slrostestrotate_str, slrosteststate_str, softwareversion_str, speakernormalvolume_str, speakertouchvolume_str, stop_str, threed_str};


        File file = new File("/mnt/sdcard/test.xml");//创建文件
        if (!file.exists()) {
            if (file.exists()) {
                try {
                    file.delete();
                    file.createNewFile();

                    //Toast.makeText(this, "创建成功！", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                file.createNewFile();

                // Toast.makeText(this, "创建成功！", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (file.exists()) {
            try {
                FileOutputStream fos = new FileOutputStream(file);
                XmlSerializer serializer = Xml.newSerializer();
                serializer.setOutput(fos, "gb2312");
                serializer.startDocument("gb2312", true);
                serializer.startTag(null, "测试报告");

                for (int i = 0; i < 39; i++) {

                    if (s_r[i].equals("")) {
                        setContentView(R.layout.save_fail);
                        file.delete();
                        Toast.makeText(this, tos_s[i], Toast.LENGTH_SHORT).show();
                        break;
                    } else {

                        try {

                            //   for (int ii = 0; ii < 4; ii++) {
                            serializer.startTag(null, "序号");
                            serializer.attribute(null, "id", String.valueOf(i + 1));
                            //write test name
                            serializer.startTag(null, "测试项目");
                            serializer.text(s[i]);
                            serializer.endTag(null, "测试项目");
                            //write test result
                            serializer.startTag(null, "测试结果");
                            serializer.text(s_r[i]);
                            serializer.endTag(null, "测试结果");
                            serializer.endTag(null, "序号");

                            //  }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }///for
                serializer.endTag(null, "测试报告");
                serializer.endDocument();
                fos.close();
                if (file.exists()) {
                    setContentView(R.layout.save_success);
                    Toast.makeText(this, "创建成功！", Toast.LENGTH_SHORT).show();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        // Intent intent=getIntent();
        // Bundle bundle=intent.getBundleExtra("data");


        //  String name=bundle.getString("name");
        // String result=bundle.getString("result");
        //Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();


        //file.delete();//删除文件


        //set fail and success contentview
        if (s_r.length == 0 | s_r == null) {

            setContentView(R.layout.save_fail);
            Toast.makeText(this, "全部结果都未选择，请选择结果！", Toast.LENGTH_SHORT).show();
        }
        ////  if (photo_str.equals("") | video_str.equals("") | wifi_str.equals("") | record_str.equals("")) {

        ////  setContentView(R.layout.save_fail);
        ////  for (int i = 0; i < 4; i++) {
        //if (record_result == null) {


        ///    if (s_r[i].equals("")) {
        ///      Toast.makeText(this, tos_s[i], Toast.LENGTH_SHORT).show();

        //  }


//        try {
//            //1.显示天气信息
//            TextView tv = (TextView) findViewById(R.id.xml_parse);
//            //1.1获取资产管理者，通过上下文
//            FileInputStream fileinputStream = new FileInputStream(file);
//            //2.调用我们定义的解析xml业务方法
//            List<Items> report = ParseResults.parserXml(fileinputStream);
        //           StringBuffer sb = new StringBuffer();
        //           for (Items items : report) {
        //               sb.equals(items.toString());
//            }
        //           //3.把数据展示到textview上
        //          tv.setText(fileinputStream.toString());
        //      }catch (Exception e){
        //          e.printStackTrace();
        //     }


        try {
            File path = new File(Environment.getExternalStorageDirectory(), "test.xml");
            FileInputStream fis = new FileInputStream(path);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);
            Log.d(TAG, "id-----" + fis);

            //get pull parse target
            XmlPullParser parser = Xml.newPullParser();
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            Log.d(TAG, "kajsdkfjlasjdlfjasldjflkasjdlfasdfasdfasdf");
            //set parse files and code format
            parser.setInput(fis, "gb2312");
            //get event type
            int eventType = parser.getEventType();
            String id = null;
            String 测试报告 = null;
            String 测试结果 = null;
            String 测试项目 = null;

            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagNeme = parser.getName();

                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if ("测试报告".equals(tagNeme)) {
                        } else if ("序号".equals(tagNeme)) {
                            id = parser.getAttributeValue(null, "id");
                        } else if ("测试项目".equals(tagNeme)) {
                            测试项目 = parser.nextText();
                        } else if ("测试结果".equals(tagNeme)) {
                            测试结果 = parser.nextText();
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if ("序号".equals(tagNeme)) {
                            Log.d(TAG, "id-----" + id);
                            Log.d(TAG, "测试项目----" + 测试项目);
                            Log.d(TAG, "测试结果----" + 测试结果);
                        }
                        break;
                    default:
                        break;
                }
                eventType = parser.next();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        }


        // if sharedpreference have value , it will to read value and write to file .
        //if result.xml existed, and we will write result to it, firstly delete file and create a new file to write
       /// if (photo_str.equals("") | video_str.equals("") | wifi_str.equals("") | record_str.equals("")) {
            //  File file = new File("/mnt/sdcard/test.xml");
            ///  if (file.exists()) {

            ///      file.delete();
            ///  }
            ///   setContentView(R.layout.save_success);
            ///  Toast.makeText(this, "创建成功！", Toast.LENGTH_SHORT).show();


            /////////////////////////////////////////////////////

            //  File file = new File("/mnt/sdcard/test.xml");
            // try {

            ///   FileOutputStream fos = new FileOutputStream(file);
            ///    XmlSerializer serializer = Xml.newSerializer();
            ///    serializer.setOutput(fos, "gb2312");
            ///    serializer.startDocument("gb2312", true);
            ///    serializer.startTag(null, "测试报告");

       ////     for (int i = 0; i < 4; i++) {
                //if (record_result == null) {


        ///        if (s_r[i].equals("")) {
        ///            Toast.makeText(this, tos_s[i], Toast.LENGTH_SHORT).show();
//
        ///        }
                ///  serializer.startTag(null, "序号");
                ///  serializer.attribute(null, "id", String.valueOf(i));
                //write test name
                ///   serializer.startTag(null, "测试项目");
                ///   serializer.text(s[i]);
                ///    serializer.endTag(null, "测试项目");
                //write test result
                ///    serializer.startTag(null, "测试结果");
                ///   serializer.text(s_r[i]);
                ///   serializer.endTag(null, "测试结果");
                ///   serializer.endTag(null, "序号");
                ///     }

                ///    }

                ///   serializer.endTag(null, "测试报告");
                ///    serializer.endDocument();
                ///    fos.close();


                ///     } catch (IOException e) {
                ///        e.printStackTrace();
                ///    }

         ///   }
            //// public void print(String str) {
            /////     FileWriter fw = null;
            /////     BufferedWriter bw = null;
            ////     String datetime = "";
            ////    try {
            //    SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd" + " "
            //            + "hh:mm:ss");
            //    datetime = tempDate.format(new java.util.Date()).toString();
            ////         fw = new FileWriter(file, true);//
            // 创建FileWriter对象，用来写入字符流
            ////         bw = new BufferedWriter(fw); // 将缓冲对文件的输出
            //String myreadline = datetime + "[]" + str;
            ////         String result_line= PhotoActivity.editText.getText().toString();

            //bw.write(myreadline + "\n"); // 写入文件
            //bw.newLine();
            ///         bw.write(result_line + "\n");
            ////         bw.newLine();
            ////         bw.flush(); // 刷新该流的缓冲
            /////         bw.close();
            /////         fw.close();
            /////     } catch (IOException e) {
            ////        // TODO Auto-generated catch block
            ////         e.printStackTrace();
            ////         try {
            ////             bw.close();
            ////             fw.close();
            ////         } catch (IOException e1) {
            ///            // TODO Auto-generated catch block
            ///          }
            ///      }
            ///   }





