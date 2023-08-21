package JavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Automation    Testing";
		String N="";
		
		int l=s.length();
		
		for(int i=4; i>=0;i--) {
		N=N+s.charAt(i);
			
		}
		System.out.println(N);
		
		//String r=s.replace("    ", "");
		//System.out.println(r);

	}

}
