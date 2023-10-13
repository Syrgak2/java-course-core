public class ServiceStation implements Service {

    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            updateTyre(bicycle);
        }
    }

    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            updateTyre(car);
            checkEngine(car);
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            updateTyre(truck);
            checkEngine(truck);
            checkTrailer(truck);
        }

    }

    public void updateTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void checkEngine(Transport transport) {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer(Transport transport) {
        System.out.println("Проверяем прицеп");
    }


}
