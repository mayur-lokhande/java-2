package interview_preparation;

//Singleton Class Example
public class SingletonClassDemo {
    //Step 1- create a private static variable of the same class typr
    private static SingletonClassDemo instance;

    //Step 2- Make the constructor private to prevent instantiation from outside the class
    private SingletonClassDemo(){

    }
    //Step 3- provide a public static method to return the single instance.
    public static SingletonClassDemo getInstance(){
        if(instance==null){
            //Step 4- if instance is null, create the object(Lazy initialization)
            instance=new SingletonClassDemo();
        }
        //Step 5- return the single instance of the class.
        return instance;
    }
    //example method to demonstrate the functionality
    public void showMessage(){
        System.out.println("Hello from SingletonClassDemo");
    }

    public static void main(String[] args) {
        //get the only instance of SingletonClassDemo
        SingletonClassDemo singleton=SingletonClassDemo.getInstance();

        //call the method on the SingletonClassDemo instance
        singleton.showMessage();
    }
}
