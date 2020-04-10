import java.util.ArrayList;

public class Aktivitet {
	private ArrayList<Medarbejder> medarbejdere = new ArrayList<Medarbejder>();
	private String navn;
	private int budgetTid, realTid, startUge, slutUge;
	
	public Aktivitet (String navn, int startUge, int slutUge, int budgetTid) {
		this.navn = navn;
		this.startUge = startUge;
		this.slutUge = slutUge;
		this.budgetTid = budgetTid;
		this.realTid = 0;
	}
	
	public void addTid (int tid) {
		this.realTid += tid;
	}
	
}
