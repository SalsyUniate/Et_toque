import java.util.ArrayList;

public class Inscrit {
	public String pseudo;
	public String mdp;
	public String contact;
	public ArrayList<Posts> posts;
	public boolean statusConnexion = false;
	public ArrayList<Inscrit> abonnes;
	public ArrayList<String> notifications;
	
	public Inscrit() {
		// TODO Auto-generated constructor stub
	}
	void connexion(String pseudonyme, String motdepasse){
		if((pseudonyme == this.pseudo) && (motdepasse==this.mdp)){
			statusConnexion=true;
		}
		
	}
	void deconnexion(){
		statusConnexion=false;
	}

	String getPseudo(){
		return this.pseudo;
	}
	
	void soumettrePost(Posts post){
		Gestionnaire.ajouterPost(this, post);
	}

	void supprimerPost(Posts post, ArrayList<Posts> liste){
		Gestionnaire.supprimerPost(this, post);
	}

	void modifierProfil(String newpseudo, String newmdp, String newcontact){
		this.pseudo=newpseudo;
		this.mdp=newmdp;
		this.contact=newcontact;

	}

	void consulter(Posts post){
		System.out.println(post.getPost());
	}

	void demanderAbonnemenr(Inscrit i){
		Gestionnaire.ajouterAbonne(this, i);
	}
}
