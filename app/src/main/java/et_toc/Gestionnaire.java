package et_toc;

// le gestionnaire suit un patron observateur
public class Gestionnaire{

    // constructeur
    public Gestionnaire(){}

    // fonction permettant de poster un post sur le profil d'un inscrit
    public static void ajouterPost(Inscrit inscrit, Posts post){
        inscrit.posts.add(post);
        notifierAbonnes(inscrit, post);
    }

    // fonction permettant de notifier des abonnes d'un nouveau post
    public static void notifierAbonnes(Inscrit inscrit, Posts post){
        for (int i = 0; i < inscrit.abonnes.size(); i++){
            inscrit.abonnes.get(i).notifications.add(inscrit.getPseudo()+" vient de poster " + post.getTitre() + "!");
        }
    }

    // fonction permettant de supprimer un post
    public static void supprimerPost(Inscrit inscrit, Posts post){
        inscrit.posts.remove(post);
    }

    // Fonction permettant d'ajouter un inscrit a une liste d'abonnes 
    public static void ajouterAbonne(Inscrit fan, Inscrit abonnement){
        abonnement.abonnes.add(fan);
    }

    // fonction permettant de supprimer un inscrit d'une liste d'abonnes
    public static void supprimerAbonne(Inscrit plusFan, Inscrit abonnement){
        abonnement.abonnes.remove(plusFan);
    }
}
