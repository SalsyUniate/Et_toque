import java.util.ArrayList;

public class Inscrit {
	public String pseudo;
	public String mdp;
	public String contact;
	public ArrayList<Post> post;
	public boolean statusConnexion = false;
	
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

	void depot(Post post, ArrayList<Post> liste){
		liste.add(post);
		
	}
	void supprimer(Post post, ArrayList<Post> liste){
		for(int i=0 ; i<liste.size(); i++){
			if(liste.get(i).getTitre() == post.getTitre){
				liste.remove(i);
				break;
			}
			
		}
	}
	void modifierProfil(String newpseudo, String newmdp, String newcontact){
		this.pseudo=newpseudo;
		this.mdp=newmdp;
		this.contact=newcontact;

	}
	void consulter(Post post){
		System.out.println(this.getpost());
	}
}
