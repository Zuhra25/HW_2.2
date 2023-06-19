public abstract class Transport implements ServiceCheck {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName,int wheelsCount) {
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
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

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
    }
}
