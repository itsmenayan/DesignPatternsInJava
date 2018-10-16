import com.phone.OperatingSystem;
import com.phone.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		/*OperatingSystem os = new Windows();
		os.spec();*/
		
		OperatingSystemFactory factory = new OperatingSystemFactory();
		OperatingSystem android = factory.getOperatingSystem("Samsung");
		android.spec();
		
		OperatingSystem windows = factory.getOperatingSystem("Nokia");
		windows.spec();
		
		OperatingSystem ios = factory.getOperatingSystem("Apple");
		ios.spec();
		
		
		
		
	}

}
