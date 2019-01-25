package TP1;
import org.w3c.dom.NodeList;

/**
 * Petit programme pour lancer quelques tests.
 * 
 * @author Emmanuel Promayon, (c) UJF - Polytech'Grenoble - 2011
 */
public class DomTest {
    //hello

    public static void main(String[] args) {
        String nomDocumentCentre = "src/centre.xml";


        // Test 1 : lecture et petit traitement
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test de lecture et d'analyse simple du document " + nomDocumentCentre);
        TP1.DomLecture lireEtAnalyser;
        lireEtAnalyser = new TP1.DomLecture(nomDocumentCentre);
        lireEtAnalyser.test();
        
        // Test 2 : lecture et dump de tout le contenu
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test de lecture et dump de tout le contenu du document " + nomDocumentCentre);
        TP1.DomDump dump;
        dump = new TP1.DomDump(nomDocumentCentre);
        dump.test();
        
        // Test 3 : écriture d'une structure dom dans un nouveau document XML
        String nomNouveauDocument = nomDocumentCentre.replaceAll(".xml", "-output.xml");
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test d'écriture de " + nomNouveauDocument);
        TP1.DomEcriture ecrire;
        ecrire = new TP1.DomEcriture(nomNouveauDocument);
        ecrire.test();

        //Test 4 : Nbre Code
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test nombre de codes et de fiches " + nomDocumentCentre);
        TP1.DomNombre nombre;
        nombre = new TP1.DomNombre(nomDocumentCentre);
        nombre.test();

        //Test 5 : Liste noms des medecins
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test affichage noms des médedins" + nomDocumentCentre);
        TP1.DomMedecin medecin;
        medecin = new TP1.DomMedecin(nomDocumentCentre);
        medecin.test();

        //Test 6 : affiche les fiches de soins en remplaçant l'id du médécin par son nom/prénom
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Test affichage fiche de soins avec nom medecins" + nomDocumentCentre);
        TP1.DomFichesDeSoins fiche;
        fiche= new TP1.DomFichesDeSoins(nomDocumentCentre);
        fiche.test();

    }

}
