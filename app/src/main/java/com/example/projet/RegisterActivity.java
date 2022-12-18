package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username ;
    EditText password ;
    EditText repassword ;
    Button  Register ;
    dbHelper DB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username= findViewById(R.id.username) ;
        password = findViewById(R.id.editTextPassword) ;
        repassword= findViewById(R.id.editTextPassword2);
        Register = findViewById(R.id.buttonRegister) ;
        DB=new dbHelper(this);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString() ;
                String pass =  password.getText().toString();
                String repass = repassword.getText().toString();

                if (user.equals("") || pass.equals("") || repass.equals("")) {
                    Toast.makeText(RegisterActivity.this,"Please enter all fleids" , Toast.LENGTH_SHORT).show();
                }
                else {
                    if (pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if (checkuser == false ) {
                            Boolean insert = DB.insertData(user,pass) ;
                            if (insert==true)
                            {
                                Toast.makeText(RegisterActivity.this, "Registred succecfull",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),loginActivity.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(RegisterActivity.this, "Registred Failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else {
                            Toast.makeText(RegisterActivity.this, "user already exist ! please sign In",Toast.LENGTH_SHORT).show();

                        }
                    }
                    else {
                        Toast.makeText(RegisterActivity.this, "Password & Repassword not equals",Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });




    }
}