package com.example.encryptmorse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private ArrayList<String> preOrder;
    private Array inOrder;
    private Array postOrder;
    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
        mDetector = new GestureDetectorCompat(this,this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() {
            @Override
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public boolean onDoubleTap(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }
        });
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
    public boolean onDown(MotionEvent event) {
        Log.d("DEBUG_TAG","onDown: " + event.toString());
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d("DEBUG_TAG", "onFling: " + event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Log.d("DEBUG_TAG", "onLongPress: " + event.toString());
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        Log.d("DEBUG_TAG", "onScroll: " + event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Log.d("DEBUG_TAG", "onShowPress: " + event.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Log.d("DEBUG_TAG", "onSingleTapUp: " + event.toString());
        return true;
    }

}