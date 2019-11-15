package com.example.modulsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nur=findViewById(R.id.isianNama);
    }

    public void pindah3(View view) {
        String ambilText=nur.getText().toString();
        Intent tika1 = new Intent(LoginActivity.this, EndActivity.class);
        tika1.putExtra("lempar",ambilText); //line untuk melempar ke activity berikutnya melalui variabel bernama lempar.
        startActivity(tika1);
    }

    EditText nur;
}
