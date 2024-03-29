package com.albert.coach.view;

import android.graphics.Color;
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
    private RadioButton btnrdW;

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
        btnrdW = (RadioButton)findViewById(R.id.btnWoman);

        lbResult = (TextView)findViewById(R.id.lbResult);

        this.control = Control.getInstance(this);
        listenBtn();
        recoveryProfil();
    }

    /**
     * Listen calculation button
     */
    private void listenBtn()
    {
        ((Button) findViewById(R.id.btnCalc)).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();
                Integer weight = 0;
                Integer size = 0;
                Integer age = 0;
                Integer sex = 0;

                try{

                    weight = Integer.parseInt(weighttxt.getText().toString());
                    size = Integer.parseInt(sizetxt.getText().toString());
                    age = Integer.parseInt(agetxt.getText().toString());

                }catch (Exception e)
                {
                }

                if(btnrd.isChecked())
                {
                    sex = 1;
                }

                if(weight == 0 || size == 0 || age == 0)
                {
                    Toast.makeText(MainActivity.this,"Input incorrect",Toast.LENGTH_SHORT).show();
                }else
                {
                    posterResult(weight,size,age,sex);
                    //Toast.makeText(MainActivity.this,"Input Correct",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    /**
     * poster of BMI and message
     * @param weight
     * @param size
     * @param age
     * @param sex
     */


    private void posterResult(Integer weight, Integer size, Integer age, Integer sex)
    {
        this.control.createProfil(weight,size,age,sex,this);
        float bmi = control.getBmi();
        String message = control.getMessage();

        if(message == "normal")
        {
            lbResult.setTextColor(Color.GREEN);
        }
        else
        {
            lbResult.setTextColor(Color.RED);
        }

        lbResult.setText(String.format("0.01f",bmi)+" : BMI "+message);
    }

    private void recoveryProfil(){
     if(control.getWeight() != null)
     {
         weighttxt.setText(control.getWeight().toString());
         agetxt.setText(control.getAge().toString());
         sizetxt.setText(control.getSize());
         btnrdW.setChecked(true);
         if(control.getSex() == 1)
             btnrd.setChecked(true);
         //Click simulation on my calculate btn
         ((Button)findViewById(R.id.btnCalc)).performClick();

     }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }
}
