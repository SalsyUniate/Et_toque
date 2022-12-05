public class Annonce extends Posts {
    public float prix;

    public Annonce(String titre, String corps, Boolean statut, float prix) {
        super(titre, corps, statut);
		this.prix = prix;
	}

	@Override
		public String getPost(){
			return (this.titre + ", \n\r" + this.corps + ", \n\r" + "Prix : " + this.prix + "euro");
		}
}