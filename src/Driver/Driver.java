package Driver;
import Transport.*;


public abstract class Driver<T extends Transport>{

    private String fullNameDriver;
    private String license;
    private int experience;


    public Driver(String fullNameDriver, boolean license, int experience) {
        setFullNameDriver(fullNameDriver);
        setLicense(String.valueOf(license));
        setExperience(experience);

    }

    public abstract void start(T transport);


    public abstract void stop(T transport);


    public abstract void refill(T transport);


    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public void setFullNameDriver(String fullNameDriver) {

        if (fullNameDriver == null || fullNameDriver.isEmpty()) {
            this.fullNameDriver = "Нет информации";
        } else {
            this.fullNameDriver = fullNameDriver;
        }
    }


    public String license() {
        return license;
    }

    public void setLicense(String license) {
        if(license == null) {
            throw new IllegalArgumentException("Укажите тип прав");
        }
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullNameDriver='" + fullNameDriver + '\'' +
                ", license=" + license +
                ", experience=" + experience +
                '}';
    }
}