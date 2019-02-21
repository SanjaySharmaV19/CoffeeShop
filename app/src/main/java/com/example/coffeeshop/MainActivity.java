package com.example.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Submit;
    private EditText Sname;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sname = findViewById(R.id.editText2);
        Password = findViewById(R.id.editText3);
        Submit = findViewById(R.id.button);
        Submit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                submitbtn(Sname.getText().toString(),Password.getText().toString());
            }
        });
    }
    public void submitbtn(String userName,String Userpassword) {
        if (userName.equals("Admin") && Userpassword.equals("12345"))
        {

            Intent i= new Intent(MainActivity.this, Menu.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }
}
