package task3;

public class Counter {
    static int count=0;

    //constructor
    Counter(){
    count++;
    }

    public static void noOfInstances(){
        System.out.println(count);
    }
}