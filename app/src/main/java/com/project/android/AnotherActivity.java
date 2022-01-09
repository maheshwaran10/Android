package com.project.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

   private Button button;
   private EditText name;
   private TextView showName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        button=(Button)findViewById(R.id.button);
        name=(EditText)findViewById(R.id.name);
        showName=(TextView)findViewById(R.id.text);
        showName.setEnabled(false);
        showName.setVisibility(View.GONE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(AnotherActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();

                String namestr;
                namestr=name.getText().toString();
                //Toast.makeText(AnotherActivity.this,namestr,Toast.LENGTH_SHORT).show();
                showName.setText(namestr);
                showName.setVisibility(View.VISIBLE);
                showName.setEnabled(true);
            }
        });
    }
}