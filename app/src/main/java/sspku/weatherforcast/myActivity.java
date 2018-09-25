package sspku.weatherforcast;
import android.app.Activity;
import android.os.Bundle;
//Create by jiang on 2018.9.25
public class myActivity extends Activity{//继承于父类Activity

    @Override//重载oncreat方法
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.jiang_layout);// 在Activity中通过setContentView(View)接口把 布局加载到Activity创建的窗口上。

    }

}
