package com.emapco.rps.main;

import javax.swing.*;
import java.util.Scanner;

import com.emapco.rps.util.Util;

public class RPS {

    public RPS() {
        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Lets play rock, paper, scissors.");

        String playerChoice = JOptionPane.showInputDialog(null,
            "Choice between rock, paper, or scissors",
            "Enter your choice",
            JOptionPane.QUESTION_MESSAGE);
        Util.checkWinner(playerChoice);

        input.close();
    }

}
