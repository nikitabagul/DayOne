package com.example.dayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //setting the environment in java (xml)

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= editText.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Hello "+s, Toast.LENGTH_SHORT).show();
                textView.setText(s);
                textView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                textView.setAllCaps(true);
                textView.setTextSize(24);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                Intent intent=new Intent(MainActivity.this,Hello.class);
                startActivity(intent);
            }
        });
    }
}
