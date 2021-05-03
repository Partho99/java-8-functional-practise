package functional.stream.demo;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private long salary;
    private String grade;

    public Employee(int id, String name, String dept, long salary, String grade) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String   toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }
}
