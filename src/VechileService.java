class Vechile
{
String company;
String color;
double price;


public Vechile(String company, String color, double price) {

	this.company = company;
	this.color = color;
	this.price = price;
}


@Override
public String toString() {
	return "Vechile [company=" + company + ", color=" + color + ", price=" + price + "]";
}

}
public class VechileService {

	public static void main(String[] args) {
		Vechile ob1 = new Vechile("x", "blue", 200000);
		System.out.println(ob1);
	


	}

}
