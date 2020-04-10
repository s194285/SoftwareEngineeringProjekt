import java.util.ArrayList;

public class Medarbejder {
	private String initialer;
	private int ID;
	private Kalender kalender;
	private ArrayList<String> projekter = new ArrayList<String>();
	
	public Medarbejder(String initialer, int ID) {
		this.initialer = initialer;
		this.ID = ID;
	}
	
	public String getInitialer() {
		return this.initialer;
	}
	
}
