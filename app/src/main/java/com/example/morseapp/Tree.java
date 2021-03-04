package com.example.morseapp;

import java.lang.reflect.Array;

public class Tree {

    public Tree() {
        Object val;

    }

    private void searchTree(String direction){
        if(direction == "left"){
//            return val.left;
        }else if(direction == "right"){
            // return val.right;
        }
    }

    private String[] createTree(String []preorder, String[]inorder) {
        if (!preorder.length && !inorder.length){
//                return null;
        }

        Integer splitpoint = inorder.indexOf(preorder[0]);
        String[] leftInorder = inorder.slice(0, splitpoint);
        String[] rightInorder = inorder.slice(splitpoint + 1);
        preorder.shift();
        String[] leftPreorder = preorder.slice(0, leftInorder.length);
        String[] rightPreorder = preorder.slice(leftInorder.length);

        return { "val": inorder[splitpoint], "left": createTree(leftPreorder, leftInorder), "right": createTree(rightPreorder, rightInorder) }
    }
}

class TreeNode {
    private final String val;
    private final String left;
    private final String right;

    private TreeNode(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
