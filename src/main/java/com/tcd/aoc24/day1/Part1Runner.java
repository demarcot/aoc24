package com.tcd.aoc24.day1;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tcd.aoc24.utils.MiscUtils;

public class Part1Runner {

  public static void main(String[] args) throws URISyntaxException {
    System.out.println("--- Day 1 Part 1 ---");
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
    
    int totalDistance = 0;
    
    for (int i = 0; i < list1.size(); i++) {
      int diff = list1.get(i) - list2.get(i);
      
      if (diff < 0) {
        diff *= -1;
      }
      
      totalDistance += diff;
    }
    
    System.out.println("Total Distance: " + totalDistance);
  } 
}
