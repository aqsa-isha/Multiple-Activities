package com.example.multipleactivities;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity3 extends AppCompatActivity {
    Button bt_act4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_3);
        bt_act4 = (Button) findViewById(R.id.btn3);
        bt_act4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, Activity4.class);
                startActivity(intent);
            }
        });
    }
}