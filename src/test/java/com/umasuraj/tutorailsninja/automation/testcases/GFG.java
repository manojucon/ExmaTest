package com.umasuraj.tutorailsninja.automation.testcases;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class GFG {
     public ArrayList<String> integerList;

     List<String>  findIntegers(String stringToSearch) {
         Pattern integerPattern = Pattern.compile("-?\\d+");
         Matcher matcher = integerPattern.matcher(stringToSearch);

         integerList = new ArrayList<>();
         while (matcher.find()) {
             integerList.add(matcher.group());
         }

         return integerList;
     }
 }


