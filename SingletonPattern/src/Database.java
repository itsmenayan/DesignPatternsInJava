import java.util.Date;

public class Database {
	public static Database db;
	public Date createdDate;
	
	private Database() {
		createdDate = new Date();
		System.out.println("Database Initialized/Created");
	}
	
	public static Database getInstance() {
		if(db==null) {
			synchronized (Database.class) {
				if(db==null)
					db = new Database();
			}
		}
		return db;
		
	}
	

}
