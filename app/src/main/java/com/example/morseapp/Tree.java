package com.example.morseapp;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.Arrays;

class BinaryTree {

    public BinaryTree() {
//        Object val;
    }

    private static final String DEBUG_TAG = "Gestures";

    private void searchTree(String direction){
        if(direction == "left"){
//            return val.left;
        }else if(direction == "right"){
            // return val.right;
        }
    }

//    private String[] slice(String[] array, int start, int end){
//        Log.d(DEBUG_TAG, "The end: " + end);
//        Log.d(DEBUG_TAG, "The start: " + start);
//        int length = end-start;
//        Log.d(DEBUG_TAG, "Here's the length: " + length);
//        String[] hermes = new String[length];
//        for (int i = 0; i < hermes.length; i++) {
//            hermes[i] = array[start + i];
//        }
//        return hermes;
//    }

//    private String[] shift(String[] array){
//        for(int i=0; i<array.length-1; i++){
//            array[i] = array[i+1];
//        }
//        return array;
//    }

    public Node createTree(String[] preorder, String[] inorder) {
        if (preorder.length==0 && inorder.length==0){
           return null;
        }
//        Log.d(DEBUG_TAG, "preorder[0]: " + preorder[0]);
//        int splitpoint = Arrays.binarySearch(inorder, preorder[0]);
//        Log.d(DEBUG_TAG, "Splitpoint: " + splitpoint);
//        String[] leftInorder = this.slice(inorder,0, splitpoint);
//        String[] rightInorder = this.slice(inorder,splitpoint + 1, inorder.length);
//        preorder = this.shift(preorder);
//        String[] leftPreorder = this.slice(preorder, 0, leftInorder.length);
//        String[] rightPreorder = this.slice(preorder, leftInorder.length, preorder.length);

//        Node node = new Node(inorder[splitpoint]);
//        node.left = this.createTree(leftPreorder, leftInorder);
//        node.right = this.createTree(rightPreorder, rightInorder);

        Node root = new Node("START");
        root.left = new Node("T");


        return root;
    }
}

class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
