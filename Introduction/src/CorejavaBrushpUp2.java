import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class CorejavaBrushpUp2 {

	public static void main(String[] args) {
		
	int[] arr2 = {2,4,6,8,1,10,11,214};
	
	//check if array is multiple by 2



for(int i=0;i<arr2.length;i++)
	{
		if( arr2[i] %2 == 0 )
			{System.out.println( arr2[i]);
			break;}
	
	
	else
	{
		System.out.println(arr2[i] +" not divide by 2");
	}
	
	}
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("Sayali");
	//a.add(110);
	//a.add(33);
	//a.add(44);
	//a.add(1000);
	//System.out.println(a.remove(0));
	System.out.println(a.get(1) );
	
	
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	
	System.out.println(a.contains("Sayali"));
	String[] name= {"rahul","shetty","selenium"};
	//List<String> nameArrays = Arrays.asList(name);
	//nameArrays.contains("selenium");
}
}



