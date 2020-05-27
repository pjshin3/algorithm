package com.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTestA {
    String Solution(String[] participant, String[] completion){
        ArrayList<String> result =  new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> arrayListA = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> arrayListB = new ArrayList<>(Arrays.asList(completion));

        for (int i=0; i < participant.length - 1; i++ ){
            for (int l = 0; l < completion.length ; l++){
                if (arrayListA.get(i).equals(arrayListB.get(l))){
                    result.remove(arrayListA.get(i));
                }
            }
        }
        return result.get(0);
    }
}
