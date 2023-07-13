class Quiz {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Student1");
        System.out.println("==================================================================");
        Student student1 = new Student();
        student1.showDetails();
        System.out.println("==================================================================");
        System.out.println("Change Properties Student1");
        System.out.println("==================================================================");
        student1.Name = "kingo";
        student1.addmissionYear = 99;
        student1.GPA = 3.45f;
        student1.showDetails();

        System.out.println("==================================================================");
        System.out.println("\n");
        System.out.println("Student2");
        System.out.println("==================================================================");

        Student student2 = new Student("ef", 65, 3.45f);
        student2.showDetails();
        System.out.println("==================================================================");
        System.out.println("Change Properties Student2");
        System.out.println("==================================================================");
        student2.addmissionYear = 66;
        student2.GPA = 3.99f;
        student2.showDetails();
        System.out.println("==================================================================");

        System.out.println("Student2_ID : "+student2.GetId());

    }
}

class Student {
    private static int ID = 100001;
    public String Name;
    public int addmissionYear;
    public float GPA;

    private int Stu_ID = ID;

    Student(){
        ID += 1;
        this.Name = "Null";
        this.addmissionYear = 0;
        this.GPA = 0f;
    }

    Student(String name,int amy,float GPA){
        ID += 1;
        this.Name = name;
        this.addmissionYear = amy;
        this.GPA = GPA;
    }

    public int GetId(){
        return this.Stu_ID;
    }

    public void showDetails(){
        System.out.println("Student ID : " + this.Stu_ID + "\nStudent_Name : " + this.Name + "\nStudent_addmissionYear : " + this.addmissionYear + "\nGPA_Student : " + this.GPA);
    }
}
