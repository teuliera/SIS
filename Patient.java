import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.IOException;

public class Patient {
String NomUsuel;
String NomDeNaissance;
Date DateDeNaissance;
Sexe sexe;
String prenom;
Adresse adresse;
Ipp ipp;
MedecinGeneraliste medecinGeneraliste;
Dma dma;
Localisation localisation;

    public Patient(String nomUsuel, String nomDeNaissance, Date dateDeNaissance, Sexe sexe, String prenom, Adresse adresse, Ipp ipp, MedecinGeneraliste medecinGeneraliste, Dma dma, Localisation localisation) {
        NomUsuel = nomUsuel;
        NomDeNaissance = nomDeNaissance;
        DateDeNaissance = dateDeNaissance;
        this.sexe = sexe;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ipp = ipp;
        this.medecinGeneraliste = medecinGeneraliste;
        this.dma = dma;
        this.localisation = localisation;
    }


    public String getNomUsuel() {
        return NomUsuel;
    }

    public void setNomUsuel(String nomUsuel) {
        NomUsuel = nomUsuel;
    }

    public String getNomDeNaissance() {
        return NomDeNaissance;
    }

    public void setNomDeNaissance(String nomDeNaissance) {
        NomDeNaissance = nomDeNaissance;
    }

    public Date getDateDeNaissance() {
        return DateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Ipp getIpp() {
        return ipp;
    }

    public void setIpp(Ipp ipp) {
        this.ipp = ipp;
    }

    public MedecinGeneraliste getMedecinGeneraliste() {
        return medecinGeneraliste;
    }

    public void setMedecinGeneraliste(MedecinGeneraliste medecinGeneraliste) {
        this.medecinGeneraliste = medecinGeneraliste;
    }

    public Dma getDma() {
        return dma;
    }

    public void setDma(Dma dma) {
        this.dma = dma;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
}
}
