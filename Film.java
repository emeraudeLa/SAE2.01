public class Film {
    private String titre;
    private int duree;
    private String nationalite;
    private String resume;
    
    public Film(String titre, int duree, String nationalite, String resume) {
        this.titre = titre;
        this.duree = duree;
        this.nationalite = nationalite;
        this.resume = resume;
    }

    public void affiche(){
        System.out.println(titre+"        Film "+nationalite+" de "+duree+" mn\nRésumé : "+resume);
    }

    public boolean equals(Film f) {
        boolean resultat=false;
        if (this.titre.equals(f.titre)){
            resultat = true;}
        return resultat;
    }

    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getResume() {
        return resume;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

}
