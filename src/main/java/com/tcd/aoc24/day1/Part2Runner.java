package com.tcd.aoc24.day1;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tcd.aoc24.utils.MiscUtils;

public class Part2Runner {

  public static void main(String[] args) throws URISyntaxException {
    System.out.println("--- Day 1 Part 2 ---");
    // Read file
    List<String> lines = MiscUtils.ReadFile("day1/d1p1.txt");
    
    String delim = "   ";
    
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    
    for (String l : lines) {
      String[] nums = l.split(delim);
      
      list1.add(Integer.parseInt(nums[0]));
      list2.add(Integer.parseInt(nums[1]));
    }
    
    Collections.sort(list1);
    Collections.sort(list2);
    
    int similarityScore = 0;
    
    for (int i = 0; i < list1.size(); i++) {
      int curr = list1.get(i);
      int idx1 = list2.indexOf(curr);
      
      if (idx1 == -1) {
        continue;
      }
      
      int idx2 = list2.lastIndexOf(curr);
      
      int count = idx2 - idx1 + 1;
      
      similarityScore += (curr * count);
    }
    
    System.out.println("Similarity Score: " + similarityScore);

  } 
}
