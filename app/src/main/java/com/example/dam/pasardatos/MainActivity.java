package com.example.dam.pasardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private  EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ActividadSegunda.class);

                i.putExtra("suma", 3);
                i.putExtra("tv", editText.getText().toString());

                //Esto introduce instrospeccion: muy lento, tarda en ejecutarse
                i.putExtra("objeto", new Objeto(1));

                //Esto nunca va a fallar ya que usamos la implementacion hecha por android studio
                /* Lo que hace es meter el objeto en un tipo de dato llamado parcela
                    Truco: mete todas las variables de instancia en un determinado orden y
                    posteriormente lo leerá en el mismo orden, lo que lo hace mucho mas rapido
                    (Hay casos con problemas pero son muy concretos: sequencias arrays etc)
                */
                i.putExtra("parcelable", new ObjetoBueno(3));

                startActivity(i);


            }
        });

    }
}
