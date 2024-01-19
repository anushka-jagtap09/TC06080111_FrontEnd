interface MyInterface {
    void myMethod();
    void anotherMethod();
    String MY_CONSTANT = "Hello from MyInterface!";
}

class MyClass implements MyInterface {
	public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.myMethod();
        myObject.anotherMethod();
        System.out.println(MyInterface.MY_CONSTANT);
	}
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Implementation of anotherMethod");
    }
}



