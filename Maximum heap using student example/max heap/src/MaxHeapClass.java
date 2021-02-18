import java.util.*;

	public class MaxHeapClass
{
	public int heapSize;
	public Student[] Arr = new Student[100];
	public MaxHeapClass()
{
		heapSize = 0;
}

	public final void inputToArray(Student item)
{
		Arr[heapSize] = item;
		heapSize = heapSize + 1;
}

	public void heapify(int parent)
{
	int Lson, Rson, largest;
	Student temp;
	Lson = 2 * parent + 1;
	Rson = 2 * parent + 2;
/* find the largest among Arr[parent], Arr[lson] and Arr[rson] */
	if (Lson <= heapSize - 1 && Arr[Lson].score > Arr[parent].score)
		largest = Lson;
	else
		largest = parent;
	if (Rson <= heapSize - 1 && Arr[Rson].score > Arr[largest].score)
		largest = Rson;

/* Swap Arr[parent] with Arr[largest]*/
	if (largest != parent)
{
		temp = Arr[parent];
		Arr[parent] = Arr[largest];
		Arr[largest] = temp;
		heapify(largest);
}

}

public void buildHeap()
{
for (int i = (heapSize - 1) / 2; i >= 0; i--)
heapify(i);
}


public Student extractMax()
{
if (heapSize == 0)
{
System.out.println("Heap is empty");
return null;
}
else
{
Student max = Arr[0];
Arr[0] = Arr[heapSize - 1];
heapSize = heapSize - 1;
heapify(0);
return max;
}
}

public void heapInsert(Student item)
{
if (heapSize <= Arr.length - 1)
{
int parent;
heapSize = heapSize + 1;
int i = heapSize - 1;
parent = (i - 1) / 2;
while (i > 0 && Arr[parent].score < item.score)
{
Arr[i] = Arr[parent];
i = parent;
parent = (i - 1) / 2;
}
Arr[i] = item;
}
else
System.out.println("It is full!");
}

public void printHeap()
{
for (int i = 0; i <= heapSize - 1; i++) {
	
	System.out.println(Arr[i].name );
	System.out.println (Arr[i].score);
	System.out.println(Arr[i].id );
	
}

}
}
