import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class test {		

		//Count the number of names starting with alphabet 'A' in list
	//	@Test
		public void regular()
		{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Don");
		names.add("Alexa");
		names.add("Apple");
		int count = 0;
		for(int i=0;i<=names.size();i++)
		{
			
			String actual = names.get(i);
			if(actual.startsWith("A"))
					{
						count++;
					}
			
		}
		
		System.out.println(count);
		}
		
		@Test
		public void StreamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhishek");
			names.add("Don");
			names.add("Alexa");
			names.add("Apple");
			
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
		}
		
		@Test
		public void StreamMap()
		{
			Stream.of("Abhishek","Don","Alexa","Apple").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println());
		}
	}


