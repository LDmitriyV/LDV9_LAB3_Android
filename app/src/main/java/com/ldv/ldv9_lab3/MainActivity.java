package com.ldv.ldv9_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    // Локальные переменные для доступа к компонентам окна
    private EditText editTextName;
    private TextView textView;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация переменных доступа к компонентам окна
        editTextName = findViewById(R.id.editTextName);
        textView = findViewById(R.id.textView);
        buttonNext = findViewById(R.id.buttonNext);



    }
    public void onNext(View v) {
        // Создание второго окна
        Intent intent = new Intent(this, MidActivity.class);
        intent.putExtra("name", editTextName.getText().toString());
        // Запуск второго окна
        startActivity(intent);
    }

}
