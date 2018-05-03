package location;

public class Client {
    private Voiture voiture;
    private String nom;
    private String prénom;
    private int age;
    private int numPermis;
    
    //Constructeur
    public Client(String nom, String prénom, int age, int numPermis) {
        this.nom = nom;
        this.prénom = prénom;
        this.age = age;
        this.numPermis = numPermis;
    }
    
    public Client(){
        
    }
    
    //Accesseur
    public String getPrenom() {
        return this.prénom;
    }
        
    public void setPrenom(String prénom) {
        this.prénom = prénom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getNumPermis(){
        return this.numPermis;
    }
    
    public void setNumPermis(int numPermis){
        this.numPermis = numPermis;
    }
    
}
