package com.learnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Remove duplicate value from given list
		List<Integer> integerList =Arrays.asList(1,2,3,3,4,5,6,6,7,7,8,9,9,10);

       

        //Imperative Style
      
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i :integerList)
            if(!uniqueList.contains(i)){
            uniqueList.add(i);
            }
        System.out.println("unique List using Imperative  : " + uniqueList);

        
        // Declarative Style
         

        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList using Declarative : " + uniqueList1);

	}

}
