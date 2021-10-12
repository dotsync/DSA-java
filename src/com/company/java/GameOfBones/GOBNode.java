package com.company.java.GameOfBones;

import lombok.Data;

import java.util.List;

public @Data class GOBNode {
    int bones;
    boolean isMaxPlayer;
    int score;
    List<GOBNode> children;

    public GOBNode(int bones, boolean isMaxPlayer, int score, List<GOBNode> children) {
        this.bones = bones;
        this.isMaxPlayer = isMaxPlayer;
        this.score = score;
        this.children = children;
    }

    public GOBNode(int noOfBones, boolean isMaxPlayer) {
        bones = noOfBones;
        this.isMaxPlayer = isMaxPlayer;
    }
    public void addChild(GOBNode newNode) {
        this.children.add(newNode);
    }
}
