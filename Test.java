package Research;

public class Test {
	public static void main(String[] args) throws Exception
	{
		
		//Object Type StaticArray<> storing Elements from 2 to 10.
		StaticArray<Object> sa = new StaticArray<Object>(1,10);
		
		//Iterating and Printing the Elements.
		System.out.println("iterateElements() Elements");
		Object obj[] = sa.iterateElements();
		
		
		//Iterating through the Objects.
		System.out.println("Object[] array Iteration:");
		for(Object x:obj)
		{
			System.out.println(x);
		}
		
		//Iterating through the Objects manually.
		
		//Integer type StaticArray<> storing Elements from 2 to 10.
		StaticArray<Integer> sa2  = new StaticArray<Integer>(1,6);
		
		
		System.out.println("Elements from sa2 array");
		sa2.iterateElements();
		//System.out.println("Required Element at Index 2 : "+sa2.get(-5));
		System.out.println("Content Equals: "+StaticArray.contentEquals(sa.arr,sa2.arr,0,5));
		
		System.out.println("Equality Check: "+StaticArray.equality(sa,sa2));
	}
}
