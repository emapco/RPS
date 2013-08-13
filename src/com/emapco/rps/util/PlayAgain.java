package com.emapco.rps.util;

import javax.swing.*;

public class PlayAgain {

    public static boolean getPlayAgain() {
        int answer = JOptionPane.showConfirmDialog(null,
                "Would you like to play again?");

        return (answer == JOptionPane.YES_OPTION);
    }

}
