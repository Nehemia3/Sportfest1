package com.sportfest.grundschul.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    private EditText txtUserName;
    private EditText txtPassword;
    private TextView txtView1;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUserName = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText)   findViewById(R.id.txtUsername);
        txtView1 = (TextView) findViewById(R.id.txtView1);
        btnLogIn = findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLogIn(txtUserName.getText().toString(), txtPassword.getText().toString());
            }
        });
    }

    private void validateLogIn (String txtUserName, String txtPassword){
        if((txtUserName.equals("Nehemia")) && (txtPassword.equals("1234"))){
            Intent b = new Intent(getApplicationContext(), Home.class);
            startActivity(b);
        }
        else{
            txtView1.setText("Username oder Password falsch");
        }
    }
}
