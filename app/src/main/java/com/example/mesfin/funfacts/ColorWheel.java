package com.example.mesfin.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Mesfin on 2/11/2015.
 */
public class ColorWheel{
    //Member variables are properties about the object
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
             };
    public int getColor(){
        String color = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

                /* Convert the random number to a text fact
                * 0 = Ants stretch when they wake up in the morning.
                * 1 = Ostriches can run faster than horses.
                * 2 = Olympic gold medals are actually mostly silver.
                * */


         color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;

    }
}

