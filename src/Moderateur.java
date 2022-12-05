import java.util.ArrayList;

public class Moderateur extends Inscrit{
	
	public Moderateur(String pseudo,String mdp, String contact, ArrayList<Posts> post,boolean statusConnexion) {
		super();
	}
	void validerPost(Posts post){
		post.Valider();
	}

}
