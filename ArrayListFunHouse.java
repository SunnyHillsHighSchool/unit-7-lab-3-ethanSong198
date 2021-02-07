//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //create an array list output
  ArrayList<Integer> output = new ArrayList<Integer>();

  //create for loop to find factors
  for(int x = 1; x <= number; x++){

    //create if to check if modulus of number and x is 0
    if((number % x) == 0){
      //add the number to the array list
      output.add(x);
    }
  }

  //return output
  return output;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //create for loop that goes through array list
   for(int x = 0; x < nums.size(); x++){
     
     //if the array list of value at x is less than or equal to two
     if(getListOfFactors(nums.indexOf(x)).size() <= 2){
       //remove the value from the array list
       nums.remove(x);
     }
   }
 }
}