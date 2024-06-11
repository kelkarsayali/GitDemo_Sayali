
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo a = new MethodDemo();
		String number = a.getdata();
		System.out.println(number);
		
		MethodDemo2 b = new MethodDemo2();
		b.getUserdata();
		
		getdata2();
		
		
	}
	
	public String getdata()
	{
		System.out.println("Hello World");
		return "rahul shetty";
	}
	
	public static String getdata2()
	{
		System.out.println("Hello World from static class");
		return "rahul shetty";
	}

}
