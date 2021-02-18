import java.util.*;

public final class MaxHeapTest
{
	public static void main(String args[])
	{
		MaxHeapClass H = new MaxHeapClass(); /* create an empty heap */

		System.out.println("Enter the number of items:");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items:" + "\r\n", n);
		for (int i = 0; i < n; i++) 
		{
			int item = Integer.parseInt(new Scanner(System.in).nextLine());
			H.inputToArray(item);
		};
		
		System.out.println("Display the items before build the max heap:");
		H.printHeap();
		
		H.buildHeap(); /* Build the max heap for the inputed items */
		System.out.println("Display the items after build the max heap:");
		H.printHeap();
		
        /* Test the operations of the max heap */
		System.out.println("Enter 1 for extractMax, 2 for heapInsert");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2)
		{
			if (s == 1)
			{
				int max = H.extractMax();
				if (max != -999999)
				{
					System.out.println("The extracted maximum element is:");
					System.out.println(max);
					System.out.println("The elements in the array after extraction:");
					H.printHeap();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new item to the heap:");
				int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				H.heapInsert(newItem);
				System.out.println("The elements in the array after insertion:");
				H.printHeap();
			};
			System.out.println("Enter 1 for extractMax, 2 for heapInsert");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}
