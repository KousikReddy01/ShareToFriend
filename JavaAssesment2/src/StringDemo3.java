
public class StringDemo3 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		System.out.println(s1);
		
		String s2 = "xyz";
		System.out.println(s2);
		
		if(s1==s2){
			System.out.println("S1 and S2 are same");
		}else{
			System.out.println("S1 and S2 are not same");
		}
		
		String s3 = new String("abc");
		System.out.println(s3);
		
		if(s1==s3){
			System.out.println("S1 and S3 are same");
		}else{
			System.out.println("S1 and S3 are not same");
		}
		
		String s4 = "abc";
		System.out.println(s4);
		
		if(s1==s4){
			System.out.println("S1 and S4 are same");
		}else{
			System.out.println("S1 and S4 are not same");   //"==" Operator is used to Compare only object addresses not the Data.
		}
		
		
		if(s1.equals(s2)){
			System.out.println("S1 and S2 are same");
		}else{
			System.out.println("S1 and S2 are not same");
		}
		
		if(s1.equals(s3)){
			System.out.println("S1 and S3 are same");
		}else{
			System.out.println("S1 and S3 are not same");
		}

		// ".equals()" is used to compare the Sting Data not the Object adress
		// In Real time we use .equals() operator.
	}

}
