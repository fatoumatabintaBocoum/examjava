package examjava;

import java.util.ArrayList;
import java.util.Scanner;
public class ExamJava {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arret=1;

  do{
      
        System.out.println("1-Ajout Service et lister\n"
                + "2-Ajouter et Lister service \n"
                + "3-affecter et Lister les employées par service\n"  
        + "4-Quitter\n");

            int choice = sc.nextInt();
             ArrayList<Service> services= new ArrayList<>();
             ArrayList<Employe> employes= new ArrayList<>();
             Functions function = new Functions();
             Service service = new Service();

       switch (choice) {
  case 1:
    System.out.println("Veuillez entrer le nom du service");
    sc.nextLine();
    String nomservice = sc.nextLine();
    service.setLibelle(nomservice);
  services.add(service);
    for(Service elem: services)
       {
                System.out.println (elem);
       }
    break;
  case 2:
    System.out.println("Welcome "); 
    System.out.println("Veuillez entrer le nom de l'employe");
    sc.nextLine();
    String nomComplet = sc.nextLine();
    Embauche embauche = new service(nomComplet);
    employes.add(embauche);
                  for(Employe elem: employes)
       {
           if(!elem.isEmbauche()){
                System.out.println (elem);
           }
       }
    break;
           }
       }
    break;
  case 4:
    System.out.println("Au revoir");
    break;
  default:
     System.out.println("Choix impossible");
     break;

}

  }while(arret!=4);
 
        
    }
    
}
