package com.emapco.rps.main;

import com.emapco.rps.util.PlayAgain;

public class Main {

    public static void main(String[] args) {

        boolean playAgain;

        RPS rps = new RPS();

        do {

        rps.start();
        playAgain = PlayAgain.getPlayAgain();

        } while(playAgain);

    }

}
