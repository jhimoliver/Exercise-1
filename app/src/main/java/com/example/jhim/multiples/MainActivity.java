package com.example.jhim.multiples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.Bind;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View e) {
        Button btnDisplay = (Button) findViewById(R.id.btnDisplay);
        TextView txtResultThree = (TextView) findViewById(R.id.result_3);
        TextView txtResultFive = (TextView) findViewById(R.id.result_5);
        TextView txtResultBoth = (TextView) findViewById(R.id.result_both);

//        int mul_five = 0;
//
//        while (mul_five < 100) {
//            mul_five = mul_five + 5;
//            txtResultFive.append(" " + mul_five + " = Keepo");
//        }
//
//        int mul_three = 0;
//
//        while (mul_three < 99) {
//            mul_three = mul_three + 3;
//            txtResultThree.append(" " + mul_three + " = Kappa");
//        }
//
//        int both = 0;
//
//        while (both < 90) {
//            both = both + 15;
//            txtResultBoth.append(" " + both + " = KappaKeepo");
//        }

        int x = 100;

        for(int counter = 1; counter <= x; counter++){
            if (counter % 3 ==0){
                txtResultThree.append(" " + counter + " = Kappa");
            } if (counter % 5 == 0) {
                txtResultThree.append(" " + counter + " = Keepo");
            } if (counter % 15 == 0) {
                txtResultThree.append(" " + counter + " = KappaKeepo");
            }
        }


        btnDisplay.setEnabled(false);
    }
}
