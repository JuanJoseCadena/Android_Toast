package com.jjca.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CharSequence text = "Hello Toast!";
    int duration = Toast.LENGTH_SHORT;

    public void ShowToast()
    {
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.image_toast);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowToast();
            }
        });

    }
}