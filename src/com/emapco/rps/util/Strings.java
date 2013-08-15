package com.emapco.rps.util;

import javax.swing.*;

public class Strings {

    private static final String TIED = "We tied.";

    private static final String ROCK_LOSE_PBR = "You lose! Paper beats rock!";
    private static final String ROCK_WIN_RBS = "You Win! Rock beats scissors!";

    private static final String PAPER_LOSE_SBP = "You lose! Scissors beats paper!";
    private static final String PAPER_WIN_PBR = "You win! Paper beats rock!";

    private static final String SCISSORS_LOSE_RBS = "You lose! Rock beats scissors!";
    private static final String SCISSORS_WIN_SBP = "You win! Scissors beats paper!";


    public static void displayRock(String cpu) {

        if (cpu.equals("rock"))
            JOptionPane.showMessageDialog(null, TIED);
        else if (cpu.equals("paper"))
            JOptionPane.showMessageDialog(null, ROCK_LOSE_PBR);
        else
            JOptionPane.showMessageDialog(null, ROCK_WIN_RBS);

    }

    public static void displayPaper(String cpu) {

        if (cpu.equals("rock"))
            JOptionPane.showMessageDialog(null, PAPER_WIN_PBR);
        else if (cpu.equals("paper"))
            JOptionPane.showMessageDialog(null, TIED);
        else
            JOptionPane.showMessageDialog(null, PAPER_LOSE_SBP);

    }

    public static void displayScissor(String cpu) {

        if (cpu.equals("rock"))
            JOptionPane.showMessageDialog(null, SCISSORS_LOSE_RBS);
        else if (cpu.equals("paper"))
            JOptionPane.showMessageDialog(null, SCISSORS_WIN_SBP);
        else
            JOptionPane.showMessageDialog(null, TIED);

    }

}
