
public class StringLogicDemo1 {

	public static void main(String[] args) {
		
		String s1 = "RBG Technologies";
		
		int charsCount = s1.length();
		System.out.println(charsCount);
		
		char c1 = s1.charAt(2);  //.charAt(); gives the character of given number.
		System.out.println(c1);
		
		String str1[] = s1.split(" ");
		System.out.println("String first Index Value = "+str1[0]);
		System.out.println("String second Index Value = "+str1[1]);
        System.out.println("String Concat = "+str1[0]+" "+str1[1]);
        System.out.println(str1.length);
        
        for(int i=0;i<=str1.length-1;i++){
        	System.out.println(str1[i]);
        }
        
        System.out.println("Done");
		
		
//		String substr = s1.substring(4);
//		System.out.println(substr);
//		
//		String strsub2 = s1.substring(0,3);
//		System.out.println(strsub2);
//		
//		String replaceValue = s1.replace(" ","-");
//		System.out.println(replaceValue);

	}

}
