package examjava;

import java.util.ArrayList;
public class Functions implements  IService{
    ArrayList<Service> bdS= new ArrayList<>();  
    ArrayList<Employe> bdE = new ArrayList<>();


    @Override
    public void addService(Service s) {
                bdS.add(s);

    }

    @Override
    public void listService(Service s) {
    }