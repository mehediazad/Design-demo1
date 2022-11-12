package com.example.design_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatRadioButton left_botton_Id, right_bottonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left_botton_Id = findViewById(R.id.left_botton_Id);
        right_bottonId = findViewById(R.id.right_bottonId);
    }
    public void onRadioButtonClicked(View view){
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.left_botton_Id:
                if (isSelected){
                    left_botton_Id.setTextColor(Color.BLACK);
                    right_bottonId.setTextColor(Color.WHITE);
                }
                break;

            case R.id.right_bottonId:
                if (isSelected){
                    right_bottonId.setTextColor(Color.BLACK);
                    left_botton_Id.setTextColor(Color.WHITE);
                }
                break;
        }
    }
}