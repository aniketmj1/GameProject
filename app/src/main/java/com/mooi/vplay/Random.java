package com.mooi.vplay;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button btn1 = findViewById( R.id.button );
        Button btn2 = findViewById( R.id.button2 );
        Button btn3 = findViewById( R.id.button3 );
        Button btn4 = findViewById( R.id.button4 );
        Button btn5 = findViewById( R.id.button5 );
        Button btn6 = findViewById( R.id.button6 );
        Button btn7 = findViewById( R.id.button7 );
        Button btn8 = findViewById( R.id.button8 );
        Button btn9 = findViewById( R.id.button9 );


        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn1.getTag().toString() );
                number( tag );
            }
        } );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn2.getTag().toString() );
                number( tag );
            }
        } );

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn3.getTag().toString() );
                number( tag );
            }
        } );

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn4.getTag().toString() );
                number( tag );
            }
        } );

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn5.getTag().toString() );
                number( tag );
            }
        } );

        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn6.getTag().toString() );
                number( tag );
            }
        } );

        btn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn7.getTag().toString() );
                number( tag );
            }
        } );

        btn8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn8.getTag().toString() );
                number( tag );
            }
        } );

        btn9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = Integer.parseInt( btn9.getTag().toString() );
                number( tag );
            }
        } );
    }

    public void number(int tag){
        java.util.Random random = new java.util.Random();
        int b = random.nextInt(10);

        ImageView imageview4 = findViewById( R.id.imageView4 );
        //imageview4.setImageResource( R.drawable.o1 );
        if(b == 1){
            imageview4.setImageResource( R.drawable.onee );
        }
        if(b == 2){
            imageview4.setImageResource( R.drawable.twoo );
        }if(b == 3){
            imageview4.setImageResource( R.drawable.threee );
        }if(b == 4){
            imageview4.setImageResource( R.drawable.fourr );
        }if(b == 5){
            imageview4.setImageResource( R.drawable.five );
        }if(b == 6){
            imageview4.setImageResource( R.drawable.six );
        }if(b == 7){
            imageview4.setImageResource( R.drawable.seven );
        }if(b == 8){
            imageview4.setImageResource( R.drawable.eight );
        }if(b == 9){
            imageview4.setImageResource( R.drawable.nine );
        }


        if(tag == b){
            Toast.makeText( this, "YOU WON", Toast.LENGTH_SHORT ).show();
        }else{
            Toast.makeText( this,"Try Again You had selected " + tag,Toast.LENGTH_SHORT ).show();
        }


    }
}