import java.util.*;
public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> a = new ArrayList<String>();
		a.add("navi");
		a.add("ajith");
		a.add("sharma");
		a.add("rohit");
		
		//System.out.println(a.get(3));
		
		for (String b : a) {
			System.out.println(b);
		}
		
		for (int i=0; i<a.size();i++) {
			System.out.println("*** "+a.get(i));
		}
		
		String s = "All is well";
		String [] splits = s.split("is");
		
		
		for (String c : splits) {
			System.out.println(c.trim());
		}
		
		String sNew= s.toLowerCase();
		System.out.println(sNew);
		
	}

}
