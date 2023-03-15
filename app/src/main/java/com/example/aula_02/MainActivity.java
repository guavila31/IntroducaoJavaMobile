package com.example.aula_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup groupSexo;
    CheckBox check;
    String[] opcoes = new String[]{"Opção 1", "Opção 2", "Opção 3"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupSexo = (RadioGroup) findViewById(R.id.groupSexo);
        check = (CheckBox) findViewById(R.id.checkBox);
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,opcoes);
        spinner.setAdapter(adapter);
    }

    public void floatButtonClick(View view){
        RadioButton radioSelecionado = (RadioButton) findViewById(groupSexo.getCheckedRadioButtonId());
        String checado = check.isChecked() ? "Sim" : "Não";
        Toast.makeText(this, checado + " " + radioSelecionado.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}