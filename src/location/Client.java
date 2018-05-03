package location;

public class Client {
    private String nom;
    private String prénom;
    private int age;
    private int numPermis;
    private int id;
    
    public static int COUNT =0;
    //Constructeur
    public Client() {
        COUNT ++;
        this.id = COUNT;
    }
    
    public Client(String nom, String prénom, int age, int numPermis) {
        this();
        this.nom = nom;
        this.prénom = prénom;
        this.age = age;
        this.numPermis = numPermis;
    }

    
    //Accesseur

    public String getNom() {
        return nom;
    }
    
    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumPermis() {
        return numPermis;
    }

    public void setNumPermis(int numPermis) {
        this.numPermis = numPermis;
    }
    
      
    
    
}
