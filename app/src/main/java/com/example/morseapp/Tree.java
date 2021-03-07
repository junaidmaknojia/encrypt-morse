package com.example.morseapp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryTree {

    public BinaryTree() {
//        Object val;
    }

    private void searchTree(String direction){
        if(direction == "left"){
//            return val.left;
        }else if(direction == "right"){
            // return val.right;
        }
    }

    private String[] slice(String[] array, int start, int end){
        String[] hermes = new String[end - start];
        for (int i = 0; i < hermes.length; i++) {
            hermes[i] = array[start + i];
        }
        return hermes;
    }

    private String[] shift(String[] array){
        for(int i=0; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        return array;
    }

    public Node createTree(String []preorder, String[]inorder) {
        if (preorder.length==0 && inorder.length==0){
           return null;
        }
        Integer splitpoint = Arrays.binarySearch(inorder, preorder[0]);
        String[] leftInorder = slice(inorder,0, splitpoint);
        String[] rightInorder = slice(inorder,splitpoint + 1, inorder.length);
        preorder = shift(preorder);
        String[] leftPreorder = slice(preorder, 0, leftInorder.length);
        String[] rightPreorder = slice(preorder, leftInorder.length, preorder.length);

        Node node = new Node(inorder[splitpoint]);
        node.left = createTree(leftPreorder, leftInorder);
        node.right = createTree(rightPreorder, rightInorder);

        return node;
    }
}

class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        right = null;
        left = null;
    }
}
