package com.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTestA {
    String Solution(String[] participant, String[] completion){

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i=0; i<completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}
