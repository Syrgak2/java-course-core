package hogwarts;

import hogwarts.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name, int witchcraft, int transgress,
                     int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", мудрость: " + wisdom +
                ", остроумность: " + wit +
                ", кретивность: " + creativity;
    }
}
