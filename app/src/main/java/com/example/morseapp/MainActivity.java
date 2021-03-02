package com.example.morseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
             preOrder = ["start", "T", "M", "O", "-", "0", "9", "*", "8", "G", "Q", "Z", "7", "N", "K",
             "Y", "C", "D", "X", "B", "6", "E", "A", "W", "J", "1", "P", "R", "L", "I",
             "U", "-", "2", "F", "S", "V", "3", "H", "4", "5"];
             inOrder = ["0", "-", "9", "O", "*", "8", "M", "Q", "G", "Z", "7", "T", "Y", "K", "C", "N",
             "X", "D", "B", "6", "start", "1", "J", "W", "P", "A", "R", "L", "E", "2", "-",
             "U", "F", "I", "3", "V", "S", "4", "H", "5"];
             postOrder = ["0", "9", "-", "8", "*", "O", "Q", "7", "Z", "G", "M", "Y", "C", "K", "X", "6",
             "B", "D", "N", "T", "1", "J", "P", "W", "L", "R", "A", "2", "-", "F", "U", "3",
             "V", "4", "5", "H", "S", "I", "E", "start"];
         */
    }

    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);
        TextView text = findViewById(R.id.textView);
        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d("DEBUG_TAG","Action was DOWN");
//                text.setText(R.string.screenText);
                if(text != null){
                    text.setText("Down");
                }
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d("DEBUG_TAG","Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d("DEBUG_TAG","Action was UP");
                if(text != null){
                    text.setText("Up");
                }
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                Log.d("DEBUG_TAG","Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                Log.d("DEBUG_TAG","Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }

}