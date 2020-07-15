package examjava;
public class Employe {
    private static int id;
    private String nomComplet;

    public Employe(String nomComplet) {
        this.nomComplet = nomComplet;
        id=++id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

 
    public String toString() {
        return "Employe{" + "id=" + id + ", nomComplet=" + nomComplet + '}';
    }
    
}
