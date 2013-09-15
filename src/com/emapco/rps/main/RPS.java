package com.emapco.rps.main;

import javax.swing.*;

import com.emapco.rps.util.Strings;
import com.emapco.rps.util.util;

public class RPS {


    public RPS() {

    }


    public void start() {

        JOptionPane.showMessageDialog(null, "Lets play rock, paper, scissors.");

        String playerChoice = JOptionPane.showInputDialog(null,
            "Pick between rock, paper, or scissors",
            "Enter your choice",
            JOptionPane.QUESTION_MESSAGE);
        checkWinner(playerChoice);

    }


    public static void checkWinner(String player) {
        String cpu = util.getCPUChoice();

        JOptionPane.showMessageDialog(null, "Rock, Paper, Scissors," +
                "\nI picked a " + cpu + "!" +
                "\nYou picked " + player);

        if (player.equalsIgnoreCase("rock")) {
            Strings.displayRock(cpu);
        } else if (player.equalsIgnoreCase("paper")) {
            Strings.displayPaper(cpu);
        } else if (player.equalsIgnoreCase("scissors")) {
            Strings.displayScissor(cpu);
        } else {
            JOptionPane.showMessageDialog(null, "Not a valid choice");
        }

    }

}
