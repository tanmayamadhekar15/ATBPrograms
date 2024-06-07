package may28_collectionFramework.ArrayList.Example;

public class Employee {

    private String empName;
    private int empCode;

    public Employee(int empCode, String empName) {
        this.empCode = empCode;
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empCode=" + empCode +
                '}';
    }
}
