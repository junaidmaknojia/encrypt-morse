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
//        searchRecur(val, currRoot = this.root){
//            if (!this.root) return false;
//
//            if (val === currRoot.val) {
//                return true;
//            } else if (val > currRoot.val) {
//                if (currRoot.right) {
//                    currRoot = currRoot.right;
//                    return this.searchRecur(val, currRoot)
//                }
//
//                return false
//            } else if (val < currRoot.val){
//                if (currRoot.left) {
//                    currRoot = currRoot.left;
//                    return this.searchRecur(val, currRoot)
//                }
//
//                return false;
//            }
//        }
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
