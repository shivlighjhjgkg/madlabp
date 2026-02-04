package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private Button okButton;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        okButton = findViewById(R.id.okButton);
        displayText = findViewById(R.id.displayText);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputEditText.getText().toString().trim();
                if (!text.isEmpty()) {
                    displayText.setText(text); // Display typed text
                } else {
                    displayText.setText(""); // Clear if nothing typed
                }
            }
        });
    }
}
