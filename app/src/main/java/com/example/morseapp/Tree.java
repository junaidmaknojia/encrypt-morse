package com.example.morseapp;

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
