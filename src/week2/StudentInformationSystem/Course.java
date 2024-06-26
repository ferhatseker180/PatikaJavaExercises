package week2.StudentInformationSystem;

public class Course {
    //We defined our variables
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int spokenExam;

    // We set our constructor
    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.spokenExam = 0;
    }

    // Teacher Add System Algorithm
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Transaction Succesful");
        } else {
            System.out.println(t.name + " doesn't give this course");
        }
    }

    // Give Teacher Information Codes Blocks
    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " Course Teacher : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " Course hasn't teacher.");
        }
    }

}
