package aula06;

public class Funcionario extends Pessoa {
    private String department;
    private boolean work;


    public void changeWork(){
        this.setWork(! this.isWork());
    }

    public Funcionario(String name, String gender, int age, String department, boolean work) {
        super(name, gender, age);
        this.department = department;
        this.work = work;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
