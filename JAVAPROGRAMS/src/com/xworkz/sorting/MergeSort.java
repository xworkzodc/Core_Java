package com.xworkz.sorting;

import java.util.Scanner;


public class MergeSort {
	

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);//The use of the scanner class is to get the elements from the keyword.
		
		System.out.println("how many elements u want to print");
		
		int n=scanner.nextInt();//we are taking the values here n contains numer of elements.
		
		int[] a=new int[10];
		
		System.out.println("Enter array elements =");
		
	
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		
		msort(a,0,a.length-1);
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
		
		
	}

	private static void msort(int[] a, int i, int j) {

		if(i<j)
		{
			int mid=(i+j)/2;
			msort(a,i,mid);
			msort(a,mid+1,j);
			merge(a,i,mid,j);
		}
	}

	private static void merge(int[] a, int low, int mid, int high) {
		
		
		int i=low;
		int j=mid+1;
		int k=high;
		
		int [] b=new int[a.length];
		
		while(i<low && j<=high)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				k++;
				i++;
				
			}
			else
			{
				b[k]=b[j];
				j++;
				k++;
			}
		}
		
		
		while(i<=mid)
		{
			b[k]=a[i];
			k++;
			i++;
		}
		
		while(j<=high)
		{
			b[k]=a[j];
			k++;
			j++;
		}

		
		for(i=low;i<=high;i++)
		{
			a[i]=b[i];
		}
		
		
		
	}
	

}
