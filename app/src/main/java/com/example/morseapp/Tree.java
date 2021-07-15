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

    public Node createTree() {
//        if (preorder.length==0 && inorder.length==0){
//           return null;
//        }
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

        // LEFT TREE
        root.left = new Node("T");
        root.left.left = new Node("M");
        root.left.left.left = new Node("O");
        root.left.left.left.left = new Node("-");
        root.left.left.left.left.left = new Node("0");
        root.left.left.left.left.right = new Node("9");
        root.left.left.left.right = new Node(".");
        root.left.left.left.right.right = new Node("8");
        root.left.left.right = new Node("G");
        root.left.left.right.left = new Node("Q");
        root.left.left.right.right = new Node("Z");
        root.left.left.right.right.right = new Node("7");
        root.left.right = new Node("N");
        root.left.right.right = new Node("D");
        root.left.right.right.right = new Node("B");
        root.left.right.right.right.right = new Node("6");
        root.left.right.right.left = new Node("X");
        root.left.right.left = new Node("K");
        root.left.right.left.left = new Node("Y");
        root.left.right.left.right = new Node("C");

        // RIGHT TREE
        root.right = new Node("E");
        root.right.left = new Node("A");
        root.right.left.left = new Node("W");
        root.right.left.right = new Node("R");
        root.right.left.right.right = new Node("L");
        root.right.left.left.left.left = new Node("1");
        root.right.left.left.left = new Node("J");
        root.right.left.left.right = new Node("P");
        root.right.right = new Node("I");
        root.right.right.right = new Node("S");
        root.right.right.right.right = new Node("H");
        root.right.right.right.right.right = new Node("5");
        root.right.right.left = new Node("U");
        root.right.right.left.right = new Node("F");
        root.right.right.left.left = new Node("-");
        root.right.right.left.left.left = new Node("2");
        root.right.right.right.left = new Node("V");
        root.right.right.right.left.left = new Node("3");
        root.right.right.right.right.left = new Node("4");
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
