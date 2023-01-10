package et_toc;

public class Posts {
    public String titre;
    public String corps;
    public Boolean statut = false;

    public Posts(String titre, String corps, Boolean statut) {
		this.titre = titre;
        this.corps = corps;
        this.statut = statut;
	}
	
	public void Valider(){
        this.statut = true;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getPost(){
        return this.corps;
    }
    
}