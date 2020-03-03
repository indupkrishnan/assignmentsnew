package collection;


import java.util.Comparator;

public class capacitycomparator {
	private String name;
	private double costperday;
	private int capacity;

	public capacitycomparator(String name,double costperday,int capacity){
		this.name=name;
		this.costperday=costperday;
		this.capacity=capacity;
		
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostperday() {
		return costperday;
	}

	public void setCostperday(double costperday) {
		this.costperday = costperday;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "hall [name=" + name + ", costperday=" + costperday + ", capacity=" + capacity + "]";
	}
	public static Comparator<capacitycomparator> capacomparator=new Comparator <capacitycomparator>(){
		public int compare(capacitycomparator s1,capacitycomparator s2){
			int i1=s1.getCapacity();
			int i2=s2.getCapacity();
			return  i2-i1;
		}
	};
	}




