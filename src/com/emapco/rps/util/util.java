package com.emapco.rps.util;

import java.util.Random;

public class Util {

    public static String getCPU() {

        Random ranGen = new Random();

        int cpuInt = ranGen.nextInt(3);

        if (cpuInt == 0)
            return "rock";
        else if (cpuInt == 1)
            return "paper";
        else
            return "scissors";

    }

}
