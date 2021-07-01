# Generic-StaticArray
Constructor Summary:
1. StaticArray(int length) : Creates a new StaticArray of length **length**
2. StaticArray() : Creates a new StaticArray of length **0**
3. StaticArray(Object[] arr) : Creates a new StaticArray from the **Object type** array provided as a Parameter.
4. StaticArray(int startIndex, int endIndex) : Creates and initializes a StaticArray with the elements provided in the valid range.

Method Summary:
1. void add(E e,int index) : Adds **Element e** at a given index **index.**
2. int size() : Returns the size of the StaticArray
3. E get(int index) : Returns the Element Present at index **index**.
4. E[] iterateElements() : Returns and prints Elements present in the Static Array.
5. boolean equality(StaticArray sa1, StaticArray sa2): Returns true if two arrays are same.
6. boolean contentEquals(Object[] a, Object[] b, int startIndex , int endIndex) : Returns true if **The Elements of **a and b** have the same content in the given startIndex and endIndex.**
