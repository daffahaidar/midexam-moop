package com.daffahaidar.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    TextView result;
    Button plus;
    Button devide;
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.arraydisplay);
        result = findViewById(R.id.result);
        plus = findViewById(R.id.jumlah);
        devide = findViewById(R.id.bagi);


        for (int i = 0; i < numbers.length; i++) {
            display.append(numbers[i] + " ");
        }

        plus.setOnClickListener(v -> {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            result.setText(sum + "");
        }
        );

        devide.setOnClickListener(v -> {
            double result2[] = new double[numbers.length];
            result.setText("");
            try {
                for (int i = 0; i < numbers.length; i++) {
                    result2[i] = numbers[i+1] / numbers[i];
                }
            }catch (ArithmeticException e){
                result.setText("Error");
            }
            for (int i = 0; i < result2.length; i++) {
                result.append(String.format("%.2f", result2[i]) + "\n");
            }
        }
        );
    }
}