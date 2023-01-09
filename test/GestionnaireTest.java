import java.beans.Transient;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GestionnaireTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{}

    @AfterClass
    public static void tearDownAfterClass() throws Exception{}

    @Before 
    public void setUp() throws Exception{}

    @After 
    public void tearDown() throws Exception{}


    @Test
    public void testAjoutPost(){
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Posts postDeQualite = new Posts("titreDuPost", "corpsDuPost", true);
    
        Gestionnaire.ajouterPost(Camille, postDeQualite);
        assertTrue(Camille.posts.contains(postDeQualite));
    }

    @Test 
    public void testSuppressionPost(){
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Posts postDeQualite = new Posts("titreDuPost", "corpsDuPost", true);
        Camille.posts.add(postDeQualite);

        Gestionnaire.supprimerPost(Camille, postDeQualite);
        assertFalse(Camille.posts.contains(postDeQualite));
    }

    @Test
    public void testAjouterAbonne(){
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
    
        Gestionnaire.ajouterAbonne(Camille, Kevin);
        assertTrue(Kevin.abonnes.contains(Camille));
    }

    @Test 
    public void testSuppressionAbonne(){
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Kevin.abonnes.add(Camille);

        Gestionnaire.supprimerAbonne(Camille, Kevin);
        assertFalse(Kevin.abonnes.contains(Camille));
    }

    @Test
    public void testNotifierAbonne(){
        Inscrit Camille = new Inscrit("yaCAManger", "mdp", "contact", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Inscrit Kevin = new Inscrit("KevLeCuistot", "motdp", "contactdekev", new ArrayList<Posts>(), true, new ArrayList<Inscrit>(), new ArrayList<String>());
        Kevin.abonnes.add(Camille);
        Posts ilesFlottantes = new Posts("Recette d'îles Flottantes", "Ceci est la meilleure recette du monde entier et de l'univers mais aussi du multivers, parce que je suis trop le meilleur de ouf", true);

        Gestionnaire.notifierAbonnes(Kevin, ilesFlottantes);
        assertFalse(Camille.notifications.isEmpty());
    }

   

}
