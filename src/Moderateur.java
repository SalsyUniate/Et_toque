import java.util.ArrayList;
public class Moderateur extends Inscrit{
	
	public Moderateur(String pseudo,String mdp, ArrayList<Post> Post,boolean statusConnexion) {
		super(pseudo,mdp,Post,statusConnexion);
	}
	void validerPost(Post post){
		post.valider()
	}

}
