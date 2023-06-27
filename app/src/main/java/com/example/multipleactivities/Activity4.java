package com.example.multipleactivities;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity4 extends AppCompatActivity {
    Button bt_act5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_3);
        bt_act5 = (Button) findViewById(R.id.btn4);
        bt_act5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity4.this,Activity2.class);
                startActivity(intent);
            }
   });
}
}