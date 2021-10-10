package com.company.GameOfBones;

import java.util.List;

public class MiniMax {
    Tree tree;

    public void constructTree(int noOfBones) {
        tree = new Tree();
        Node root = new Node(noOfBones, true);
        tree.setRoot(root);
        constructTree(root);
    }
    private void constructTree(Node parentNode) {
        // create list of possible heaps
        List<Integer> listOfPossibleHeaps
                = GameOfBones.getPossibleStates(parentNode.getBones());
        boolean isChildMaxPlayer = !parentNode.isMaxPlayer();
        listOfPossibleHeaps.forEach(n -> {
            Node newNode = new Node(n, isChildMaxPlayer);
            parentNode.addChild(newNode);
            if (newNode.getBones() > 0) {
                constructTree(newNode);
            }
        });
    }
}
