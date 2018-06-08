package kr.or.dgit.it.view_study;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DialogActivity extends AppCompatActivity {
    EditText tvResult;


    AlertDialog customDialog;
    AlertDialog listDialog;
    AlertDialog alertDialog;
    private String[] datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        setTitle(getIntent().getStringExtra("title"));
        tvResult = findViewById(R.id.editText);
        datas = getResources().getStringArray(R.array.dialog_array);
    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
        tvResult.append(message + "\r\n");
    }

    /*
        DialogInterface.OnClickListener dialogListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(dialog==customDialog && which==DialogInterface.BUTTON_POSITIVE){
                    showToast("custom dialog 확인 click.....");
                }else if(dialog==listDialog){
                    showToast(datas[which] + "선택 하셨습니다.");
                }else if(dialog==alertDialog && which==DialogInterface.BUTTON_POSITIVE){
                    showToast("alert dialog ok click.....");

                }

            }
        };*/
    public void btnCustomClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.dialog_layout, null);

        CheckBox chkAllow = v.findViewById(R.id.chackAllow);
        chkAllow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                showToast(isChecked ? "허용" : "허용하지 않음");
            }
        });

        builder.setView(v);

        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToast("익명 custom dialog 확인 click.....");
            }
        });
        builder.setNegativeButton("취소", null);

        customDialog = builder.create();
        customDialog.show();
    }

    public void btnListClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("알람 벨소리");
        builder.setSingleChoiceItems(R.array.dialog_array, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                showToast(datas[which] + "선택 하셨습니다.");
            }
        });

        builder.setPositiveButton("확인", null);
        builder.setNegativeButton("취소", null);
        listDialog = builder.create();
        listDialog.show();
    }

    public void btnAlertClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setTitle("알림");
        builder.setMessage("정말 종료 하시겠습니까?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToast("익명 alert dialog ok click.....");
            }
        });
        builder.setNegativeButton("NO", null);

        alertDialog = builder.create();
        alertDialog.show();

    }


    public void btnProgressClick(View view) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setIcon(android.R.drawable.ic_dialog_alert);
        progressDialog.setTitle("Wait...");
        progressDialog.setMessage("서버 연동중입니다. 잠시만 기다리세요.");

        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(true);

        progressDialog.show();
    }

    public void btnDateClick(View view) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dateDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                showToast(year + ":" + (month + 1) + ":" + dayOfMonth);
            }
        }, year, month, day);
        dateDialog.show();
    }

    public void btnTimeClick(View view) {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TimePickerDialog timeDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                showToast(hourOfDay + ":" + minute);
            }
        }, hour, minute, false);
        timeDialog.show();
    }


}
