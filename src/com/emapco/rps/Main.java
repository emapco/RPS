package com.emapco.rps;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Lets play rock, paper, scissors.");
        boolean playAgain = true;
        while (playAgain) {
            String playerChoice = JOptionPane.showInputDialog(null,
                    "Choice between rock, paper, or scissors",
                    "Enter your choice",
                    JOptionPane.QUESTION_MESSAGE);
            whoWon(playerChoice);
            playAgain = play_Again();

        }
        input.close();
    }


    public static boolean play_Again() {
        int answer = JOptionPane.showConfirmDialog(null,
                "Would you like to play again?");

        return (answer == JOptionPane.YES_OPTION);
    }


    public static String getCPUD() {
        int cpuInt = (int) (Math.random() * 3);
        if (cpuInt == 0)
            return "rock";
        else if (cpuInt == 1)
            return "paper";
        else
            return "scissors";
    }
    //
    public static void whoWon(String playerC) {
        String cpuChoice = getCPUD();
        JOptionPane.showMessageDialog(null, "Rock, Paper, Scissors,\nI rolled a " + cpuChoice + "!");
//rock part
        String tied = "We tied.";
        String paperBRockRock = "You lost. Paper beats rock.";
        String sciBRockRock = "You Won! Rock beats scissors.";
//paper part
        String paperBRockPaper = "You won! Paper beats rock Paper beats rock.";
        String sciBPaperPaper = "You lost. Scissors beats paper.";
//scissors part
        String rockBScissorsScissors = "You lost! Rock beats scissors.";
        String scissorsBPaperScissors = "You won! Scissors beats paper.";
        if (cpuChoice == "rock" ) {
            if (cpuChoice.equals("rock")){
                JOptionPane.showMessageDialog(null, tied);
            }
            else if (cpuChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, paperBRockRock);
            }
            else {
//scissors
                JOptionPane.showMessageDialog(null, sciBRockRock);
            }
        }
        else if (playerC == "paper") {
            if (cpuChoice.equals("rock")){
                JOptionPane.showMessageDialog(null, paperBRockPaper);
            }
            else if (cpuChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, tied);
            }
            else {
//scissors
                JOptionPane.showMessageDialog(null, sciBPaperPaper);
            }
        }
        else if (playerC == "scissors") {
            if (cpuChoice.equals("rock")) {
                JOptionPane.showMessageDialog(null, rockBScissorsScissors);
            }
            else if (cpuChoice.equals("paper")) {
                JOptionPane.showMessageDialog(null, scissorsBPaperScissors);
            }
            else {
//scissors
                JOptionPane.showMessageDialog(null, tied);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Not a valid choice");
        }
    }

}
