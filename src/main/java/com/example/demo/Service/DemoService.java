package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemoService {


    public String fetchTopSecond(List<Integer> inputs) {
        try {
            List<Integer> arrUniqueValues = inputs.stream()
                    .distinct()
                    .collect(Collectors.toList());

            Collections.sort(arrUniqueValues);

            int count = arrUniqueValues.size();

            if (count >= 2)
                return Integer.toString(arrUniqueValues.get(count - 2));
            else
                return "Please give more than one different integer input:";
        }
        catch(Exception e)
        {
            return "Invalid input.Please try again.";
        }
    }

}
