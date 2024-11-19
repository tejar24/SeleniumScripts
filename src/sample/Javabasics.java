package sample;

import java.util.Arrays;
import java.util.List;

public class Javabasics {
	
	public static void main(String[] args) {
		
	//	String[] name= {"Teja","Ramesh","Yashoda","Kiran"};
		/*for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}*/
		
		int[] num= {2,3,4,5,6,7,8,9,10};
		List<int[]> arraynum = Arrays.asList(num);
		System.out.println(arraynum.contains(3));
		
		
	for(int i=0;i<num.length;i++)
	{
		if(num[i]%2 ==0)
		{
			System.out.println(num[i]);
			break;
		}
		else
		{
			System.out.println(num[i]+"is not mulitple of 2");
		}
	}
		
		
	/*for( String s :name)	
	{
		System.out.println(s);
	}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
