package aula06;

public class Professor extends Pessoa {
    private String specialty;
    private double salary;


    public void receiveRaise(int raise){
        this.setSalary(getSalary() + raise);
    }
    public Professor(String name, String gender, int age, String specialty, double salary) {
        super(name, gender, age);
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
