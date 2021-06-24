public class Student {
    public int id;
    public Student(int id){
        this.id = id;
    }

    // Chuyen tat ca id cua student t ve 0
    // Tham tri: value type | primative type : int, bool
    // Tham chieu: ref | object:
    public static void resetId(Student t){
        Student newStudent = new Student(0);
        t = newStudent;
        t.id = 0;
    }

    public static void increaseId(Student t){
        t.id++;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(3);
       
        s1 = s2; s2 = s3;

        System.out.println("s1.id: " + s1.id);
    }
}
