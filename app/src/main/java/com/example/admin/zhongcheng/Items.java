package com.example.admin.zhongcheng;

import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/5/18.
 */

public class Items {
    private String id;
    private String 测试项目;
    private String 测试结果;
    //private String wind;
    //private String pm250;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get测试项目() {
        return 测试项目;
    }

    public void set测试项目(String 测试项目) {
        this.测试项目 = 测试项目;
    }

    public String get测试结果() {
        return 测试结果;
    }

    public void set测试结果(String 测试结果) {
        this.测试结果 = 测试结果;
    }



    @Override
    public String toString() {
        return "Items[id="+id +",测试项目="+ 测试项目 +",测试结果="+ 测试结果 +"]";
    }
}