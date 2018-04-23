package com.example.unknown.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMoveActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button)findViewById(R.id.btnMove);
        btnMoveActivity.setOnClickListener(this);
    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id   .btnMove:
                Intent moveIntent = new Intent(MainActivity.this, Activity2.class);
                startActivity(moveIntent);
                break;
        }
    }
}
