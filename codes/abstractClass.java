abstract class person {
    protected String name, occupation;
    protected int age;
    protected float weightKG;
    person(String Name, int Age, float WeightKG, String Occupation) {
        this.name = Name;
        this.age = Age;
        this.weightKG = WeightKG;
        this.occupation = Occupation;
    }
    public abstract void work();
    public abstract void intro();
}

class employee extends person {
    private String Office;
    public employee(String Name, int Age, float WeightKG, String Occupation) {
        super(Name, Age, WeightKG, Occupation);
    }
    void setOffice(String off) {
        this.Office = off;
    }
    String getOffice() {
        return Office;
    }
    public void intro() {
        System.out.println("Hello, I am "+this.name);
        System.out.println("I am an employee at "+this.Office);
    }
    public void work() {
        System.out.println(this.name+" is a/an "+this.occupation);
    }
}

class student extends person {
    private String School;
    private String Subject;
    student(String Name, int Age, float WeightKG) {
        super(Name, Age, WeightKG, "Student");
    }
    void setSchool(String skul) {
        this.School = skul;
    }
    String getSchool() {
        return School;
    }
    void setSubject(String subj) {
        this.Subject = subj;
    }
    String getSubject() {
        return Subject;
    }
    public void intro() {
        System.out.println("Hello, I am "+this.name);
        System.out.println("I am a student at "+this.School);
        System.out.println("My favourite subject is "+this.Subject);
    }
    public void work() {
        System.out.println(this.name+" studies "+this.Subject+" very meticulously and in a careful manner");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        employee Emp1 = new employee("Suhas Paikroy", 32, 65.3f, "Sales Manager");
        Emp1.setOffice("L&T Private Firm");
        student Stu1 = new student("Debashis Sahoo", 14, 40.35f);
        Stu1.setSchool("GM Foundation International School");
        Stu1.setSubject("Geography");
        Emp1.intro();
        Emp1.work();
        System.out.println("");
        Stu1.intro();
        Stu1.work();
    }
}