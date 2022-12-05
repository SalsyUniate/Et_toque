import java.util.ArrayList;

public class Visiteur {
	private int idVis;
	public Visiteur() {
		// TODO Auto-generated constructor stub
	}
	void consulter(Posts post){
		System.out.println(this.getPost());
	}
	void sinscrire(String pseudo, String mdp, String contact){
		ArrayList<Posts> liste = new ArrayList<Posts>;
		Inscrit I = new Inscrit(pseudo, mdp, contact, liste, false);
	}
}
