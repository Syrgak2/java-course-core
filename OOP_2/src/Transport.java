public abstract class Transport implements Serviceable {
    private String modelName;

    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public void check() {
        updateTyre();
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
