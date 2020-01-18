
import java.util.*;
public class MainApp {

	public static void main(String[] args)
	{
		//System.out.println("Hello");
		//ArrayList();
		//ArrayListModivy();
		ArrayToArrayList();
		}
	
	private static void ArrayList() {
		
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
		
		for(String str : list) {
			System.out.println(str);
		}
	}	


	private static void ArrayListModivy()
	{
		List<StringBuilder> lst = new ArrayList<StringBuilder>();
		lst.add(new StringBuilder("alpha"));
		lst.add(new StringBuilder("beta"));
		lst.add(new StringBuilder("charlie"));
		System.out.println(lst); // [alpha, beta, charlie]

		for (StringBuilder sb : lst) {
		sb.append("88"); // can modify "mutable" objects
		}
		System.out.println(lst); // [alpha88, beta88, charlie88]
	}
	public static void ArrayToArrayList() {
		String[] strs = { "alpha", "beta", "charlie" };
		System.out.println(Arrays.toString(strs)); // [alpha, beta, charlie]

		List<String> lst = Arrays.asList(strs);
		System.out.println(lst); // [alpha, beta, charlie]

		// Changes in array or list write thru
		strs[0] += "88";
		lst.set(2, lst.get(2) + "99");
		System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie99]
		System.out.println(lst); // [alpha88, beta, charlie99]

		// Initialize a list using an array
		List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
		System.out.println(lstInt); // [22, 44, 11, 33]
		}
}
