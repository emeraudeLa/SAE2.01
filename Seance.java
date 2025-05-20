import java.util.Date;

public class Seance {
    private Date date;
    private String typeSeance;
    private Film film;

    public Seance(Date date, String typeSeance) {
        this.date = date;
        this.typeSeance = typeSeance;
        this.film=null;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTypeSeance(String typeSeance) {
        this.typeSeance = typeSeance;
    }

    public Date getDate() {
        return date;
    }

    public String getTypeSeance() {
        return typeSeance;
    }
    

    public void affiche(){
        System.out.println(date+" "+typeSeance);
    }

    public boolean equals(Seance s) {
        boolean resultat=false;
        if ((this.date.equals(s.date))&&(this.typeSeance.equals(s.typeSeance))){
            resultat = true;}
        return resultat;
    }

    private void affecterFilm(Film f){
        this.film=f;
    }

    private void enleverFilm(){
        this.film=null;
    }


    public void ajouterProgrammer(Film f){
        if (f==null){
            System.out.println("Pas possible de faire cette action");
        }
        else{
            affecterFilm(f);
        }

    }

    public void enleverProgrammer(Film f){
        if (f==null){
            System.out.println("Pas possible de faire cette action");
        }
        else{
            enleverFilm();
        }

    }
}
