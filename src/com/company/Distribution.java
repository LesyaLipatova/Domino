package com.company;

import java.util.LinkedList;

public class Distribution {

    public static LinkedList distribute() {
        LinkedList distributionList = new LinkedList();
    for (int i = 0; i < 7; i++) {
        int randomIndex = Random.interval(0, 27);
        distributionList.add(Pack.packtegte().get(randomIndex));
        Pack.packtegte().remove(randomIndex);
    }
    return distributionList;
    }
}
