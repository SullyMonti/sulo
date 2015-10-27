package com.queonda.clase_uno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ITP extends AppCompatActivity {

    EditText usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itp);
        usuario = (EditText) findViewById(R.id.usuario);
        contraseña = (EditText)findViewById(R.id.contraseña);

    }
    public void ITP (View view ) {
        if (usuario.getText().toString() == "Gerson"
                && contraseña.getText().toString() == "13220804")
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        else
        {
            Toast.makeText(this, "Datos invalidos", Toast.LENGTH_LONG).show();

        }
    }
}
