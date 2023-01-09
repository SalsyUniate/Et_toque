import java.util.ArrayList;

public class Gestionnaire{
    private ArrayList<Posts> Posts;

    public Gestionnaire(ArrayList<Posts> Posts){
        this.Posts = Posts;
    }

    public void ajouterPost(Posts post){
        Posts.add(post);
    }

    public void supprimerPost(Posts post){
        Posts.remove(post);
    }

    public void ajouterAbonne(Inscrit abonne, Inscrit abonnement){
        abonnement.abonnes.add(abonne);
    }

    public void supprimerAbonne(Inscrit abonne, Inscrit abonnement){
        abonnement.abonnes.remove(abonne);
    }
}
