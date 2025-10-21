public class Etudiant extends Personne{
    private double moyenne;
    public Etudiant(String nom, int age, long cin, double moyenne) {
        super(nom, age, cin);
        this.moyenne = moyenne;
    }

    public double getMoyenne(){
        return moyenne;
    }

    public void setMoyenne(double moyenne){
        this.moyenne=moyenne;
    }
    @Override
    public void getInfos(){
        super.getInfos();
        System.out.println("Moyenne : "+moyenne);
    }
}
