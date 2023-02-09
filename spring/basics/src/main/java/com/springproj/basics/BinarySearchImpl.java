package com.springproj.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private sortable Sortable;

//	public BinarySearchImpl(sortable sortable) {
//		this.Sortable = sortable;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor)
	{

		int[] sortedNumbers= Sortable.sort(numbers);
		for(int i=0;i<6; i++)
		{
			System.out.print(sortedNumbers[i]+" ");
		}
		int low=0, high= numbers.length-1;
		int mid;
		while(low<=high)
		{   mid=(low+high)/2;
			if(numbers[mid]==numberToSearchFor) return mid;
			else if(numbers[mid]>numberToSearchFor)  high=mid-1;
			else low=mid+1;
		}
		//		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		//		System.out.println(sortAlgorithm);
		// Search the array using binary search
//		int ind;
		return -1;
	}
}
