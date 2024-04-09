public class StudentPractice {

    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student();
        student.setName("Eric");
        student.setStudentId(12345);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);
        System.out.println(student.getName() + " " + student.getStudentId() + " " + student.getNumberOfCredits() + " " + student.getGpa());
    }
}
