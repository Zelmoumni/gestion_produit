package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {
EditText editTextEmail ;
EditText editTextPassword ;
TextView T_reg ;
dbHelper DB ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        DB = new dbHelper(this );
        T_reg=findViewById(R.id.lien_register) ;

        findViewById(R.id.buttonLogin).setOnClickListener((View.OnClickListener) this);
    }
    private  void register()
    {
        Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);
    }
    private void userLogin(){
        final String email = editTextEmail.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }


        if (password.isEmpty()) {
            editTextPassword.setError("Password required");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 4) {
            editTextPassword.setError("Password should be atleast 4 character long");
            editTextPassword.requestFocus();
            return;
        }

        Boolean checkuserpass = DB.checkusernamepassword(email,password);
        if (checkuserpass==true)
        {
            Toast.makeText(loginActivity.this,"Sign succefully",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),homeActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(loginActivity.this,"Sign failed",Toast.LENGTH_SHORT).show();

        }


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                userLogin();
                break;
            case R.id.lien_register:
                register() ;
                break ;
        }
    }



}