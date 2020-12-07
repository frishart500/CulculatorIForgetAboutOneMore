package com.example.appculculatorforsumsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText etNum1, etNum2;
private TextView result;
private Button btnPlus, btnMinus, btnDevision, btnMult;
private float num1 = 0;
private float num2 = 0;
private float resultF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Awake();

        btnPlus.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDevision.setOnClickListener(this);

    }

    private void Awake(){
        result = findViewById(R.id.result);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);

        btnDevision = findViewById(R.id.divisionBtn);
        btnMinus = findViewById(R.id.minusBtn);
        btnMult = findViewById(R.id.multiplyBtn);
        btnPlus = findViewById(R.id.plusBtn);
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch(v.getId()){
            case R.id.divisionBtn:
                resultF = num1 / num2;
                result.setText(toString().valueOf(resultF));
                break;

            case R.id.minusBtn:
                resultF = num1 - num2;
                result.setText(toString().valueOf(resultF));
                break;

            case R.id.multiplyBtn:
                resultF = num1 * num2;
                result.setText(toString().valueOf(resultF));
                break;


            case R.id.plusBtn:
                resultF = num1 + num2;
                result.setText(toString().valueOf(resultF));
                break;
        }
    }
}