package kr.or.dgit.it.view_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewBasicActivity extends AppCompatActivity {
    private TextView mTextView;
    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Intent intent = getIntent();//메인에서 보낸 타이틀 넘겨받기 넘겨받는 값이 인트일때
        int titleId = intent.getIntExtra("title", 0);*/


        setTitle(getIntent().getStringExtra("title")); //넘겨받는 값이 스트링일때
        /*setTitle(R.string.mainTxt);*/ // 각 페이지마다 타이틀 값 입력하기
        setContentView(R.layout.activity_view_basic);
        mTextView = findViewById(R.id.tv);
        mTextView02 = findViewById(R.id.tv02);
    }

    public void trueBtnClick(View view) {
        if(!mTextView.isShown()){
            mTextView.setVisibility(View.VISIBLE);
        }
    }

    public void falseBtnClick(View view) {
        if(mTextView.isShown()){
            mTextView.setVisibility(View.INVISIBLE);
        }
    }

    public void trueGoneClick(View view) {
        if(!mTextView02.isShown()){
            mTextView02.setVisibility(View.VISIBLE);
        }
    }

    public void falseGoneClick(View view) {
        if(mTextView02.isShown()){
            mTextView02.setVisibility(View.GONE);
        }
    }
}
