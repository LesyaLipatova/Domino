package com.company;

import java.util.LinkedList;

public class Pack {

    public static LinkedList packtegte() {

        LinkedList<Figurine> pack = new LinkedList();

        Figurine zeroZero = new Figurine(0, 0);

        Figurine zeroOne = new Figurine(0, 1);
        Figurine oneOne =  new Figurine(1, 1);

        Figurine zeroTwo = new Figurine(0, 2);
        Figurine oneTwo =  new Figurine(1, 2);
        Figurine twoTwo =  new Figurine(2, 2);

        Figurine zeroThree =  new Figurine(0, 3);
        Figurine oneThree =   new Figurine(1, 3);
        Figurine twoThree =   new Figurine(2, 3);
        Figurine threeThree = new Figurine(3, 3);

        Figurine zeroFour =  new Figurine(0, 4);
        Figurine oneFour =   new Figurine(1, 4);
        Figurine twoFour =   new Figurine(2, 4);
        Figurine threeFour = new Figurine(3, 4);
        Figurine fourFour =  new Figurine(4, 4);

        Figurine zeroFIve =  new Figurine(0, 5);
        Figurine oneFive =   new Figurine(1, 5);
        Figurine twoFive =   new Figurine(2, 5);
        Figurine threeFive = new Figurine(3, 5);
        Figurine fourFive =  new Figurine(4, 5);
        Figurine fiveFive =  new Figurine(5, 5);

        Figurine zeroSix =  new Figurine(0, 6);
        Figurine oneSix =   new Figurine(1, 6);
        Figurine twoSix =   new Figurine(2, 6);
        Figurine threeSix = new Figurine(3, 6);
        Figurine fourSix =  new Figurine(4, 6);
        Figurine fiveSix =  new Figurine(5, 6);
        Figurine sixSix =   new Figurine(6, 6);

        pack.add(zeroZero);

        pack.add(zeroOne);
        pack.add(oneOne);

        pack.add(zeroTwo);
        pack.add(oneTwo);
        pack.add(twoTwo);

        pack.add(zeroThree);
        pack.add(oneThree);
        pack.add(twoThree);
        pack.add(threeThree);

        pack.add(zeroFour);
        pack.add(oneFour);
        pack.add(twoFour);
        pack.add(threeFour);
        pack.add(fourFour);

        pack.add(zeroFIve);
        pack.add(oneFive);
        pack.add(twoFive);
        pack.add(threeFive);
        pack.add(fourFive);
        pack.add(fiveFive);

        pack.add(zeroSix);
        pack.add(oneSix);
        pack.add(twoSix);
        pack.add(threeSix);
        pack.add(fourSix);
        pack.add(fiveSix);
        pack.add(sixSix);
        return pack;
    }
}
