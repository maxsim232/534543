package com.codecat.powerclicker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

Button btnGame,btnSettings,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
btnGame=findViewById(R.id.btnGame);
        btnAbout=findViewById(R.id.btnAbout);
        btnSettings=findViewById(R.id.btnSettings);
         btnGame.setOnClickListener(v->  newGame ());
}

    private void newGame() {
        Intent intent = new Intent(MainActivity.this , GameActivity.class);
        startActivity(intent);
    }
}