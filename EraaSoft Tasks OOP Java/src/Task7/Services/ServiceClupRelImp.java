package Task7.Services;

import Task7.model.*;


public class ServiceClupRelImp implements ServiceClupRel,ServiceClup{
    @Override
    public void printClup(Club club) {
        System.out.println("ID: "+club.getId()+", "+"Number: "+club.getNumber()+", "+"Name: "+club.getName());
    }

    @Override
    public void printClupRel(clupRel clupRel) {
        System.out.println("ID: "+clupRel.getId()+", "+"Number: "+clupRel.getNumber()+", "+"Name: "+clupRel.getName()+
                ", "+"CodeRel: "+clupRel.getRcode());

    }

}
