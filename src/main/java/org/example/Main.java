package org.example;


import org.example.models.TreeNode;
import org.example.neetcode.trees.ReverseBinaryTree;

public class Main {

    static void main(String[] args) {
        ReverseBinaryTree.example(new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null))));
    }


}