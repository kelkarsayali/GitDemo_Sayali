
public class CorejavaBrushpUp3 {

	public static void main(String[] args) {
		
		
		//String s1 = "rahul shetty academy";
		
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "rahul shetty academy";
		String [] spilltedString = s.split("shetty");
		System.out.print(spilltedString[0]);
		System.out.print(spilltedString[1]);
		//System.out.print(spilltedString[2]);
		System.out.print(spilltedString[1].trim());
		
		for(int i = s.length()-1; i>=0 ; i--)
		{
			 
			System.out.println(s.charAt(i));
		}
		
		
		
		
		
	}

}
