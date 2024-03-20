
public class ArraysDemo1 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		int[] arr = new int[5];
		int arr2[] = new int[5];
		int []arr3 = new int[5];
		
		arr[0] = 10;
		System.out.println(arr[0]);
		arr2[1] = 20;
		System.out.println(arr2[1]);
		arr3[3] = 30;
		System.out.println(arr3[3]);
		System.out.println(arr[2]);
		System.out.println(arr2[4]);
		System.out.println(arr3[5]);   // ArrayIndexOutOfBoundsException. RunTime Error
		
		//This Program is Known as Dynamic Error.

	}

}
