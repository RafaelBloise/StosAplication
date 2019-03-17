package com.example.stosaplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import model.Usuario;

public class MainActivity extends AppCompatActivity {

     Usuario usuario;
     Usuario usuario2;

    public MainActivity() {
        usuario = new Usuario();
        usuario2 = new Usuario();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario.setLogin("admin@stos.mobi");
        usuario.setSenha("12345");


        final EditText email = findViewById(R.id.email);
        final EditText senha = findViewById(R.id.senha);
        Button btnLogin = findViewById(R.id.buttonLogin);
        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Sucesso!");
        alertDialog.setMessage("O Login está correto");


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario.getSenha().equals(senha.getText())
                        &&
                    usuario.getLogin().equals(email.getText())) {

                    alertDialog.show();
                }


            }
        });









    }
}
