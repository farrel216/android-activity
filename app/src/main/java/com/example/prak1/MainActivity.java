package com.example.prak1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvResult;
    private EditText etWidth;
    private EditText etLength;
    private EditText etHeight;
    private Button btnCalculate;
    private Button btnCalculate2;
    private Button btnCalculate3;

    private String KEY_RESULT = "key_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        etWidth = findViewById(R.id.et_width);
        etLength = findViewById(R.id.et_length);
        etHeight = findViewById(R.id.et_height);
        btnCalculate = findViewById(R.id.btn_calculate);
        btnCalculate2 = findViewById(R.id.btn_calculate2);
        btnCalculate3 = findViewById(R.id.btn_calculate3);

        btnCalculate.setOnClickListener(this);
        btnCalculate2.setOnClickListener(this);
        btnCalculate3.setOnClickListener(this);
        if (savedInstanceState != null) {
            String result = savedInstanceState.getString(KEY_RESULT);
            tvResult.setText(result);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String calculationResult = tvResult.getText().toString();
        outState.putString(KEY_RESULT, calculationResult);
    }
    @Override
    public void onClick(View view) {
        // Perintah hanya akan dieksekusi jika btn_calculate ditekan
        if (view.getId() == R.id.btn_calculate) {
        // Ambil nilai yang diberikan pengguna pada seluruh EditText
            String inputLength = etLength.getText().toString().trim();
            String inputWidth = etWidth.getText().toString().trim();
            String inputHeight = etHeight.getText().toString().trim();
            boolean isEmptyFields = false;
            if (inputLength.isEmpty()) {
                isEmptyFields = true;
                etLength.setError("Field ini tidak boleh kosong");
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true;
                etWidth.setError("Field ini tidak boleh kosong");
            }
            if (inputHeight.isEmpty()) {
                isEmptyFields = true;
                etHeight.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                // Hitung volume balok
                double volume = Double.parseDouble(inputLength) *
                        Double.parseDouble(inputWidth) *
                        Double.parseDouble(inputHeight);
                // Tampilkan hasil perhitungan ke TextView -> tvResult
                tvResult.setText(String.format("Volume: %s",
                        String.valueOf(volume)));
            }

        }
        else if (view.getId() == R.id.btn_calculate2) {
            // Ambil nilai yang diberikan pengguna pada seluruh EditText
            String inputLength = etLength.getText().toString().trim();
            String inputWidth = etWidth.getText().toString().trim();
            String inputHeight = etHeight.getText().toString().trim();
            boolean isEmptyFields = false;
            if (inputLength.isEmpty()) {
                isEmptyFields = true;
                etLength.setError("Field ini tidak boleh kosong");
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true;
                etWidth.setError("Field ini tidak boleh kosong");
            }
            if (inputHeight.isEmpty()) {
                isEmptyFields = true;
                etHeight.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                // Hitung volume balok
                double luasPermukaan = 2 * (Double.parseDouble(inputLength) *
                        Double.parseDouble(inputWidth) +
                        Double.parseDouble(inputWidth) *
                                Double.parseDouble(inputHeight) +
                        Double.parseDouble(inputHeight) *
                                Double.parseDouble(inputLength));
                // Tampilkan hasil perhitungan ke TextView -> tvResult
                tvResult.setText(String.format("Luas Permukaan: %s",
                        String.valueOf(luasPermukaan)));
            }
        }
        else if (view.getId() == R.id.btn_calculate3) {
            // Ambil nilai yang diberikan pengguna pada seluruh EditText
            String inputLength = etLength.getText().toString().trim();
            String inputWidth = etWidth.getText().toString().trim();
            String inputHeight = etHeight.getText().toString().trim();
            boolean isEmptyFields = false;
            if (inputLength.isEmpty()) {
                isEmptyFields = true;
                etLength.setError("Field ini tidak boleh kosong");
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true;
                etWidth.setError("Field ini tidak boleh kosong");
            }
            if (inputHeight.isEmpty()) {
                isEmptyFields = true;
                etHeight.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                // Hitung volume balok
                double keliling = 4 * (Double.parseDouble(inputLength) +
                        Double.parseDouble(inputWidth) +
                        Double.parseDouble(inputHeight));
                // Tampilkan hasil perhitungan ke TextView -> tvResult
                tvResult.setText(String.format("Keliling: %s",
                        String.valueOf(keliling)));
            }
        }
    }
}