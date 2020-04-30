package com.ingenicomovement.belajarsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public EditText txtUsername, txtPassowrd;
    public Button btnLogin;

    public AlertDialogManager alert = new AlertDialogManager();

    SessionManagement sessionManagement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sessionManagement = new SessionManagement(getApplicationContext());

        txtUsername= findViewById(R.id.txtUsername);
        txtPassowrd=findViewById(R.id.txtPassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String username = txtUsername.getText().toString();
              String password = txtPassowrd.getText().toString();

              if (username.trim().length()>0 && password.trim().length()>0){
                  if (username.equals("test") && password.equals("test")){
                      sessionManagement.createLoginSession("Android Hive", "androidhive@gmail.com");
                      Intent i = new Intent(getApplicationContext(),MainActivity.class);
                      startActivity(i);
                      finish();
                  }else {
                      alert.showAlertDialog(LoginActivity.this,"Login False ", "Username/ Passowr Incorect", false);

                  }



              }
              else {
                  alert.showAlertDialog(LoginActivity.this, "Login Failed", "Please enter username adn password", false);
              }

            }
        });



    }
}
