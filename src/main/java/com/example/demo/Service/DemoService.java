package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DemoService {

    public  String fetchTopSecond(String str) {
        try {
            String topSecondStr = "";
            String[] strArr = str.split(" ");
            //String[] strDistinctArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
            int[] intUniqueArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).distinct().toArray();
            Arrays.sort(intUniqueArr);
            int n = intUniqueArr.length;
            if (n >= 2)
                return Integer.toString( intUniqueArr[n - 2]);
            else
                return "Please give more than one different integer input:";
        }
        catch(Exception e)
        {
            return "Invalid input.Please try again.";
        }
    }

}
