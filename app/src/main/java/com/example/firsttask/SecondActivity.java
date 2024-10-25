package com.example.firsttask;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText nameEditText;
    private TextView greetingTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent data = getIntent();
        nameEditText = findViewById(R.id.nameEditText);
        nameEditText.setSelectAllOnFocus(true);
        greetingTextView = findViewById(R.id.greetingTextView);
        greetingTextView.setText(data.getStringExtra("GREETING"));
        greetingTextView.setVisibility(View.VISIBLE);
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                result.putExtra("NAME", String.valueOf(nameEditText.getText()));
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}