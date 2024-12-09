package com.example.profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button jes;
    Button niet;
    EditText name;
    EditText log;
    EditText gamil;
    EditText snil;
    TextView wunik;
    boolean jest= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        jes = findViewById(R.id.button5);
        jes.setOnClickListener(e -> {
            name = findViewById(R.id.Nname);
            gamil = findViewById(R.id.editTextTextEmailAddress2);
            log = findViewById(R.id.editTextTextPassword3);
            snil = findViewById(R.id.Sname);
            wunik = findViewById(R.id.textView);
            wunik.setText(" NAME: "+name.getText().toString()+" E-mail: "+gamil.getText().toString()+" LOGIN: "+log.getText().toString()+" SURNAME"+snil.getText().toString());
        });
        niet = findViewById(R.id.button2);
        niet.setOnClickListener(e -> {
            jest = !jest;
            name.setEnabled(jest);
            gamil.setEnabled(jest);
            log.setEnabled(jest);
            snil.setEnabled(jest);
        });

    }
}