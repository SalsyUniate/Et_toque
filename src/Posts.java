public class Posts {
    public String titre;
    public String corps;
    public bool statut = 0;

    public Posts(String titre, String corps, bool statut) {
		this.titre = titre;
        this.corps = corps;
        this.statut = statut;
	}
	
	public void Valider(){
        this.statut = 1;
    }

    public titre getTitre(){
        return this.titre;
    }

    public String getPost();
    
}