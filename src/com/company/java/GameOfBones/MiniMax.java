package com.company.java.GameOfBones;

import java.util.List;

public class MiniMax {
    Tree tree;

    public void constructTree(int noOfBones) {
        tree = new Tree();
        GOBNode root = new GOBNode(noOfBones, true);
        tree.setRoot(root);
        constructTree(root);
    }
    private void constructTree(GOBNode parentNode) {
        // create list of possible heaps
        List<Integer> listOfPossibleHeaps
                = GameOfBones.getPossibleStates(parentNode.getBones());
        boolean isChildMaxPlayer = !parentNode.isMaxPlayer();
        listOfPossibleHeaps.forEach(n -> {
            GOBNode newNode = new GOBNode(n, isChildMaxPlayer);
            parentNode.addChild(newNode);
            if (newNode.getBones() > 0) {
                constructTree(newNode);
            }
        });
    }
}
