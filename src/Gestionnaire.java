public class Gestionnaire{

    public Gestionnaire(){
    }

    public static void ajouterPost(Inscrit inscrit, Posts post){
        inscrit.posts.add(post);
        notifierAbonnes(inscrit, post);
    }

    public static void notifierAbonnes(Inscrit inscrit, Posts post){
        for (int i = 0; i < inscrit.abonnes.size(); i++){
            inscrit.abonnes.get(i).notifications.add(inscrit.getPseudo()+" vient de poster " + post.getTitre() + "!");
        }
    }

    public static void supprimerPost(Inscrit inscrit, Posts post){
        inscrit.posts.remove(post);
    }

    public static void ajouterAbonne(Inscrit fan, Inscrit abonnement){
        abonnement.abonnes.add(fan);
    }

    public static void supprimerAbonne(Inscrit plusFan, Inscrit abonnement){
        abonnement.abonnes.remove(plusFan);
    }
}
