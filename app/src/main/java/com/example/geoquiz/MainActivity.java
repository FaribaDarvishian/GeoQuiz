package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    private TextView mTextViewQuestion;
    private Button mButtonFalse;
    private Button mButtonTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClickListener();

    }
    private void findViews(){
        mTextViewQuestion=findViewById(R.id.text_view_question);
        mButtonTrue=findViewById(R.id.button_true);
        mButtonFalse=findViewById(R.id.button_false);
    }
    private void setClickListener(){
       mButtonTrue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast toast_correct=Toast.makeText(MainActivity.this,R.string.toast_correct,Toast.LENGTH_SHORT);
               toast_correct.setGravity(Gravity.TOP,0,200);
               TextView toastMessage=(TextView) toast_correct.getView().findViewById(android.R.id.message);
               toastMessage.setTextColor(Color.GREEN);
               toastMessage.setTextSize(30);
               toast_correct.show();

           }
       });
       mButtonFalse.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             Toast toast_incorrect= Toast.makeText(MainActivity.this,R.string.toast_incorrect,Toast.LENGTH_SHORT);
             toast_incorrect.setGravity(Gravity.BOTTOM,0,200);
             TextView toastMessage=(TextView) toast_incorrect.getView().findViewById(android.R.id.message);
             toastMessage.setTextColor(Color.RED);
             toastMessage.setTextSize(30);
             toast_incorrect.show();

           }
       });

    }

}