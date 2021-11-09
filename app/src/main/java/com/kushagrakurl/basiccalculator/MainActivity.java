package com.kushagrakurl.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8 ,b9 ,bdot , badd, bsub, bmulti, bdivide, bmod, bequal, clear, back;
    ImageButton broot;
    TextView result;
    EditText expression;
    float finalscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         b1 = (Button)findViewById(R.id.b1);
         b2 = (Button)findViewById(R.id.b2);
         b3 = (Button)findViewById(R.id.b3);
         b4 = (Button)findViewById(R.id.b4);
         b5 = (Button)findViewById(R.id.b5);
         b6 = (Button)findViewById(R.id.b6);
         b7 = (Button)findViewById(R.id.b7);
         b8 = (Button)findViewById(R.id.b8);
         b9 = (Button)findViewById(R.id.b9);
         b0 = (Button)findViewById(R.id.b0);
         bdot = (Button)findViewById(R.id.bdot);
         badd = (Button)findViewById(R.id.badd);
         bsub = (Button)findViewById(R.id.bsub);
         bmulti = (Button)findViewById(R.id.bmulti);
         bdivide = (Button)findViewById(R.id.bdivide);
         bmod = (Button)findViewById(R.id.bmod);
         broot = (ImageButton)findViewById(R.id.broot);
         bequal = (Button)findViewById(R.id.bequal);
         clear = (Button)findViewById(R.id.clear);
         result = (TextView)findViewById(R.id.result);
         expression = (EditText)findViewById(R.id.expression);
         back = (Button)findViewById(R.id.back);


        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bdot.setOnClickListener(this);
        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bmulti.setOnClickListener(this);
        bdivide.setOnClickListener(this);
        bmod.setOnClickListener(this);
        broot.setOnClickListener(this);
        bequal.setOnClickListener(this);
        clear.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //float finalscore = 0;
        switch (view.getId()){
            case R.id.b0:{
                expression.setText(expression.getText() + "0");
                break;
            }
            case R.id.b1:{
                expression.setText(expression.getText() + "1");
                break;
            }
            case R.id.b2:{
                expression.setText(expression.getText() + "2");
                break;
            }
            case R.id.b3:{
                expression.setText(expression.getText() + "3");
                break;
            }case R.id.b4:{
                expression.setText(expression.getText() + "4");
                break;
            }
            case R.id.b5:{
                expression.setText(expression.getText() + "5");
                break;
            }case R.id.b6:{
                expression.setText(expression.getText() + "6");
                break;
            }
            case R.id.b7:{
                expression.setText(expression.getText() + "7");
                break;
            }case R.id.b8:{
                expression.setText(expression.getText() + "8");
                break;
            }
            case R.id.b9:{
                expression.setText(expression.getText() + "9");
                break;
            }
            case R.id.bdot:{
                expression.setText(expression.getText() + ".");
                break;
            }
            case R.id.badd:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    expression.setText(expression.getText() + " + ");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = finalscore + Float.parseFloat(str);
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + " + ");
                }
                break;
            }
            case R.id.bsub:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    expression.setText(expression.getText() + " - ");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = finalscore - Float.parseFloat(str);
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + " - ");
                }
                break;
            }
            case R.id.bmulti:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    expression.setText(expression.getText() + " * ");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = finalscore * Float.parseFloat(str);
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + " * ");
                }
                break;
            }case R.id.bdivide:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    expression.setText(expression.getText() + " / ");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = finalscore / Float.parseFloat(str);
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + " / ");
                }
                break;
            }
            case R.id.bmod:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    expression.setText(expression.getText() + " % ");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = finalscore % Float.parseFloat(str);
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + " % ");
                }
                break;
            }
            case R.id.broot:{
                try{
                    finalscore = Float.parseFloat(expression.getText().toString());
                    finalscore = (float) (Math.sqrt(finalscore));
                    expression.setText(expression.getText() + "\u221a");
                    result.setText(String.valueOf(finalscore));
                }
                catch (Exception e){
                    String str =  expression.getText().toString().substring(expression.getText().toString().lastIndexOf(' '), expression.getText().toString().length());
                    finalscore = (float) (Math.sqrt(Float.parseFloat(str)));
                    result.setText(String.valueOf(finalscore));
                    expression.setText(expression.getText() + "\u221a");
                }
                break;
            }
            case R.id.bequal:{
                result.setText(String.valueOf(finalscore));
                expression.setText(expression.getText() + " = ");
                //result.setTextColor(0x000000);
                //result.setTextSize(Unit 20sp);
                //result.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                break;
            }
            case R.id.back:{
                StringBuffer sb= new StringBuffer(expression.getText().toString());
                sb.deleteCharAt(sb.length()-1);
                expression.setText("");
                result.setText("");
                //result.setTextColor(0x808080);
                //result.setTextSize(10);
                //result.setTypeface(Typeface.DEFAULT);
                break;
            }
            case R.id.clear:{
                expression.setText("");
                result.setText("");
                finalscore = 0;
                //result.setTextColor(0x808080);
                //result.setTextSize(10);
                //result.setTypeface(Typeface.DEFAULT);
                break;
            }
        }

    }
    protected void calc(String type,float result, String exp ){
        if(type == "add"){

        }
    }
}