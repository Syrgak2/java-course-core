package hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int witchcraft, int transgress,
                      int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }
}
