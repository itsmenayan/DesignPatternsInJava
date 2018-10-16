
public class SingletonDemo {

	public static void main(String[] args) throws InterruptedException {
		Database db1 = Database.getInstance();
		System.out.println(db1.createdDate);
		
		Thread.sleep(1000);
		
		Database db2 = Database.getInstance();
		System.out.println(db2.createdDate);

	}

}
