package web.model;

public class Car {

    private String owner;

    private String model;

    private String number;

    public Car(String owner, String model, String number) {
        this.owner = owner;
        this.model = model;
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                ", number='" + number + '\'';
    }
}
