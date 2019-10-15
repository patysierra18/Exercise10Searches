package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 	
	{
		//Constants declaration
		final int ELEMENTS_ARRAY=100;
		
		//Variables declaration
		int numberToFind=0;
		int indexFound=-1;
		int limInf=0;
		int limSup=ELEMENTS_ARRAY -1;
		int pivotal=(limSup-limInf)/2;
		int temp=0;
		
		//Array declaration
		int[] miArraycitu=new int[ELEMENTS_ARRAY];
		
	//Object construction
		Random randomNumbers = new Random(System.nanoTime());
		Scanner input= new Scanner(System.in);
		
		
		//Adding pseudo random numbers to the array
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			miArraycitu[i] = randomNumbers.nextInt(101);
		}
		
		
		//Show array elements
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(miArraycitu[i]+" ");
		}
		System.out.println("");		//Ask the user for the number to find
		
		
		//Sorting algorithm
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			for(int j=0;j<ELEMENTS_ARRAY-1;j++)
			{
				if(miArraycitu[j]>miArraycitu[j+1])
				{
					temp=miArraycitu[j+1];
					miArraycitu[j+1]=miArraycitu[j];
					miArraycitu[j]=temp;
				}
			}
		}
		
		//Show array elements
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(miArraycitu[i]+" ");
		}
		System.out.println("");		//Ask the user for the number to find
				
				
		do
		{
			System.out.println("Input the number to find inside the Array(0-100)");
			numberToFind = input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("Number must be zero or positive value!");
			}
		}while(numberToFind<0);
		
		//Binary Search algorithm
		 while(limInf<=limSup)
		 {
			 pivotal = limInf + (limSup-limInf)/2;
			 if(numberToFind==miArraycitu[pivotal])
			 {
				 indexFound=pivotal;
				 break;
			 }
			 else if(numberToFind>miArraycitu[pivotal])
			 {
				 limInf=pivotal+1;
			 }
			 else if(numberToFind<miArraycitu[pivotal])
			 {
				 limSup=pivotal-1;
			 }
		 
		 }
		if(indexFound!=-1)
		{
			System.out.println("Element found at index:" + indexFound);
		}
		else
		{
			System.out.println("Element not present in the array!");
		}
	input.close();		
	}
}
	
	
	

