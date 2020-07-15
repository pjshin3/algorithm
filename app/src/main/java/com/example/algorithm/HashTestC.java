package com.example.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class HashTestC {
    public int solution(String[][] clothes) {
        int answer = 0;
        answer += clothes.length;
        HashMap<String,String> result = new HashMap<>();

        for (int i = 0; i < clothes.length - 1; i++){
            result.put(clothes[i][i],clothes[i].toString());
        }

//        for (int l = 0; l < result.size(); l++){
//            answer = result.get(result.)
//        }

        return answer;
    }
}
