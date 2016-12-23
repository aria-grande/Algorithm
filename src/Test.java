
public class Test {

	public static void main(String[] args) {

		String s = "I think string will be copy by reference, cause it is an object.";
		String t = s;
		
		t = t.toUpperCase();
		System.out.println(s);
		System.out.println(t);
	}
}
