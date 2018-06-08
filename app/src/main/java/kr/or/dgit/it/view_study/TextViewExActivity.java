package kr.or.dgit.it.view_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TextViewExActivity extends AppCompatActivity {
    CheckBox checkBox;
    EditText phoneNumber;
    RadioGroup rGroup;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    String hobby;
    String pNumber;
    String cBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_ex);
        setTitle(getIntent().getStringExtra("title"));

        checkBox = findViewById(R.id.cbIsChecked);
        phoneNumber = findViewById(R.id.phoneNumber);
        rGroup = findViewById(R.id.radioGroup);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);




        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox.setText("is Checked");
                    cBox = checkBox.getText().toString();
                }else{
                    checkBox.setText("is unChecked");
                    cBox = checkBox.getText().toString();
                }
            }
        });

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radio1){
                    hobby= radio1.getText().toString();
                }else if(checkedId==R.id.radio2){
                    hobby= radio2.getText().toString();
                }else{
                    hobby= radio3.getText().toString();
                }
            }
        });

    }


    public void mBtnClick(View view) {
        pNumber = phoneNumber.getText().toString();
        Toast.makeText(this, "결과 : "+pNumber+":"+hobby+":"+cBox, Toast.LENGTH_LONG).show();
    }
}
