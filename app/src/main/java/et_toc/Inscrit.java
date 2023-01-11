package et_toc;

import java.util.ArrayList;

public class Inscrit {
	public String pseudo;
	public String mdp;
	public String contact;
	public ArrayList<Posts> posts;
	public boolean statusConnexion = false;
	public ArrayList<Inscrit> abonnes;
	public ArrayList<String> notifications;


	// constructeur de la classe
	public Inscrit(String pseudo, String mdp, String contact, ArrayList<Posts> posts, boolean statusConnexion, ArrayList<Inscrit> abonnes, ArrayList<String> notifications) {
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.contact = contact;
		this.posts = posts;
		this.statusConnexion = statusConnexion;
		this.abonnes = abonnes;
		this.notifications = notifications;
	}

	// fonction permettant à l'utilisateur inscrit de se connnecter
	void connexion(String pseudonyme, String motdepasse){
		if((pseudonyme == this.pseudo) && (motdepasse==this.mdp)){
			statusConnexion=true;
		}	
	}
	
	// fonction permettant à l'utilisateur connecte de se deconnecter
	void deconnexion(){
		statusConnexion=false;
	}

	// getter du pseudo necessaire dans les notifications
	String getPseudo(){
		return this.pseudo;
	}

	// fonction permettant a l'utilisateur de soumettre un post
	void soumettrePost(Posts post){
		Gestionnaire.ajouterPost(this, post);
	}

	// fonction permettant a l'utilisateur de supprimer un post
	void supprimerPost(Posts post, ArrayList<Posts> liste){
		Gestionnaire.supprimerPost(this, post);
	}

	// fonction permettant a l'utilisateur de modifier son profil
	void modifierProfil(String newpseudo, String newmdp, String newcontact){
		this.pseudo=newpseudo;
		this.mdp=newmdp;
		this.contact=newcontact;
	}

	// fonction permettant a l'utilisateur de lire un post
	void consulter(Posts post){
		System.out.println(post.getPost());
	}

	// fonction permettant a un inscrit de s'abonner a un autre inscrit
	void demanderAbonnemenr(Inscrit i){
		Gestionnaire.ajouterAbonne(this, i);
	}
}
