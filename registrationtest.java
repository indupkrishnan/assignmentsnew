package collection;

import java.util.Scanner;

public class testregistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name");
		 String name=sc.next();
		 System.out.println("enter the mailid");
		 String mid=sc.next(); 
		 System.out.println("enter the mob");
		 String mob=sc.next();
		 System.out.println("enter the totalprice");
		 double tot=sc.nextDouble();
		 registration r1=new registration(name,mid,mob,tot);
		 
		 System.out.println("enter the name");
		 String name1=sc.next();
		 System.out.println("enter the mailid");
		 String mid1=sc.next(); 
		 System.out.println("enter the mob");
		 String mob1=sc.next();
		 System.out.println("enter the totalprice");
		 double tot1=sc.nextDouble();
		 registration r2=new registration(name1,mid1,mob1,tot1);
		 if(r1.equals(r2)){
			 System.out.println("same objects");
		 }
		 else{
			 System.out.println("not same objects");
		 }


	}

}
