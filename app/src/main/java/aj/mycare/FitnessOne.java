package aj.mycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FitnessOne extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private Button bmi;
    private TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_one);

        weight = (EditText) findViewById(R.id.bmi_weight);
        height = (EditText) findViewById(R.id.bmi_height);
        bmi = (Button) findViewById(R.id.bmi_btn);
        value = (TextView) findViewById(R.id.bmi_value);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float weight_value = Float.parseFloat(weight.getText().toString());
                float height_value = Float.parseFloat(height.getText().toString());

                float result_value = weight_value/(height_value*height_value);

                String result;

                if(result_value<18.5){
                    result= "Your BMI is " + String.valueOf(result_value) + " and you are Underweight";
                    value.setText(result);
                }
                else if(result_value>=18.5&&result_value<=24.9){
                    result= "Your BMI is " + String.valueOf(result_value) + " and you are Healthyweight";
                    value.setText(result);
                }
                else if(result_value>=25&&result_value<=29.9){
                    result= "Your BMI is " + String.valueOf(result_value) + " and you are Overweight";
                    value.setText(result);
                }
                else if(result_value>=30){
                    result= "Your BMI is " + String.valueOf(result_value) + " and you are Obese";
                    value.setText(result);
                }
            }
        });
    }
}
