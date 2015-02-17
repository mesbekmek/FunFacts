package com.example.mesfin.funfacts;

import java.util.Random;

/**
 * Created by Mesfin on 2/11/2015.
 */
public class FactBook {
    //Member variables are properties about the object
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };
    public String getFact(){
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

                /* Convert the random number to a text fact
                * 0 = Ants stretch when they wake up in the morning.
                * 1 = Ostriches can run faster than horses.
                * 2 = Olympic gold medals are actually mostly silver.
                * */
       return fact = mFacts[randomNumber];

    }
}
