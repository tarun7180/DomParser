package com.tarun.StackOverflow;

import java.util.Scanner;

public class factorial {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    long fact=1;
    System.out.println("Calculations: ");
    for(long i=1;i<=n;i++)
    {
      fact=fact*i;
      System.out.print(i+" ");
      if(i<n) {
        System.out.print("*");
      }
    }
    System.out.print("\nThe factorial is: "+fact);
  }

}
