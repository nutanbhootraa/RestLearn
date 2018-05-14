package dog;

import java.util.Date;

public class DogProps {
    private int id;
    private String name;
    private String breed;
    private int activeRate;
    private Date DOB;
    private char knowsHumanLanguage;

    public DogProps() {
    }

    public DogProps(int id, String name, String breed, int activeRate, Date DOB, char knowsHumanLanguage) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.activeRate = activeRate;
        this.DOB = DOB;
        this.knowsHumanLanguage = knowsHumanLanguage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getActiveRate() {
        return activeRate;
    }

    public Date getDOB() {
        return DOB;
    }

    public char getKnowsHumanLanguage() {
        return knowsHumanLanguage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setActiveRate(int activeRate) {
        this.activeRate = activeRate;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setKnowsHumanLanguage(char knowsHumanLanguage) {
        this.knowsHumanLanguage = knowsHumanLanguage;
    }

    public void setId(int id) {
        this.id = id;
    }
}