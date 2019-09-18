package com.example.studyflash;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button flashCardButton;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flashCardButton = findViewById(R.id.flashCardButton);
        flashCardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                flashCardActivity();
            }
        });
    }

    public void flashCardActivity()
    {
        Intent intent = new Intent(this, flashCardActivity.class);
        startActivity(intent);
    }
}
