package com.cursoandroid.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorteioNum(View view){
        TextView numSorteado = findViewById(R.id.textoResult);


        int valor = new Random().nextInt(11);


        numSorteado.setText(""+ valor);

    }

}