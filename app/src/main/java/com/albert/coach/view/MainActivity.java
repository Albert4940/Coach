package com.albert.coach.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.albert.coach.R;

public class MainActivity extends AppCompatActivity {

    private EditText weigthtxt;
    private EditText sizetxt;
    private EditText agetxt;

    private RadioButton btnrd;
    private TextView lbResult;
    private ImageView imgSmiley;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
