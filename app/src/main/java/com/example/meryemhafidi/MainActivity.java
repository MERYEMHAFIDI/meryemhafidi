package com.example.meryemhafidi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Login,Pass ;
    private Button btn ;
    private TextView txt ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (EditText) findViewById(R.id.Login) ;
        Pass = (EditText) findViewById(R.id.Pass) ;
        btn = (Button) findViewById(R.id.Btn) ;
        txt = (TextView) findViewById(R.id.Result) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = "Bonjour  : "+Login.getText().toString()+" mote pass : "+Pass.getText().toString() ;
                txt.setText(fullName);
            }
        });

    }

}