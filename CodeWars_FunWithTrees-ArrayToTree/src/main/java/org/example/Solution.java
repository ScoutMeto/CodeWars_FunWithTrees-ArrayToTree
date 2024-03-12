package org.example;
public class Solution {

    static TreeNode arrayToTree(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return constructTree(array, 0);
    }

    static TreeNode constructTree(int[] array, int index) {
        if (index >= array.length) {
            return null;
        }
        TreeNode node = new TreeNode(array[index]);
        node.left = constructTree(array, 2 * index + 1);
        node.right = constructTree(array, 2 * index + 2);
        return node;
    }
}