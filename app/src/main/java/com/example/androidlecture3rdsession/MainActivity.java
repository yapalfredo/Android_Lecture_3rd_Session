package com.example.androidlecture3rdsession;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view)
    {
        switch(view.getId())
        {
            case R.id.btnStartActivityForResult:
                Intent mainActIntent = new Intent(this, SecondActivity.class);
                startActivityForResult(mainActIntent, 007);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView txtRes1 = findViewById(R.id.txtViewRes1);
        TextView txtRes2 = findViewById(R.id.txtViewRes2);

        if (requestCode == 007)
        {
            txtRes1.setText(data.getExtras().getString(Constants.F_KEY));
            txtRes2.setText(data.getExtras().getString(Constants.S_KEY));

        }

    }
}
