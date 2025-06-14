package aula06;

public class Aluno extends Pessoa{
    private int studentID;
    private String course;

    public void deleteStudentID(){
        this.setStudentID(0);
    }

    public Aluno(String name, String gender, int age, int studentID, String course) {
        super(name, gender, age);
        this.studentID = studentID;
        this.course = course;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
