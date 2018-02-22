
public class Marine {
	String nom, prenom;
	int salaire;
	
	public Marine(String nouveauNom,String nouveauPrenom,int nouveauSalaire) {
		nom=nouveauNom;
		prenom=nouveauPrenom;
		salaire=nouveauSalaire;
	}
	
	public Marine(String nouveauNom,int nouveauSalaire) {
		nom=nouveauNom;
		prenom="";
		salaire=nouveauSalaire;
	}
	
	public void Augmentesalaire(int montant) {
		salaire=salaire+montant;
	}
	
	public static void main(String args[]) {
		Marine marin1=new Marine("Scoffild","Paul",3000);
		System.out.println(marin1);
		System.exit(0);
	}
}
