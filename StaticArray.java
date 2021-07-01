package Research;

@SuppressWarnings("unchecked")
public class StaticArray<E> {
	
	
	public int length=0;
	public Object[] arr;
	
	//Constructors of Dynamic Array Class.
	public StaticArray(int length)
	{
		this.length=length;
		this.arr =new Object[this.length];

	}
	
	public StaticArray()
	{
		this.arr = new Object[this.length];
	}
	
	public StaticArray(Object[] arr)
	{
		this.arr=arr;
	}
	
	public StaticArray(int startIndex,int endIndex)
	{	
		if(startIndex>endIndex)
			throw new IllegalArgumentException("Invalid Range of Integer Numbers");
		else {
			this.length=Math.abs(startIndex-endIndex);
			this.arr=new Object[this.length+1];
			for(int i=0;startIndex<=endIndex;i++,startIndex++)
			{	
				this.arr[i]=startIndex;
			}
		}
	}
	//Constructors of Dynamic Array Class.
	
	
	//Significant Methods.
	
	synchronized public void add(E e,int index)
	{
		if(index<0 || index>this.length)
			throw new ArrayIndexOutOfBoundsException("Invalid Index Detected:");
		this.arr[index]=e;
		//return temp;
	}
	
	synchronized public int size()
	{
		return this.length;
	}
	
	synchronized public E get(int index)
	{
		if(index>this.length)
			throw new ArrayIndexOutOfBoundsException(index+" Index Out of Bounds of Array of Length "+this.length);
		else
			return (E) this.arr[index];
	}
	
	synchronized public E[] iterateElements()
	{
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i]!=null)
			System.out.println(this.arr[i]);
		}
		return (E[]) this.arr;
	}
	
	@SuppressWarnings("rawtypes")
	synchronized static public boolean equality(StaticArray sa1, StaticArray sa2)
	{
		if(sa1.length!=sa2.length)
			return false;
		int index=0;
		for(Object e:sa1.arr)
		{
			if(e!=sa2.arr[index])
				return false;
			index++;
		}
		return true;
	}
	
	
	public static boolean contentEquals(Object[] a, Object[] b, int startIndex , int endIndex)
	{
		if(startIndex>endIndex)
			throw new ArrayIndexOutOfBoundsException("Operation Failed: startIndex>endIndex");
			for(int i=startIndex;i<endIndex;i++) {
				if(a[i]!=b[i])
					return false;
			}
			return true;
	}
	
	
	//Significant Methods.
	
	
	
}
