package com.example.modulsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        String tangkap = getIntent().getStringExtra("lempar");
        tampil = findViewById(R.id.Username);
        tampil.setText(tangkap);
    }

    public void pindah4(View view) {
        Intent tika2 = new Intent(EndActivity.this, MainActivity.class);
        startActivity(tika2);
    }
    TextView tampil;
}
