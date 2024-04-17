
public class Customer {
	
	private Person person;
	private int actNum;
	//person, acct num
	
	public Customer(Person person, int actNum) {
		super();
		this.person = person;
		this.actNum = actNum;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getActNum() {
		return actNum;
	}

	public void setActNum(int actNum) {
		this.actNum = actNum;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", actNum=" + actNum + "]";
	}
	
	
	
	
	
}

