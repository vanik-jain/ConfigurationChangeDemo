package com.example.orientationdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
private TextView textView;
private Button button;
private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++count;
                textView.setText(String.valueOf(count));
            }
        });
//        if (savedInstanceState!= null)
//        {
//            Log.i("VANIK","onCreateBundle");
//            count = savedInstanceState.getInt("count");
//            textView.setText(String.valueOf(count));
//        }



    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState)
    {
        super.onSaveInstanceState(outState);
        Log.i("VANIK","onSaveInstance");
        outState.putInt("count",count);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        count = savedInstanceState.getInt("count");
        Log.i("VANIK","onRestoreInstanceStateBundle");
        textView.setText(String.valueOf(count));
    }
}
