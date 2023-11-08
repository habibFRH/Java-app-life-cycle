package com.example.cycledevie;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonOpenSecondActivity = findViewById(R.id.MainActivity);

        buttonOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the second activity
                //Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                //startActivity(z);
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(),"Appel de la methode :onStart() Second",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getBaseContext(),"Appel de la methode :onResume() Second",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getBaseContext(),"Appel de la methode :onStop() Second",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getBaseContext(),"Appel de la methode :onPause() Second",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), "Appel de la methode :onDestroy() Second", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getBaseContext(),"Appel de la methode :onRestart() Second",Toast.LENGTH_LONG).show();
    }
}
