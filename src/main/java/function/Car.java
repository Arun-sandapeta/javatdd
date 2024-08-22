package function;

public class Car {

    private String company;
    private String model;

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public String getCompany() {
        return company;
    }



    public String getModel() {
        return model;
    }



    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
