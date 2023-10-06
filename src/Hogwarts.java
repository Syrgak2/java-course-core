public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.transgress = transgress;
        this.witchcraft = witchcraft;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                ",  колдовать: " + witchcraft +
                ", трансгрессировать" + transgress;
    }
}
