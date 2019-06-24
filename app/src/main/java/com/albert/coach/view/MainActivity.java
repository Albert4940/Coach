package com.albert.coach.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.albert.coach.R;
import com.albert.coach.controller.Control;

public class MainActivity extends AppCompatActivity {

    private EditText weighttxt;
    private EditText sizetxt;
    private EditText agetxt;

    private RadioButton btnrd;

    private TextView lbResult;
    private ImageView imgSmiley;

    private Control control;

    /**
     * initialisation link with graphical component
     */
    private void initialize()
    {
        weighttxt = (EditText)findViewById(R.id.txtWeight);
        sizetxt = (EditText)findViewById(R.id.txtSize);
        agetxt = (EditText)findViewById(R.id.txtAge);

        btnrd = (RadioButton)findViewById(R.id.btnMan);

        lbResult = (TextView)findViewById(R.id.lbResult);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }
}
