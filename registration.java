package collection;
import java.util.*;
public class registration {
	private String name;
	private String mailid; 
	private String mobno;
	private double totprice;
	
	public registration(String name,String mailid,String mobno,double totprice){
		super();
		this.name=name;
		this.mailid=mailid;
		this.mobno=mobno;
		this.totprice=totprice;
	}

	public String getName() {
		return name;
	}

	public String getMailid() {
		return mailid;
	}

	public String getMobno() {
		return mobno;
	}

	public double getTotprice() {
		return totprice;
	}

	@Override
	public String toString() {
		return "registration [name=" + name + ", mailid=" + mailid + ", mobno=" + mobno + ", totprice=" + totprice
				+ ", getName()=" + getName() + ", getMailid()=" + getMailid() + ", getMobno()=" + getMobno()
				+ ", getTotprice()=" + getTotprice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailid == null) ? 0 : mailid.hashCode());
		result = prime * result + ((mobno == null) ? 0 : mobno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		registration other = (registration) obj;
		if (mailid == null) {
			if (other.mailid != null)
				return false;
		} else if (!mailid.equals(other.mailid))
			return false;
		if (mobno == null) {
			if (other.mobno != null)
				return false;
		} else if (!mobno.equals(other.mobno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(totprice) != Double.doubleToLongBits(other.totprice))
			return false;
		return true;
	}
	
	
}
