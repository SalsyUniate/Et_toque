import java.util.ArrayList;

public class Moderateur extends Inscrit{
	
	public Moderateur(String pseudo,String mdp, String contact, ArrayList<Posts> post,boolean statusConnexion) {
		this.pseudo = pseudo; 
		this.mdp = mdp;
		this.contact = contact;
		this.post = post;
		this.statusConnexion = statusConnexion;
	}
	void validerPost(Posts post){
		post.Valider();
	}

}
