
public class ServControll {
	private static ProjectManager projekter;
	private static MedarbejderManager medarbejdere;
	private static Dato currentDate;

	
	public static void ServerStart() {
		projekter = new ProjectManager();
		medarbejdere = new MedarbejderManager();
		currentDate = new Dato(8, 4, 2020);
		
		newProjekt("test0", medarbejdere.getMedarbejdere().get(0), new Dato(4, 2020), new Dato(9, 2020));
		newProjekt("test1", medarbejdere.getMedarbejdere().get(0), new Dato(1, 2020), new Dato(34, 2020));
		newProjekt("test2", medarbejdere.getMedarbejdere().get(0), new Dato(29, 2020), new Dato(52, 2020));
		
		System.out.println("Projekter: ");
		for (Project p : projekter.getProjects())
		{
			System.out.println(p.getNavn() + " " + p.getProjektNummer() + " med startuge: " + p.getStartUge() + " og slutuge: " + p.getSlutUge());
			System.out.println(new Dato(9,2020).getFormatedDate());
		}
		System.out.println("Medarbejdere: ");
		for (Medarbejder m : medarbejdere.getMedarbejdere())
			System.out.println(m.getInitialer());
		System.out.println("Dags dato: " + currentDate.getFormatedDate());
		
		ConnectionManager.openCon();
	}
	
	public static ProjectManager getProjekter() {
		return ServControll.projekter;
	}
	
	public static Dato getDato() {
		return ServControll.currentDate;
	}
	
	public static int newProjekt(String navn, Medarbejder projektLeder, Dato startUge, Dato slutUge) {
		System.out.println(projektLeder.getInitialer() + " tries to create project " + navn);
		try {
			projekter.addProject(navn, projektLeder, startUge, slutUge);
			}
			catch ( NullPointerException e)
			{
				System.out.println(e);
				return 1;
			}
		return 0;
	}
}
