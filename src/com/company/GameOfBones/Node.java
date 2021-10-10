package com.company.GameOfBones;

import lombok.Data;

import java.util.List;

public @Data class Node {
    int bones;
    boolean isMaxPlayer;
    int score;
    List<Node> children;

    public Node(int bones, boolean isMaxPlayer, int score, List<Node> children) {
        this.bones = bones;
        this.isMaxPlayer = isMaxPlayer;
        this.score = score;
        this.children = children;
    }

    public Node(int noOfBones, boolean isMaxPlayer) {
        bones = noOfBones;
        this.isMaxPlayer = isMaxPlayer;
    }
    public void addChild(Node newNode) {
        this.children.add(newNode);
    }
}
