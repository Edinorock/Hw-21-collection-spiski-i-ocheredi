package Transport;

public class Car extends Transport implements Compating{

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getTypeOfBody() {

        return bodyType;
    }

    public void setTypeOfBody(BodyType bodyType) {

        this.bodyType = bodyType;
    }

    @Override
    public void repair() {

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {

        return Math.random() > 0.5;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение");

    }

    @Override
    public boolean diagnostic() {

        return Math.random()>0.5;
    }



    @Override
    public void printType() {
        if(bodyType ==null) {
            System.out.println("Недостаточно информации");
        } else {
            System.out.println("Тип кузова автомобиля: " + bodyType);
        }

    }

    @Override
    public void pitStop() {

        System.out.println(this.getBrand() + " " + this.getModel() + " - уходит на пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - лучшее время круга");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - достигает максимальной скорости");
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + bodyType +
                '}';
    }
}