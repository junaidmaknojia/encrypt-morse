package com.example.morseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener{

    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    private Node root;
    private Node originalRoot;
    private String message = "";
    private String finalMessage = "";
    private TextView text;
    private TextView messageDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        messageDisplay = findViewById(R.id.textView2);
//         String[] preOrder = {"start", "T", "M", "O", "-", "0", "9", "*", "8", "G", "Q", "Z", "7", "N", "K", "Y", "C", "D", "X", "B", "6", "E", "A", "W", "J", "1", "P", "R", "L", "I", "U", "-", "2", "F", "S", "V", "3", "H", "4", "5"};
//         String [] inOrder = {"0", "-", "9", "O", "*", "8", "M", "Q", "G", "Z", "7", "T", "Y", "K", "C", "N", "X", "D", "B", "6", "start", "1", "J", "W", "P", "A", "R", "L", "E", "2", "-", "U", "F", "I", "3", "V", "S", "4", "H", "5"};
//         postOrder = ["0", "9", "-", "8", "*", "O", "Q", "7", "Z", "G", "M", "Y", "C", "K", "X", "6", "B", "D", "N", "T", "1", "J", "P", "W", "L", "R", "A", "2", "-", "F", "U", "3", "V", "4", "5", "H", "S", "I", "E", "start"];
//        String[] preOrder = getResources().getStringArray(R.array.preOrder);
//        String[] inOrder = getResources().getStringArray(R.array.inOrder);
//        root = tree.createTree(preOrder, inOrder);
        BinaryTree tree = new BinaryTree();
        root = tree.createTree();
        originalRoot = root;

        mDetector = new GestureDetectorCompat(this, this);
        mDetector.setOnDoubleTapListener(this);
    }

    public boolean onTouchEvent(MotionEvent event){
        if(this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
//        Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + event.toString());
        root = root.right;
        if (root != null){
            text.setText(root.value);
            message = message + root.value;
        }
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTap: " + event.toString());
        text.setText("Double Tap, and reset");
        message = "";
        root = originalRoot;
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
//        Log.d(DEBUG_TAG, "onDoubleTapEvent: " + event.toString());
        return true;
    }

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d(DEBUG_TAG,"onDown: " + event.toString());
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onShowPress: " + event.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapUp: " + event.toString());
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        Log.d(DEBUG_TAG, "onScroll: " + event1.toString() + event2.toString());
        finalMessage = "";
        messageDisplay.setText(finalMessage);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onLongPress: " + event.toString());
        text = findViewById(R.id.textView);
        root = root.left;
        if (root != null){
            text.setText(root.value);
            message = message + root.value;
        }
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
//        Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());
        text.setText("Send sentence / Fling");
        finalMessage = finalMessage + " " + message;
        messageDisplay.setText(finalMessage);
        message = "";
        root = originalRoot;
        return true;
    }
}