package com.example.android.geoquizcard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anning on 2018/3/22.
 */

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;



    public QuestionViewHolder(View itemView, final Context context, final List<Question> questions) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (ImageView) itemView.findViewById(R.id.imageView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionCountry.getText().equals("Asia")) {
                    Toast.makeText(context, String.valueOf(questions.get(0).isTrue), Toast.LENGTH_SHORT).show();
                }
                if(questionCountry.getText().equals("Australia")){
                    Toast.makeText(context, String.valueOf(questions.get(2).isTrue), Toast.LENGTH_SHORT).show();
                }
                if(questionCountry.getText().equals("Africa")){
                    Toast.makeText(context, String.valueOf(questions.get(3).isTrue), Toast.LENGTH_SHORT).show();
                }
                if(questionCountry.getText().equals("Mideast")){
                    Toast.makeText(context, String.valueOf(questions.get(4).isTrue), Toast.LENGTH_SHORT).show();
                }
                if(questionCountry.getText().equals("Americas")){
                    Toast.makeText(context, String.valueOf(questions.get(5).isTrue), Toast.LENGTH_SHORT).show();
                }
                if(questionCountry.getText().equals("Oceans")){
                    Toast.makeText(context, String.valueOf(questions.get(6).isTrue), Toast.LENGTH_SHORT).show();
                }
//fdgdfg
            }
        });
    }
}



