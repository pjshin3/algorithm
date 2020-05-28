package com.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTestB {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length - 1; i++){
            for (int l = i+1; l< phone_book.length; l++){
                if (phone_book[i].startsWith(phone_book[l])) {return false; }
                if (phone_book[l].startsWith(phone_book[i])) {return false; }
            }
        }
        return answer;
    }
}
