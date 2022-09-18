package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button one,two,three,four,five,six,seven,eight,nine,plus,minus,mul,div,equal,zero,dot,
            c,operation,mod;
    boolean addition,subtraction,multiplication,division,percent;
    float value1,value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        Button c = findViewById(R.id.btnC);
        Button operation = findViewById(R.id.btnOperation);
        Button mod = findViewById(R.id.btnMod);
        Button seven = findViewById(R.id.btn7);
        Button eight = findViewById(R.id.btn8);
        Button nine = findViewById(R.id.btn9);
        Button four = findViewById(R.id.btn4);
        Button five = findViewById(R.id.btn5);
        Button six = findViewById(R.id.btn6);
        Button one = findViewById(R.id.btn1);
        Button two = findViewById(R.id.btn2);
        Button three = findViewById(R.id.btn3);
        Button plus = findViewById(R.id.btnPlus);
        Button minus = findViewById(R.id.btnMinus);
        Button mul = findViewById(R.id.btnMul);
        Button div = findViewById(R.id.btnDiv);
        Button equal = findViewById(R.id.btnEqual);
        Button zero = findViewById(R.id.btn0);
        Button dot = findViewById(R.id.btnDot);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv == null)
                {
                    tv.setText("");
                }else{
                    value1=Float.parseFloat(tv.getText() + "");
                    addition = true;
                    tv.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv == null)
                {
                    tv.setText("");
                }else{
                    value1=Float.parseFloat(tv.getText() + "");
                    subtraction = true;
                    tv.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv == null)
                {
                    tv.setText("");
                }else{
                    value1=Float.parseFloat(tv.getText() + "");
                    multiplication = true;
                    tv.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv == null)
                {
                    tv.setText("");
                }else{
                    value1=Float.parseFloat(tv.getText() + "");
                    division = true;
                    tv.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(tv.getText()+"");
                if(addition==true){
                    tv.setText(value1+value2+"");
                    addition=false;
                }
                if(subtraction==true){
                    tv.setText(value1-value2+"");
                    subtraction=false;
                }
                if(multiplication==true){
                    tv.setText(value1*value2+"");
                    multiplication=false;
                }
                if(division==true){
                    try{
                        tv.setText(value1/value2+"");
                        division=false;
                    }catch(Exception e){
                        Log.d("Calc",e.getMessage());
                    }
                }}
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });
    }
}