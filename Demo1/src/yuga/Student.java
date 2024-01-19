package yuga;
// import Test3.*;
public class Student {
	
	
	private int id;
	private String name;
	private float marks;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name=name;
	}
	public float getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void getData() {
		id=1001;
		name="pooja";
		marks=87;
	}
	public void disData() {
		System.out.println(id+" "+name+" "+marks);
	}
	
	
	
	public void result()
	{
		if (marks>=35) {
			System.out.println("Pass");
		}
		
	}
	
		
		
	
	
	
//	public int id;
//	public String name;
//	public float marks;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Student st=new Student();
//		st.id=1001;
//		st.name="pooja";
//		st.marks=90;
//		System.out.println(st.id+" "+st.name+" "+st.marks+" ");
		

	}


