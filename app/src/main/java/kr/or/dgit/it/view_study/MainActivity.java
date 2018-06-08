package kr.or.dgit.it.view_study;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void mOnClick(View view) {
        Intent intent = new Intent();
        if(view.getId()==R.id.btnMain01){
            intent.setClass(this,ViewBasicActivity.class);
            intent.putExtra("title",((Button)view).getText());//화면 상단의 타이틀 값을 각 페이지에 넘겨줌
        }

        if(view.getId()==R.id.btnMain02){
            intent.setClass(this, TextViewExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain03){
            intent.setClass(this, LinearLayoutExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain04){
            intent.setClass(this, RelativeLayoutExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain05){
            intent.setClass(this, FrameLayoutExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain06){
            intent.setClass(this, TabHostExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain07){
            intent.setClass(this, TableLayoutExActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain08){
            intent.setClass(this, VibratorAndAlarmActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain09){
            intent.setClass(this, DialogActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain10){
            intent.setClass(this, DialogAssignment.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain11){
            intent.setClass(this, CustomEventActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain12){
            intent.setClass(this, TouchEventActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain13){
            intent.setClass(this, ResourceActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain14){
            intent.setClass(this, ResourceLanguageActivity.class);
            intent.putExtra("title",((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain15){
            intent.setClass(this, AssignmentActivity01Facebook.class);
            intent.putExtra("title",((Button)view).getText());
        }
        startActivity(intent);
    }
}
