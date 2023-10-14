public class Car extends EngineTransport{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        System.out.println("обслуживаем машину " + this.getModelName());
        super.check();
    }

}
