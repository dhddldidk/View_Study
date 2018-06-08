package kr.or.dgit.it.view_study;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DialogAssignment extends AppCompatActivity {
    TextView tvName;
    TextView tvEmail;
    EditText editName;
    EditText editEmail;


    AlertDialog dialogAssignment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_assignment);
        setTitle(getIntent().getStringExtra("title"));
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);

    }

    public void btnClickHere(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View v =inflater.inflate(R.layout.dialog_assignment_text, null);
        builder.setView(v);

        editName = v.findViewById(R.id.editName);
        editEmail = v.findViewById(R.id.editEmail);

        dialogAssignment=builder.create();
        dialogAssignment.show();
    }

    public void btnCancel(View view) {
        Toast.makeText(this,"취소되었습니다.", Toast.LENGTH_LONG).show();
    }

    public void btnConfirm(View view) {
        tvName.setText(editName.getText());
        tvEmail.setText(editEmail.getText());
        dialogAssignment.hide();
    }
}
