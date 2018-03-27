package edu.wvup.bstarch1.randomnumberguess_fragments;

/**
 * Created by brady on 3/26/2018.
 */

import java.util.Random;

public class Guess
{
    public static int randNum(int min, int max)
    {
        Random rand = new Random();

        int randNum = rand.nextInt((max - min) + 1) + min;

        return randNum;
    }
}
