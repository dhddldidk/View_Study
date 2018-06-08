package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FrameLayoutExActivity extends AppCompatActivity {

    TextView blue;
    TextView green;
    TextView red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_ex);
        setTitle(getIntent().getStringExtra("title"));
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        red = findViewById(R.id.red);

    }

    public void blueOnClick(View view) {
        visivleTextView(view.VISIBLE, view.INVISIBLE, View.INVISIBLE);
    }

    private void visivleTextView(int...isVisible) {
        blue.setVisibility(isVisible[0]);
        green.setVisibility(isVisible[1]);
        red.setVisibility(isVisible[2]);
    }

    public void greenOnClick(View view) {
        visivleTextView(view.INVISIBLE, view.VISIBLE, View.INVISIBLE);
    }

    public void redOnClick(View view) {
        visivleTextView(view.INVISIBLE, view.INVISIBLE, View.VISIBLE);
    }

    public void allOnClick(View view) {
        visivleTextView(view.VISIBLE, view.VISIBLE, View.VISIBLE);
    }

    public void allInvisibleOnClick(View view) {
        visivleTextView(view.INVISIBLE, view.INVISIBLE, View.INVISIBLE);
        /*Toast.makeText(this,"aaa", Toast.LENGTH_LONG).show();*/
    }
}
