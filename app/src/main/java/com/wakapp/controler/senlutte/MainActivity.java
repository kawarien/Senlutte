package com.wakapp.controler.senlutte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtLogin, txtPassword;
    private Button btnConnexion, btnInscription;
    private String login,password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtLogin=(EditText)findViewById(R.id.txtLogin);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        btnConnexion=(Button) findViewById(R.id.btnConnexion);
        btnInscription=(Button)findViewById(R.id.btnInscription);

        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login=txtLogin.getText().toString().trim();
                password=txtPassword.getText().toString().trim();

                if (login.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(MainActivity.this, getString(R.string.error_connetion),Toast.LENGTH_SHORT).show();

                }
                else{

                    //Intent intent=new Intent(ConnexionActivity.this,HomeActivity.class);
                    // startActivity(intent);
                }
            }
        });

        btnInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

    }
}
