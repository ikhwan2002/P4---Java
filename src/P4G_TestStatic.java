package konsepoop;

public class P4G_TestStatic {
    //Static Method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public Method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //Main Method
    public static void main(String[]args){
        myStaticMethod();//Call the static method
        //myPublicMethod(); This would output an error

        P4G_TestStatic myObj = new P4G_TestStatic(); //Create an object of MyClass
        myObj.myPublicMethod(); //Call the public method
    }
}
