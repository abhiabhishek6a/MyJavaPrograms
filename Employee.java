class Employee extends Object{
	String name;
	int age;
	int id;
	public Employee(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}

	public String toString(){
		return "ID : "+this.id+"\nName :"+this.name+"\nAge : "+this.age;
	}
}

class Manager extends Employee{
	String department;
	public Manager(String name,int age,int id,String department){
		this.name=name;
		this.age=age;
		this.id=id;
		this.department =department;
	}
}

class Run{
	public static void main(String[] args) {
		Object e = new Employee("Amit",30,1);
		e = new Manager("Amit",30,1,"Technical");
		e= new String("I am a Hero");
		e= new Integer(10);
		}
}