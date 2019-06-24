package com.albert.coach.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
        listenBtn();

    }

    /**
     * Listen calculation button
     */
    private void listenBtn()
    {
        ((Button) findViewById(R.id.btnCalc)).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        this.control = Control.getInstance();
    }
}
