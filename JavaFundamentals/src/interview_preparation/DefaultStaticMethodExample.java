package interview_preparation;

interface MyInterface {
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class DefaultStaticMethodExample implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method.");
    }
    
    //we can override default methods but we cannot override static methods
    @Override
	public void defaultMethod() {
        System.out.println("This is a overriden default method.");
    }

    public static void main(String[] args) {
        DefaultStaticMethodExample example = new DefaultStaticMethodExample();
        example.abstractMethod();
        example.defaultMethod(); // Calls the overriden default method.
        MyInterface.staticMethod(); // Calls the static method
    }
}
