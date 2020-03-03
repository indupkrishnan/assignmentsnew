package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class capacitytest  {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1.enter name,costperday,capacity");
			String s1=sc.nextLine();
			System.out.println("2.enter name,costperday,capacity");
			String s2=sc.nextLine();
			System.out.println("3.enter name,costperday,capacity");
			String s3=sc.nextLine();
			String a[]=new String[3];
			a=s1.split(",");
			String b[]=new String[3];
			b=s2.split(",");
			String c[]=new String[3];
			c=s3.split(",");
			
			
			ArrayList<capacitycomparator>a1=new ArrayList<capacitycomparator>();
			a1.add(new capacitycomparator(a[0],Double.parseDouble(a[1]),Integer.parseInt(a[2])));
			a1.add(new capacitycomparator(b[0],Double.parseDouble(b[1]),Integer.parseInt(b[2])));
			a1.add(new capacitycomparator(c[0],Double.parseDouble(c[1]),Integer.parseInt(c[2])));
			Collections.sort(a1,capacitycomparator.capacomparator);
			
			System.out.format("%-15s %-15s %s\n","name","costperday","capacity");
			
			for(capacitycomparator st:a1){
				System.out.format("%-15s %-15s %s\n",st.getName(),st.getCostperday(),st.getCapacity());
			}
			
		}
		}
