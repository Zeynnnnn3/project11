package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnWordCount, btnCharCount;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btnWordCount = findViewById(R.id.btnWordCount);
        btnCharCount = findViewById(R.id.btnCharCount);
        resultView = findViewById(R.id.resultView);
        btnWordCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter text!", Toast.LENGTH_SHORT).show();
                } else {
                    int wordCount = TextCounter.countWords(inputText);
                    resultView.setText("Word Count: " + wordCount);
                }
            }
        });
        btnCharCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter text!", Toast.LENGTH_SHORT).show();
                } else {
                    int charCount = TextCounter.countCharacters(inputText);
                    resultView.setText("Character Count: " + charCount);
                }
            }
        });
    }
}
