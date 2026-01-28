package org.example.neetcode.trees;

import org.example.models.TreeNode;

public class ReverseBinaryTree {

    public static TreeNode example(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        example(root.left);
        example(root.right);

        return root;
    }
}