package function;

public class Employe {
    private String empId;
    private String name;

    public Employe(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String getEmpId() {
        return this.empId;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
