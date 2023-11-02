package hogwarts;

import hogwarts.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    public Slytherin(String name, int witchcraft, int transgress,
                     int cunning, int determination, int ambition) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость " + cunning +
                ", решительность" + determination +
                ", амбициозность" + ambition;
    }
}
