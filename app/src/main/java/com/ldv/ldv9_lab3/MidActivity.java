package com.ldv.ldv9_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MidActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid);

        // Инициализация переменных доступа к компонентам окна
        checkBox =   findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        spinner =    findViewById(R.id.spinner);
    }

    public void onFinal(View v) {
        // Создание второго окна
        Intent intent = new Intent(MidActivity.this, FinalActivity.class);

        selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        // Подготовка параметров для второго окна
        intent.putExtra("gender", checkBox.isChecked() ? getString(R.string.Мужской) : getString(R.string.Женский));
        intent.putExtra("language", selectRadioButton.getText());
        intent.putExtra("season", spinner.getSelectedItem().toString());
        intent.putExtra("name", getIntent().getStringExtra("name"));

        // Запуск второго окна
        startActivity(intent);
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

}
