import java.util.ArrayList;

public class MedarbejderManager {
	private ArrayList<Medarbejder> medarbejdere = new ArrayList<Medarbejder>();
	
	MedarbejderManager () {
		this.medarbejdere.add(new Medarbejder("ADM", 0));
	}
	
	public ArrayList<Medarbejder> getMedarbejdere() {
		return this.medarbejdere;
	}
}
