public class Car extends Transport {

public Car(String modelName,int wheelsCount) {
    super(modelName,wheelsCount);
}

    @Override
    public void doService() {
        super.doService();
        updateTyre();
        checkEngine();
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}