import java.util.ArrayList;
public class Visiteur {
	private int idVis;
	public Visiteur() {
		// TODO Auto-generated constructor stub
	}
	void consulter(Post post){
		System.out.println(this.getpost());
	}
	void sinscrire(String pseudo, String mdp, String contact){
		ArrayList<Post> liste = new ArrayList<Post>;
		Inscrit I = new Inscrit(pseudo, mdp, contact, liste, false);
	}
}
