package Task7.Services;

import Task7.model.*;
public class ServiceClupFcImp implements ServiceClupFc,ServiceClup {

    @Override
    public void printClup(Club club) {
        System.out.println("ID: "+club.getId()+", "+"Number: "+club.getNumber()+", "+"Name: "+club.getName());
    }

    @Override
    public void printClupFc(clupFc clupFc) {
        System.out.println("ID: "+clupFc.getId()+", "+"Number: "+clupFc.getNumber()+", "+"Name: "+clupFc.getName()+
                ", "+"CodeFc: "+clupFc.getFcode());

    }
}
