public class Student {
	private String name;
	private int age;
	private char gender;
	static int numberInstance;
	Student(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		numberInstance++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
		Student[] stu=new Student[5];
		stu[0]=new Student("fox",21,'f');
		stu[1]=new Student("xixi",5,'f');
		System.out.println(Student.numberInstance);
		stu[2]=new Student("rz",22,'m');
		stu[3]=new Student("haha",1,'m');
		stu[4]=new Student("lala",16,'f');
		System.out.println(Student.numberInstance);
	}
}