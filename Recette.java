public class Recette extends Posts{
    public int note;

    public Annonce(String titre, String corps, bool statut, int note){
        super(titre, corps, statut);
        this.note = note
    }



	public void Noter(int n){
        this.note = n;
    }

	@Override
		public String getPost(){
			return (this.titre + ", \n\r" + this.corps + ", \n\r" + "Note : " this.prix + "/10");
		}

}