package com.example.multipleactivities;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity2 extends AppCompatActivity {
    Button bt_act3, bt_act4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        bt_act3 = (Button) findViewById(R.id.btn2);
        bt_act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity2.this,Activity3.class);
                startActivity(intent);
            }
           });
   }
}