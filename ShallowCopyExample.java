
class ABC {

    // instance variables
    int x = 9;
}

public class ShallowCopyExample {

    public static void main(String[] args) {
        // create an instance object1
        ABC obj1 = new ABC();
        //   create an instance object2
        // it will copy  the reference, not value 
        ABC obj2 = obj1;

        // update the value 
        obj2.x = 45;

        System.out.println("The value of x is " + obj1.x);
    }
}
