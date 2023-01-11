package et_toc;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class GestionnaireTest {

    @Test
    public void testAjoutPost(){
        // creation d'un inscrit et d'un post
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Posts postDeQualite = new Posts("titreDuPost", "corpsDuPost", true);
    
        // utilisation de la fonction ajouterPost() et verification
        Gestionnaire.ajouterPost(Camille, postDeQualite);
        assertTrue(Camille.posts.contains(postDeQualite));
    }

    @Test 
    public void testSuppressionPost(){
        // creation d'un inscrit et d'un post
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Posts postDeQualite = new Posts("titreDuPost", "corpsDuPost", true);
        //ajout d'un post a un inscrit 'a la main'
        Camille.posts.add(postDeQualite);

        // utilisation de la fonction supprimerPost() et verification
        Gestionnaire.supprimerPost(Camille, postDeQualite);
        assertFalse(Camille.posts.contains(postDeQualite));
    }

    @Test
    public void testAjouterAbonne(){
        // creation de deux inscrits
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
    
        //utilisation de la fonction ajouterAbonne() et verification
        Gestionnaire.ajouterAbonne(Camille, Kevin);
        assertTrue(Kevin.abonnes.contains(Camille));
    }

    @Test 
    public void testSuppressionAbonne(){
        // creation de deux inscrits
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        // creation d'un abonnement 'a la main'
        Kevin.abonnes.add(Camille);

        // utilisation de la fonction supprimerAbonne() et verification
        Gestionnaire.supprimerAbonne(Camille, Kevin);
        assertFalse(Kevin.abonnes.contains(Camille));
    }

    @Test
    public void testNotifierAbonne(){
        // creation de deux inscrits et d'un post
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Posts ilesFlottantes = new Posts("Recette d'îles Flottantes", "Ceci est la meilleure recette du monde entier et de l'univers mais aussi du multivers, parce que je suis trop le meilleur de ouf", true);
        // ajout d'un abonne 'a la main'
        Kevin.abonnes.add(Camille);

        // utilisation de notifierAbonne() et verification
        assertTrue(Camille.notifications.isEmpty());
        Gestionnaire.notifierAbonnes(Kevin, ilesFlottantes);
        assertFalse(Camille.notifications.isEmpty());
    }

}
