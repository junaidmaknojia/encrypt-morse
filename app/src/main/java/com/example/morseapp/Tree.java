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

//    private void createTree(preorder, inorder) {
//            if (!preorder.length && !inorder.length) return null;
//
//            let splitpoint = inorder.indexOf(preorder[0]);
//            let leftInorder = inorder.slice(0, splitpoint);
//            let rightInorder = inorder.slice(splitpoint + 1);
//            preorder.shift();
//            let leftPreorder = preorder.slice(0, leftInorder.length);
//            let rightPreorder = preorder.slice(leftInorder.length);
//
//            return { "val": inorder[splitpoint], "left": buildTree(leftPreorder, leftInorder), "right": buildTree(rightPreorder, rightInorder) }
//    }
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
