package com.example.android.interestingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPreButton;
    private Button mShowAnswer;
    private TextView text;

    public int count = 0;

//    public void Answer(){
//        showAnswer(count);
//    }

//    private Question[]mQuestionBank=new Question[]{
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        mShowAnswer=(Button)findViewById(R.id.sa);
//        mShowAnswer.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View t){
//                showAnswer(count);
//            }
//        });

        mNextButton=(Button)findViewById(R.id.ne);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count = count + 1;
                textShow(count);
            }
        });

        mPreButton=(Button)findViewById(R.id.Pre);
        mPreButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View d){
                count = count - 1;
                textShow(count);
            }
        });


        mTrueButton=(Button)findViewById(R.id.true1);
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
                                       });
        mFalseButton=(Button)findViewById(R.id.false1);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }

    public void openCheatClass(View view){
        Intent i=new Intent(this,Cheat.class);
        i.putExtra("qwe",count);

        startActivity(i);
    }



    public void textShow(int count){
        text = (TextView)findViewById(R.id.tx);
        if(count<0){
            Toast.makeText(this,"No more questions",Toast.LENGTH_LONG).show();
        }
        if(count == 0){
            text.setText("If a piece of paper was folded 45 times, it would reach to the moon.");
        }
        if(count == 1){
            text.setText("It rains diamonds on Saturn and Jupiter.");
        }
        if(count==2){
            text.setText("Mammoths still walked the Earth when the Great Pyramid was being built.");
        }
        if (count==3){
            text.setText("Shaving makes hair grow back faster.");
        }
        if(count>3){
            Toast.makeText(this,"No more questions",Toast.LENGTH_LONG).show();
        }
    }

//    public void showAnswer(int count){
//       text=(TextView)findViewById(R.id.tt);
//        if(count == 0){
//            text.setText("True");
//        }
//        if(count==1){
//            text.setText("True");
//        }
//        if(count==2){
//            text.setText("True");
//        }
//        if(count==3){
//            text.setText("False");
//        }
//    }
}
