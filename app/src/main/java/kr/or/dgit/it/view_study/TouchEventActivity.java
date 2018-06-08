package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class TouchEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);
        setTitle(getIntent().getStringExtra("title"));
    }

    private void showToast(String message){
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }

    float initX;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            initX=event.getRawX();
        }else if(event.getAction()==MotionEvent.ACTION_UP){
            float diffX=initX-event.getRawX();
            if(diffX>30){
                showToast("왼쪽으로 화면을 밀었습니다.");
            }else if(diffX<-30){
                showToast("오른쪽으로 화면을 밀었습니다.");
            }
        }

        return true;
    }

    long initTime;
    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() - initTime>3000){
            showToast("종료할려면 한번 더 누르세요.");
            initTime=System.currentTimeMillis();
        }else{
            finish();
        }
    }
}
