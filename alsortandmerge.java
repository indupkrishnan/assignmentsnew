package collection;
import java.util.*;
public class alsortandmerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a1=new ArrayList <Integer>();
		System.out.println("enter first arraylist");
		for(int i=0;i<5;i++){
			a1.add(sc.nextInt());
		}
		ArrayList <Integer> a2=new ArrayList <Integer>();
		System.out.println("enter second arraylist");
		for(int i=0;i<5;i++){
			a2.add(sc.nextInt());
		}
		a1.addAll(a2);
		System.out.println("Merged array list is "+a1);
		Collections.sort(a1);
		for(Integer st:a1){
			System.out.print(" "+st);
		}
	
		System.out.println("\nelement at index 2 is "+a1.get(2));
	
		System.out.println("element at index 6 is "+a1.get(6));
		
		System.out.println("element at index 8 is "+a1.get(8));
	}
	}


