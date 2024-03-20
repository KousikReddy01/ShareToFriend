
public class ArraysLogicDemo1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		System.out.println(arr.length);   //.length gives the length of an array.
		
		int firstIndexValue = arr[0];
		System.out.println(firstIndexValue);
		
		int sizeOfArray = arr.length;
		int lastIndexValue = arr[sizeOfArray-1];
		System.out.println(lastIndexValue);
		
		int arr2[][] = new int[3][4];
		int rowCount = arr2.length;
		System.out.println(rowCount);
		
		int columnCount = arr2[0].length;
		System.out.println(columnCount);

	}

}
