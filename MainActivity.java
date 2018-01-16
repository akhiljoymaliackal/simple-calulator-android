package com.example.akhiljoymaliackal.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText n1=(EditText)findViewById(R.id.no1);
        final EditText n2=(EditText)findViewById(R.id.no2);
        final TextView res=(TextView) findViewById(R.id.res);
        Button sbadd=(Button)findViewById(R.id.badd);
        Button sbmul=(Button)findViewById(R.id.bmul);
        Button sbdiv=(Button)findViewById(R.id.bdiv);
        Button sbsub=(Button)findViewById(R.id.bsub);



        sbadd.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String num1=n1.getText().toString();
                        String num2=n2.getText().toString();
                        int intno1=Integer.parseInt(num1);
                        int intno2=Integer.parseInt(num2);
                        int sumf=intno1+intno2;

                        String ssumf=String.valueOf(sumf);
                        res.setText(ssumf);

                    }
                }

        );
        sbmul.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String num1=n1.getText().toString();
                        String num2=n2.getText().toString();
                        int intno1=Integer.parseInt(num1);
                        int intno2=Integer.parseInt(num2);

                        int mulf=intno1*intno2;

                        String smulf=String.valueOf(mulf);
                        res.setText(smulf);

                    }
                }

        );
        sbdiv.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String num1 = n1.getText().toString();
                        String num2 = n2.getText().toString();
                        if (num1 != "" && num2 != "") {
                            int intno1 = Integer.parseInt(num1);
                            int intno2 = Integer.parseInt(num2);

                            float divf = intno1 / (float) intno2;

                            String sdivf = String.valueOf(divf);
                            res.setText(sdivf);

                        }
                    }

                });
        sbsub.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String num1 = n1.getText().toString();
                        String num2 = n2.getText().toString();
                        if (num1 != "" && num2 != "") {
                            int intno1 = Integer.parseInt(num1);
                            int intno2 = Integer.parseInt(num2);

                            int subf = intno1 - intno2;
                            String ssubf = String.valueOf(subf);
                            res.setText(ssubf);

                        }
                    }
                }

        );


    }


}
