package com.company.java.GameOfBones;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameOfBones {
    static List<Integer> getPossibleStates(int bones) {
        return IntStream.rangeClosed(1,3).boxed()
                .map(i -> bones - i)
                .filter(newCount -> newCount >= 0)
                .collect(Collectors.toList());
    }
}
