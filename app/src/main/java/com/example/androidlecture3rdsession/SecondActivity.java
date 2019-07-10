package com.example.androidlecture3rdsession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 = findViewById(R.id.editText4);
        txt2 = findViewById(R.id.editText5);


    }

    public void btnOnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonSendBack:
                if (txt1.getText().toString().isEmpty() && txt2.getText().toString().isEmpty())
                {
                    Toast.makeText(this,"Please enter fields", Toast.LENGTH_SHORT);
                }
                else
                {
                    Intent sendBack = new Intent();
                    sendBack.putExtra(Constants.F_KEY, txt1.getText().toString());
                    sendBack.putExtra(Constants.S_KEY, txt2.getText().toString());
                    setResult(RESULT_OK, sendBack);
                    finish();
                }
                break;
        }

    }
}
