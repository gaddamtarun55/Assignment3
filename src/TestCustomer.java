class Customer{
	int id;
	String name;
	String address;
	long mobileNo;
	double payBill;

	public Customer() {
		id = 222;
		name= "vihar";
		address = "hyb";
		mobileNo= 77752111144l;
		payBill=220.2;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(mobileNo);
		System.out.println(payBill);

	}
}
public class TestCustomer{
public static void main(String[] args) {
	Customer ob1=new Customer();
	ob1.display();
}

}
