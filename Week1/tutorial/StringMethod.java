package tutorial;


class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + "]";
    }
}



public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	Student student = new Student("Kamal", 20);
        System.out.println(student.toString());
		}

}
