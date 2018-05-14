package com.Nutan.RestLearn.dog;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class DogDAO {
    private static List<DogProps> dogs=new ArrayList<>();
    private static int DogId=1;

    static {
        DogProps dogProps=new DogProps(1,"Johny","German",4,new Date(),'y');
        dogs.add(dogProps);
    }

    //GetAllDogs
    public List<DogProps> getAllDogs(){
        return dogs;
    }

    //get 1 dog based on id
    public DogProps getDog(int id){
        for(DogProps dog:dogs){
            if(dog.getId()==id)
                return dog;
        }
        return null;
    }

    //get dogs based on breed
    public List<DogProps> getDogs(String breed) {
        List<DogProps> doggy = new ArrayList<>();
        for(DogProps dog : dogs)
            if(dog.getBreed().equals(breed))
                doggy.add(dog);

        return doggy;
    }

    //get dogs based on human language understandable or not
    public List<DogProps> getDogs(char yn) {
        List<DogProps> doggy = new ArrayList<>();
        for(DogProps dog : dogs)
            if(dog.getKnowsHumanLanguage()==yn)
                doggy.add(dog);
        return doggy;
    }

    //get dogs based on Active level
    public List<DogProps> getDogs(int level1, int level2) {
        List<DogProps> doggy = new ArrayList<>();
        for(DogProps dog : dogs)
            if(dog.getActiveRate() >=level1 && dog.getActiveRate() <=level2)
                doggy.add(dog);
        return doggy;
    }

    //get dogs based on dob(After DOB)
    public List<DogProps> getDogs(Date date) {
        List<DogProps> doggy = new ArrayList<>();
        for(DogProps dog : dogs)
            if(dog.getDOB().after(date))
                doggy.add(dog);
        return doggy;
    }

    //Add dog in database
    public DogProps addDog(DogProps dogProps){
        if((dogProps.getId())==0)
            dogProps.setId(++DogId);
        dogs.add(dogProps);
        return dogProps;
    }

    //delete dog
    public DogProps delDogs(int id) {
        Iterator<DogProps> iterator=dogs.iterator();
        DogProps dp=null;
        while(iterator.hasNext()) {
            DogProps dog = iterator.next();
            if (dog.getId() == id) {
                dp=dog;
                iterator.remove();
            }
        }
        return dp;
    }

    //update dog
    public DogProps updateDog(DogProps dogProps,int id) {

        for(DogProps dog : dogs)
            if(dog.getId()==id) {
                dogProps.setId(id);
                dog.setName(dogProps.getName());
                dog.setBreed(dogProps.getBreed());
                dog.setKnowsHumanLanguage(dogProps.getKnowsHumanLanguage());
                dog.setActiveRate(dogProps.getActiveRate());
                dog.setDOB(dogProps.getDOB());
            }

        return dogProps;
    }
}
