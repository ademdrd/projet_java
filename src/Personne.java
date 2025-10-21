public class Personne {
    private String nom;
    private    int age;
    private  long cin;
    public Personne(String nom,int age,long cin){
        this.nom=nom;
        this.age=age;
        this.cin=cin;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public long getCin(){
        return cin;
    }

    public void setCin(long cin){
        this.cin = cin;
    }


    public void getInfos(){

        System.out.println("Nom : "+nom);
        System.out.println("Age : "+age);
        System.out.println("CIN : "+cin);
    }
}
