package com.mooi.vplay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

public class TicTacToe extends AppCompatActivity {

    static int[] cells = {0,0,0,0,0,0,0,0,0};
    static Boolean playerTurn = true ;  // true = p1 && p2 = false
    int gameOverCount = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        ShapeableImageView cell0 = findViewById(R.id.cell0);
        ShapeableImageView cell1 = findViewById(R.id.cell1);
        ShapeableImageView cell2 = findViewById(R.id.cell2);
        ShapeableImageView cell3 = findViewById(R.id.cell3);
        ShapeableImageView cell4 = findViewById(R.id.cell4);
        ShapeableImageView cell5 = findViewById(R.id.cell5);
        ShapeableImageView cell6 = findViewById(R.id.cell6);
        ShapeableImageView cell7 = findViewById(R.id.cell7);
        ShapeableImageView cell8 = findViewById(R.id.cell8);


        TextView textp1 = findViewById(R.id.textp1);
        TextView textp2 = findViewById(R.id.textp2);


        cell0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell0.getTag().toString());
               play(a,cell0,textp1,textp2);
            }
        });
        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell1.getTag().toString());

                play(a,cell1,textp1,textp2);
            }
        });
        cell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell2.getTag().toString());
                play(a,cell2,textp1,textp2);
            }
        });
        cell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell3.getTag().toString());
                play(a,cell3,textp1,textp2);
            }
        });
        cell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell4.getTag().toString());
                play(a,cell4,textp1,textp2);
            }
        });
        cell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell5.getTag().toString());
                play(a,cell5,textp1,textp2);
            }
        });
        cell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell6.getTag().toString());
                play(a,cell6,textp1,textp2);
            }
        });
        cell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell7.getTag().toString());
                play(a,cell7,textp1,textp2);
            }
        });
        cell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(cell8.getTag().toString());
                play(a,cell8,textp1,textp2);
            }
        });
    }



    @SuppressLint("ResourceAsColor")
    public void play(int tag, ShapeableImageView view,TextView textp1 ,TextView textp2 ){

      if(cells[tag] == 0){
          if(playerTurn == true ){
              p1(view);
              cells[tag] = 1;
          }else if(playerTurn == false ) {
              p2(view);
              cells[tag] = 2;
          }
      }
      boolean clr = checkwinner(textp1 , textp2);
      if(clr ){
            clear();
          gameOverCount = 0;
      }

      // DeLAY    Method will be here

       if(gameOverCount == 9){
            clear();
           gameOverCount = 0;
      }

    }
    public void p1(ShapeableImageView view){
        view.setImageResource(R.drawable.panda_head);
        playerTurn = false;
        ((TextView)findViewById(R.id.textp2)).setText("p2 Trun");
        ((TextView)findViewById(R.id.textp1)).setText("");
        gameOverCount++;
        Toast.makeText(this, "c" + gameOverCount, Toast.LENGTH_SHORT).show();


    }

    public void p2(ShapeableImageView view){
        view.setImageResource(R.drawable.wolf_head);
        playerTurn = true;
        ((TextView)findViewById(R.id.textp1)).setText("p1 Trun");
        ((TextView)findViewById(R.id.textp2)).setText("");
        gameOverCount++;
        Toast.makeText(this, "c" + gameOverCount, Toast.LENGTH_SHORT).show();

    }
    public  boolean checkwinner(TextView textp1 ,TextView textp2){
        if(     cells[0] == cells[1] && cells[1] == cells[2] && cells[0]!= 0 && cells[2] != 0 ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[3] == cells[4] && cells[4] == cells[5] && cells[3] != 0 && cells[5] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[6] == cells[7] && cells[7] == cells[8] && cells[6] != 0 && cells[8] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[0] == cells[3] && cells[3] == cells[6] && cells[0] != 0 && cells[6] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[1] == cells[4] && cells[4] == cells[7] && cells[1] != 0 && cells[7] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[2] == cells[5] && cells[8] == cells[5] && cells[2] != 0 && cells[8] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[0] == cells[4] && cells[4] == cells[8] && cells[0] != 0 && cells[8] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }else if(
                cells[2] == cells[4] && cells[4] == cells[6] && cells[2] != 0 && cells[6] != 0  ){
            if(playerTurn == false){
                // p1 won
                textp1.setText("p1 Won");


            }else{
                textp2.setText("p2 Won");
            }

            return true;
        }

        return false;

    }
    public  void clear(){
        ((ShapeableImageView)findViewById( R.id.cell0 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell1 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell2 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell3 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell4 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell5 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell6 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell7 )).setImageResource( 0 );
        ((ShapeableImageView)findViewById( R.id.cell8 )).setImageResource( 0 );
        for (int i = 0; i < cells.length; i++) {
            cells[i] = 0;
        }
        ((TextView)findViewById(R.id.textp1)).setText("p1 turn");
        ((TextView)findViewById(R.id.textp2)).setText("");
        playerTurn = true ;
    }
}