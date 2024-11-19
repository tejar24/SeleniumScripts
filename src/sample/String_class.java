package sample;

public class String_class {
	public static void main(String[] args) {
		
		String s="Rahul Shetty Academy";
		String[] splittedstring = s.split("Shetty");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
