package com.example.encryptmorse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private Array preOrder;
    private Array inOrder;
    private Array postOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preOrder = ["start" "T", "M", "O", "-", "0", "9", "*", "8", "G", "Q", "Z", "7", "N", "K",
                    "Y", "C", "D", "X", "B", "6", "E", "A", "W", "J", "1", "P", "R", "L", "I",
                    "U", "-", "2", "F", "S", "V", "3", "H", "4", "5"];

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);

        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d("DEBUG_TAG","Action was DOWN");
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d("DEBUG_TAG","Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d("DEBUG_TAG","Action was UP");
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

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}