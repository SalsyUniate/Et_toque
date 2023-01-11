package et_toc;

public class Posts {
    public String titre;
    public String corps;
    public Boolean statut = false;

    // constructeur des posts
    public Posts(String titre, String corps, Boolean statut) {
		this.titre = titre;
        this.corps = corps;
        this.statut = statut;
	}
	
    // fonction permettant a un moderateur (non implemente) de valider le post
	public void Valider(){
        this.statut = true;
    }

    // getter du titre du post (necessaire pour la notification)
    public String getTitre(){
        return this.titre;
    }

    // getter du corps du post (necessaire a la consultation de posts)
    public String getPost(){
        return this.corps;
    }
    
}