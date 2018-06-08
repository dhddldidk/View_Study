package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CustomEventActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    Switch switchHere;
    CheckBox repeatChk;
    TextView tvHelium;
    CheckBox vibrateChk;
    TextView tvLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_event);
        setTitle(getIntent().getStringExtra("title"));

        switchHere = findViewById(R.id.switchHere);
        repeatChk = findViewById(R.id.repeatChk);
        vibrateChk = findViewById(R.id.vibrateChk);



        switchHere.setOnCheckedChangeListener(this);
        repeatChk.setOnCheckedChangeListener(this);
        vibrateChk.setOnCheckedChangeListener(this);

    }

    public void onBellClicked(View view) {
        showToast("bell text click event...");
    }

    public void onLabelClicked(View view) {
        showToast("label text click event...");
    }

    public void showToast(String message){
        Toast toast = Toast.makeText(this,message,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView==switchHere){
            showToast("switch is"+isChecked);
        }else if(buttonView==repeatChk){
            showToast("repeatChk is"+isChecked);
        }else if(buttonView==vibrateChk){
            showToast("vibrateChk is"+isChecked);
        }
    }
}
