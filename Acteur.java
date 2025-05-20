public class Acteur {

    private String nom;
    private String prenom;

    public Acteur (String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public void affiche(){
        System.out.println(prenom+" "+nom);
    }

    public boolean equals(Acteur a) {
        boolean resultat=false;
        if ((this.nom.equals(a.nom))&&(this.prenom.equals(a.prenom))){
            resultat = true;}
        return resultat;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}