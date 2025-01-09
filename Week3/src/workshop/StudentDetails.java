package workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student {

	private int id;
	private String name;
	private int age;
	private char grade;

	public Student(int id, String name, int age, char grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	void setID(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setGrade(char grade) {
		this.grade = grade;
	}

	int getID() {
		return this.id;
	}

	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}

	char getGrade() {
		return this.grade;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + age + ", " + grade + "\n";
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Kamal", 20, 'A');
		Student s2 = new Student(2, "Anush", 19, 'A');
		Student s3 = new Student(3, "Ajar", 18, 'B');
		try {
			FileWriter fw = new FileWriter("student.csv");
			fw.write("Id, Name, Age, Grade\n");
			fw.write(s1.toString());
			fw.write(s2.toString());
			fw.write(s3.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader fr = new FileReader("student.csv");
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
