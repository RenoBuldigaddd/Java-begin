
import java.util.*;
public class MainApp {

	public static void main(String[] args)
	{
		System.out.println("Hello");
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			String str=iterator.next();
			System.out.println(str);
		}
		String item = list.get(1);
		System.out.printf("Item index 1: %s\n",item);
	}
}
