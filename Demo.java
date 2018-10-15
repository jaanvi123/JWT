package bigintdemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sobj = new Scanner(System.in);
		String a = sobj.nextLine();
		String b = sobj.nextLine();
		
		System.out.println(AddBInt.cal2(a,b));
		System.out.println(AddBInt.cal3(a,b));

	}

}
