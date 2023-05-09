public class NoteBook {

	public static void main(String[] args) {
	Book ob1 = new Book();
	ob1.setbookId(100);
    ob1.setbookName("java");
    ob1.setbookPrice(200);
    System.out.println("book 1 details");
    System.out.println(ob1.getbookId());
    System.out.println(ob1.getbookName());
    System.out.println(ob1.getbookPrice());
	
    Book ob2 = new Book();
	ob2.setbookId(100);
    ob2.setbookName("Hyper net");
    ob2.setbookPrice(200);
    System.out.println("book 2 details");
    System.out.println(ob2.getbookId());
    System.out.println(ob2.getbookName());
    System.out.println(ob2.getbookPrice());
    
	
	}
}