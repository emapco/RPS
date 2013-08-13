package com.emapco.rps.main;

import com.emapco.rps.util.PlayAgain;

public class Main {

    public static void main(String[] args) {
        boolean playAgain;

        do {
        RPS rps = new RPS();
        playAgain = PlayAgain.getPlayAgain();
        } while(playAgain);

    }

}
