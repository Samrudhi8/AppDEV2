package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText regNoInput,nameInput,branchInput,marksInput,fetchRegNoInput;
    Button btnSave,btnFetch;
    TextView studentInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        regNoInput = findViewById(R.id.regNoInput);
        nameInput = findViewById(R.id.nameInput);
        branchInput = findViewById(R.id.branchInput);
        marksInput = findViewById(R.id.marksInput);
        fetchRegNoInput = findViewById(R.id.fetchRegNoInput);

        btnSave = findViewById(R.id.btnSave);
        btnFetch = findViewById(R.id.btnFetch);

        studentInfo = findViewById(R.id.studentInfo);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db.addStudent(
                        new student(
                                regNoInput.getText().toString(),
                                nameInput.getText().toString(),
                                branchInput.getText().toString(),
                                Integer.parseInt(marksInput.getText().toString())
                        )
                );
                Log.d("STUDENT","saved...");


            }
        });

        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                student student = db.getStudent(fetchRegNoInput.getText().toString());

                studentInfo.setText(
                        "Reg. No." + student.getRegNo() + "\n" +
                                "Name" + student.getName() + "\n" +
                                "Branch Name" + student.getBranch() + "\n" +
                                "Marks" + student.getMarks()

                );
            }
        });
    }
}
