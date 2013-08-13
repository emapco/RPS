package com.emapco.rps.util;

import javax.swing.*;

public class Display {

    private static final String TIED = "We tied.";

    private static final String ROCK_LOSE_PBR = "You lost. Paper beats rock.";
    private static final String ROCK_WIN_RBS = "You Won! Rock beats scissors.";

    private static final String PAPER_LOSE_SBP = "You lost. Scissors beats paper.";
    private static final String PAPER_WIN_PBR = "You won! Paper beats rock Paper beats rock.";

    private static final String SCISSORS_LOSE_RBS = "You lost! Rock beats scissors.";
    private static final String SCISSORS_WIN_SBP = "You won! Scissors beats paper.";


    static void displayRock(String cpu) {
        if (cpu.equals("rock")){
            JOptionPane.showMessageDialog(null, TIED);
        }
        else if (cpu.equals("paper")) {
            JOptionPane.showMessageDialog(null, ROCK_LOSE_PBR);
        }
        else {
            JOptionPane.showMessageDialog(null, ROCK_WIN_RBS);
        }
    }

    static void displayPaper(String cpu) {

        if (cpu.equals("rock")){
            JOptionPane.showMessageDialog(null, PAPER_WIN_PBR);
        }
        else if (cpu.equals("paper")) {
            JOptionPane.showMessageDialog(null, TIED);
        }
        else {
            JOptionPane.showMessageDialog(null, PAPER_LOSE_SBP);
        }
    }

    static void displayScissor(String cpu) {
        if (cpu.equals("rock")) {
            JOptionPane.showMessageDialog(null, SCISSORS_LOSE_RBS);
        }
        else if (cpu.equals("paper")) {
            JOptionPane.showMessageDialog(null, SCISSORS_WIN_SBP);
        }
        else {
            JOptionPane.showMessageDialog(null, TIED);
        }
    }

}
