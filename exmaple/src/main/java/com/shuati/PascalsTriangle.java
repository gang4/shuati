package com.shuati;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subIn = new ArrayList<Integer>();
        list.add(subIn);
        subIn.add(1);
        if (numRows == 1) {
            return list;
        }
        for (int i = 1; i < numRows; i ++) {
            List<Integer> sub = new ArrayList<Integer>(); 
            list.add(sub);
            sub.add(1);
            for (int j = 1; j < i + 1; j ++) {
                if (j + 1 == i + 1) {
                    sub.add(1);
                    continue;
                }
                int sum = subIn.get(j - 1) + subIn.get(j); 
                sub.add(sum);   
            } 
            subIn = sub; 
        } 
        return list;   
    }
}
