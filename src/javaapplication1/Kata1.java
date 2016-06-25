/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lia
 */
public class Kata1
{
  public static int TripleDouble(long num1, long num2) 
  {
    List<Long> digits1 = new ArrayList<>();
    List<Long> digits2 = new ArrayList<>();
    do {
     digits1.add(num1%10);
     num1/=10;
    } while (num1 > 0);
    do {
     digits2.add(num2%10);
     num2/=10;
    } while (num2 > 0);
    for(int i=0;i<(digits1.size()-2);i++){
            if ( digits1.get(i).equals(digits1.get(i+1)) && digits1.get(i).equals(digits1.get(i+2))){
            for(int j=0;j<(digits2.size()-1);j++){
                if(digits1.get(i).equals(digits2.get(j)) && digits1.get(i).equals(digits2.get(j+1))){
                    return 1;
                }
            }
        }
    }  
    return 0;
  }
}
