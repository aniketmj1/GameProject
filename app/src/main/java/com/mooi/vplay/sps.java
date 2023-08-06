package com.mooi.vplay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class sps extends AppCompatActivity {
    int p1State = 0;
    int p2State = 0;
    int p1Tag = 0 ;
    int p2Tag = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sps);

        ImageView p1st = findViewById(R.id.imageView);
        ImageView p1pap = findViewById(R.id.imageView6);
        ImageView p1sc = findViewById(R.id.imageView7);
        ImageView p2st = findViewById(R.id.imageView8);
        ImageView p2pap = findViewById(R.id.imageView9);
        ImageView p2sc = findViewById(R.id.imageView10);



        p1st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p1st);
            }
        });

        p1pap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p1pap);
            }
        });

        p1sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p1sc);
            }
        });

        p2st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p2st);
            }
        });
        p2pap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p2pap);
            }
        });
        p2sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gamePlay(p2sc);
            }
        });



    }


    public void gamePlay(ImageView view){

        int tag = Integer.parseInt(view.getTag().toString());

        //stone 1 && 4
        //paper 2 && 5
        //scissor 3 && 6

        if(p1State == 0 && tag == 1 || p1State == 0 && tag == 2 || p1State == 0 && tag == 3){
            p1Tag = tag;
            p1State = 1;
        }else if(p2State == 0 && tag == 4 || p2State == 0 &&  tag == 5 || p2State == 0 &&  tag == 6){
            p2Tag = tag;
            p2State = 1;
        }


        if(p1State == 1 && p2State ==1){
            checkWinner(p1Tag,p2Tag);
        }
        Toast.makeText(this, "selected " + tag, Toast.LENGTH_SHORT).show();
    }

    public void checkWinner(int p1Tag, int p2Tag) {

        if(p1Tag==1 && p2Tag == 4 || p1Tag==2 && p2Tag == 5 ||p1Tag==3 && p2Tag == 6 ){
            // Match DRAW CONDITION
            Toast.makeText(this, "Match DRAW CONDITION", Toast.LENGTH_SHORT).show();

        } else if (p1Tag==1 && p2Tag == 6 ||p1Tag==2 && p2Tag == 4 ||p1Tag==3 && p2Tag == 5 ) {
            //P1 WON CONDITION
            Toast.makeText(this, "P1 WON CONDITION", Toast.LENGTH_SHORT).show();

        } else if(p1Tag==3 && p2Tag == 4 || p1Tag==1 && p2Tag == 5 || p1Tag==2 && p2Tag == 6 ){
            //P2 WON CONDITION
            Toast.makeText(this, "P2 WON CONDITION", Toast.LENGTH_SHORT).show();
        }
        p1State = 0;
        p2State = 0;
    }


}