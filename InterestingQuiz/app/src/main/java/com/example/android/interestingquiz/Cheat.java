package com.example.android.interestingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Cheat extends AppCompatActivity {

    private Button mShowAnswer;
    private TextView text;
    private int count;
    private int Frequency=0;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        Intent intent = getIntent();
        count = intent.getIntExtra("qwe", 0);

        mShowAnswer=(Button)findViewById(R.id.sa);
        mShowAnswer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View t){
                Frequency++;
                text = (TextView)findViewById(R.id.tt);
                if(count == 0){
                    text.setText("True");
                }
                if(count==1){
                    text.setText("True");
                }
                if(count==2){
                    text.setText("True");
                }
                if(count==3){
                    text.setText("False");
                }
            }
        });

//        Intent intent = getIntent();
//        String countStr = intent.getStringExtra("qwe");
//        int count = parseInt(countStr);
    }
    public void Toast(View view){
        Toast.makeText(this,"You have cheated for "+Frequency+" times ",Toast.LENGTH_LONG).show();
    }

}
