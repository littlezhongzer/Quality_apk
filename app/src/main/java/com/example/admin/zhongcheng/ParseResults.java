package com.example.admin.zhongcheng;

import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ParseResults {
    /**
     * 服务器是以流的形式吧数据返回
     */

    private static final String TAG = "savefileactivity";
    public static List<Items> parserXml(InputStream in)throws Exception{
        //0.声明集合对象
        List<Items> reportslist = null;
        Items items = null;
        //1.获取xmlpullparser解析实例
        XmlPullParser parser = Xml.newPullParser();
        //2.设置XmlPullParser的参数
        parser.setInput(in,"utf-8");
        //3.获取时间类型
        int type = parser.getEventType();
        while (type!=XmlPullParser.END_DOCUMENT){
            switch (type){
                //4.具体判断下解析到了哪个开始标签
                case XmlPullParser.START_TAG://开始解析标签
                    if ("测试报告".equals(parser.getName())){
                        //5.创建一个集合对象
                        reportslist = new ArrayList<Items>();
                    }else if ("序号".equals(parser.getName())){
                        //6.创建Channel对象
                        items = new Items();
                        //7.获取id值
                        String 序号 = parser.getAttributeName(0);
                        items.setId(序号);
                    }else if ("测试项目".equals(parser.getName())){
                        //9.获取city值
                        String 测试项目  = parser.nextText();
                        items.set测试项目(测试项目);
                    }else if ("测试结果".equals(parser.getName())){
                        //10.获取temp值
                        String 测试结果 = parser.nextText();
                        items.set测试结果(测试结果);
                    }


                    break;
                case XmlPullParser.END_TAG:  //解析结束标志
                    //判断要解析的结束标签
                    if ("items".equals(parser.getName())){
                        //把javabean对象存到集合中
                        reportslist.add(items);
                    }

            }

            //不停的向下解析
            type = parser.next();
        }

        return  reportslist;
    }

}