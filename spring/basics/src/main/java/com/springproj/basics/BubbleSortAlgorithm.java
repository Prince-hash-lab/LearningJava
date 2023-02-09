package com.springproj.basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements sortable {
	public int[] sort(int[] arr)
	{

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		//logic for bubble sort
		return arr;
	}
}
