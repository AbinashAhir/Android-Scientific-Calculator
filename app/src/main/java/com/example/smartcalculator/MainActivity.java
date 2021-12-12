package com.example.smartcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.*;
import static com.example.smartcalculator.R.string.squareError;

public class MainActivity extends AppCompatActivity {
    TextView tvsec, tvMain;
    Button bac, bc, bbrac1, bbrac2, bsin, bcos, btan, blog, bln, bfact, bsquare, bsqrt, binv, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bpi, bmul, bsub, badd, bequal, bdot, bdiv, bmod, bcuberoot, bpow, bdt, bprime, beven, bpalindrome, bmodulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvsec = (TextView) findViewById(R.id.idTVSecondary);
        tvMain = (TextView) findViewById(R.id.idTVPrimary);
        bac = (Button) findViewById(R.id.bac);
        bc = (Button) findViewById(R.id.bc);
        bbrac1 = (Button) findViewById(R.id.bbrac1);
        bbrac2 = (Button) findViewById(R.id.bbrac2);
        bsin = (Button) findViewById(R.id.bsin);
        bcos = (Button) findViewById(R.id.bcos);
        btan = (Button) findViewById(R.id.btan);
        blog = (Button) findViewById(R.id.blog);
        bln = (Button) findViewById(R.id.bln);
        bfact = (Button) findViewById(R.id.bfact);
        bsquare = (Button) findViewById(R.id.bsquare);
        bsqrt = (Button) findViewById(R.id.bsqrt);
        binv = (Button) findViewById(R.id.binv);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bpi = (Button) findViewById(R.id.bpi);
        bmul = (Button) findViewById(R.id.bmul);
        bsub = (Button) findViewById(R.id.bsub);
        badd = (Button) findViewById(R.id.badd);
        bequal = (Button) findViewById(R.id.bequal);
        bdot = (Button) findViewById(R.id.bdot);
        bdiv = (Button) findViewById(R.id.bdiv);
        bmod = (Button) findViewById(R.id.bmod);
        bcuberoot = (Button) findViewById(R.id.bcuberoot);
        bpow = (Button) findViewById(R.id.bpow);
        bdt = (Button) findViewById(R.id.bdt);
        bprime = (Button) findViewById(R.id.bprime);
        beven = (Button) findViewById(R.id.beven);
        bpalindrome = (Button) findViewById(R.id.bpalindrome);
        bmodulus = (Button) findViewById(R.id.bmodulus);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tvMain.append("1");
                tvMain.setText(tvMain.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + ".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "+");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "÷");
            }
        });
        bbrac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "(");
            }
        });
        bbrac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + ")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "3.142");
                tvsec.setText(bpi.getText().toString());
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    tvMain.setText(tvMain.getText() + "sin" + "");
                }
                else {
                    tvMain.setText(val + "×" + "sin" + "");
                }

            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    tvMain.setText(tvMain.getText() + "cos" + "");
                }
                else {
                    tvMain.setText(val + "×" + "cos" + "");
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    tvMain.setText(tvMain.getText() + "tan" + "");
                }
                else {
                    tvMain.setText(val + "×" + "tan" + "");
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    tvMain.setText(tvMain.getText() + "ln" + "");
                }
                else {
                    tvMain.setText(val + "×" + "ln" + "");
                }
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    tvMain.setText(tvMain.getText() + "log" + "");
                }
                else {
                    tvMain.setText(val + "×" + "log" + "");
                }
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "^" + "(-1)");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "×");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if(!str.equals("-")){
                    tvMain.setText(tvMain.getText() + "-");
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(val);
                    double sqrt = Math.sqrt(value);
                    tvMain.setText(String.valueOf(sqrt));
                    tvsec.setText("√"+val);
                }

            }
        });
        bequal.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                String replacestr = str.replace("÷", "/").replace("×", "*");
                Double result = evaluate(replacestr);
                String r = result.toString();
                tvMain.setText(r);
                tvsec.setText(str);
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if(!str.equals("")){
                    str = str.substring(0, str.length()-1);
                    tvMain.setText(str);
                }
            }
        });



        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = tvMain.getText().toString();
                if (value.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter a valid number..", LENGTH_SHORT).show();
                }
                else{
                    int val = Integer.parseInt(value);
                    int fact = factorial(val);
                    tvMain.setText(String.valueOf(fact));
                    tvsec.setText(value + "!");
                }

            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter a valid number..", LENGTH_SHORT).show();
                }
                else{
                    double value = Double.parseDouble(val);
                    double square = value*value;
                    tvMain.setText(String.valueOf(square));
                    tvsec.setText("("+val +")"+ "²");
                }

            }


        });
        bcuberoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", LENGTH_SHORT).show();
                }
                else {
                    double value = Double.parseDouble(val);
                    double sqrt = Math.cbrt(value);
                    tvMain.setText(String.valueOf(sqrt));
                    tvsec.setText("3√"+val);
                }
            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", LENGTH_SHORT).show();
                }
                else {
                    tvMain.setText(tvMain.getText() + "^" + "");
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "%");
            }
        });

        bdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = tvMain.getText().toString();
                tvsec.setText(input);
                String dataType = null;

                // checking for Integer
                if (input.matches("\\d+")) {
                    dataType = "Integer";
                }

                // checking for floating point numbers
                else if (input.matches("\\d*[.]\\d+")) {
                    dataType = "Double";
                }

                // checking for date format dd/mm/yyyy
                else if (input.matches(
                        "\\d{2}[/]\\d{2}[/]\\d{4}")) {
                    dataType = "Date";
                }

                // checking for String
                else {
                    dataType = "String";
                }

                tvMain.setText(dataType);
            }
        });

        bprime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                tvsec.setText(val);
                int i,m=0,flag=0;
                int n= Integer.parseInt(val);//it is the number to be checked
                m=n/2;
                if(n==0||n==1){
                    tvMain.setText("Not a Prime No.");
                }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            tvMain.setText("Not a Prime No.");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)  { tvMain.setText("A Prime No."); }
                }//end of else
            }
        });

        beven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                tvsec.setText(val);
                int n = Integer.parseInt(val);
                if (n%2 == 0){
                    tvMain.setText("Even No.");
                }
                else {
                    tvMain.setText("Odd No.");
                }
            }
        });

        bpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                tvsec.setText(val);
                int r,sum=0,temp;
                int n= Integer.parseInt(val);//It is the number variable to be checked for palindrome

                temp=n;
                while(n>0){
                    r=n%10;  //getting remainder
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                    tvMain.setText("Palindrome");
                else
                    tvMain.setText("Not Palindrome");
            }
        });

        bmodulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                if (val.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", LENGTH_SHORT).show();
                }
                else {
                    tvMain.setText(tvMain.getText() + " M " + "");
                }
            }
        });



    }

    private int factorial(int val) {
        return  (val==1 || val ==0)? 1 : val*factorial(val-1);
    }

    private Double evaluate(String str) {
        return new Object(){
//            Creating variable and tracking the position
            int pos = -1, ch;

            void nextChar(){
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat){
                while(ch == ' ') nextChar();
                if (ch == charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse(){
                nextChar();
                double x = parseExpression();
                if(pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for(;;){
                    if(eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            private double parseTerm() {
                double x = parseFactor();
                for (;;){
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else if (eat('%')) x = x/100 * parseFactor();
                    else if (eat('M')) x = x % parseFactor();
                    else return x;
                }
            }

            private double parseFactor() {
                if (eat('+')) return parseFactor();
                else if (eat('-')) return parseFactor();

                double x;

                int startPos = this.pos;

                if (eat('(')){
                    x = parseExpression();
                    eat(')');
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.'){
                    while((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if (ch >= 'a' && ch <= 'z'){
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);


                    x = parseFactor();

                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")){
                        x = Math.sin(Math.toRadians(x));
                    }
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: "+ func);
                }
                else{
                    throw new RuntimeException("Unexpected: "+ (char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

}