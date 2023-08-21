package JavaPackage;

public class StringConcept {

	public static void main(String[] args) {
		String s="Automation Test";
		String s1="    ";
		String s2="          Automation Test        ";
		
		int l1=s.length();
		int l2=s1.length();
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		boolean t1=s.equals(s1);
		System.out.println(t1);
		
		
		boolean t2=s.equalsIgnoreCase(s1);
		System.out.println(t2);
		
		boolean t3=s.contains("Test");
		System.out.println(t3);
		
		
		
		String s3=s2.trim();
		System.out.println(s3.equals(s));
		
		
		
		
		

	}

}
