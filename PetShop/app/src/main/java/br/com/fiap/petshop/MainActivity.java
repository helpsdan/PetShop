package br.com.fiap.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgCachorros;
    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacinas;
    TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdgCachorros = findViewById(R.id.rdgCachorros);
        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacinas = findViewById(R.id.chkVacinas);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        double resultado = 0;

        int selecionado = rdgCachorros.getCheckedRadioButtonId();

        switch (selecionado){
            case R.id.rdbBorderCollie:
                resultado = 800;
                break;
            case R.id.rdbPitBull:
                resultado = 800;
                break;
            case R.id.rdbPastorAlemao:
                resultado = 800;
                break;
            case R.id.rdbPastorCanadense:
                resultado = 800;
                break;
        }

        if (chkFemea.isChecked()){
            resultado += 180;
        }
        if (chkAdestrado.isChecked()){
            resultado += 400;
        }
        if (chkVacinas.isChecked()){
            resultado += 200;
        }

        txtResultado.setText(String.valueOf(resultado));
    }
}
