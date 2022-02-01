package com.greatlearning.driverQ1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maindriver {

	public static void main(String[] args) {
		//take inputs no. of floors
		//take input of the construction days
		//define arraylist
		Scanner sc = new Scanner(System.in);
		int pos, itr;
		System.out.println("enter the total no. of floors in the building:");
		int numfloors = sc.nextInt();
		ArrayList<Integer> floordeliverydate = new ArrayList<Integer>();
		for (int i=0; i<numfloors; i++) {
			System.out.println("enter the floor size given on Day:" + (i+1));
			floordeliverydate.add(i, sc.nextInt());
		}
				
		//create index queue on the basis of floor sizes big to small
		Queue<Integer> indexqueue = new LinkedList<>();
		for (int j=numfloors; j>0; j--) {
			pos = floordeliverydate.indexOf(j);
			indexqueue.add(pos);
		}
		
		//printing output
		System.out.println("\nThe order of construction is as follows:");
		for (int i=0; i<numfloors; i++) {
			System.out.println("\n" + "Day:"+(i+1));
			if (i<indexqueue.peek())
				continue;
			else 
				{
				int chk = indexqueue.peek(); 
				do {
					itr =  indexqueue.remove();
					System.out.print(floordeliverydate.get(itr) + " ");
					} while (!indexqueue.isEmpty() && chk>indexqueue.peek());
				}
		   }
		}
}
