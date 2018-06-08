package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayoutExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_ex);
        setTitle(getIntent().getStringExtra("title"));
    }
}
