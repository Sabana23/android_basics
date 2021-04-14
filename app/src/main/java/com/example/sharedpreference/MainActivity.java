package com.example.sharedprefernce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFirst, etLast;
    Button btnInsert, btnRetrive, btnDelete;
    String strFirst, strLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etFirst = findViewById(R.id.etFirstName);
        etLast =findViewById(R.id.etLastName);
        btnInsert = findViewById(R.id.btnInsert);
        btnRetrive = findViewById(R.id.btnRetrive);
        btnDelete = findViewById(R.id.btnDelete);



        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strFirst = etFirst.getText().toString();
                strLast = etLast.getText().toString();

                System.out.println("fst" +strFirst);
                System.out.println("lst" +strLast);
                SharedPreferences insertSP = getSharedPreferences("First", MODE_PRIVATE);
                SharedPreferences.Editor insterEditor = insertSP.edit();
                insterEditor.putString("FirstName", strFirst);
                insterEditor.putString("LastName", strLast);
                insterEditor.commit();
                Toast.makeText(MainActivity.this, "Inserted Success", Toast.LENGTH_SHORT).show();
            }
        });
        btnRetrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences retriveSP = getSharedPreferences("First", MODE_PRIVATE);
                SharedPreferences.Editor retriveEditor = retriveSP.edit();
                String Fst = retriveSP.getString("FirstName", "");
                String Lst = retriveSP.getString("LastName" , "");

                System.out.println("fst" +Fst);
                System.out.println("lst" +Lst);
                etFirst.setText(Fst);
                etLast.setText(Lst);
                retriveEditor.commit();
                Toast.makeText(MainActivity.this, "Retrived Success", Toast.LENGTH_SHORT).show();
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences deleteSP = getSharedPreferences("First", MODE_PRIVATE);
                deleteSP.edit().clear().commit();
                Toast.makeText(MainActivity.this, "Deleted Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}