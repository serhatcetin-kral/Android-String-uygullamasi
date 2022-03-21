package com.example.stringuyulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText metinBir;
    EditText metinIki;
    TextView textTutucu;
    Button butonBirlestir;


    String tutucuBir;
    String tutucuIki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       metinBir=findViewById(R.id.ilkYazi);
       metinIki=findViewById(R.id.ikinciYazi);
       textTutucu=findViewById(R.id.textView);





       butonBirlestir=findViewById(R.id.btn);

       butonBirlestir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               tutucuBir=metinBir.getText().toString();
               tutucuIki=metinIki.getText().toString();
               textTutucu.setText(tutucuBir+" "+tutucuIki);



           }
       });

    }
}