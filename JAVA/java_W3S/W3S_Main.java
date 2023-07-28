import java.time.LocalTime;

public class W3S_Main {
    public static void main(String[] args){
        System.out.println("Hello Jake, This is W3S_Main.");


         // 현재 시간 구하기 
        LocalTime now = LocalTime.now();
 
        // 현재 날짜 구하기(Paris)
        //LocalDate parisNow = LocalDate.now(ZoneId.of("Europe/Paris"));
 
        // 결과 출력
        System.out.println(now);      
        //System.out.println(parisNow); // 2021-06-16


        /* 
        System.out.println( "Hello World!" );
        System.out.println(3);
        System.out.println(33+3);

        // This is a comment
           

         // git 어케하는지 모르겟음..... ㅠ

         String name = "Jake";
    
        System.out.println(name);

        // Declare variables of types

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        System.out.println(Math.max(5, 10));

        int xx = 10;
        System.out.println(xx==10);

        int myAge = 25;
        int votingAge = 18;

        if(myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }else{
            System.out.println("Not old enough to vote");
        }


        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result); */
        
/* 
        // For Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars){
            System.out.println(i);
        }

        // Break
        for (int i=0;i<10;i++){
            if(i==4){
                break;
            }
            System.out.println(i);            
        }

        // Continue
        for (int i = 0; i < 10; i ++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
*/
        // Array
/* 
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
        System.out.println(cars2.length); */


        // Loop Through a Multi-Dimensional Array
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};

        for (int i = 0; i < myNumbers.length; ++i){
            for (int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }

        //Java - What is OOP?
/* 
        OOP stands for Object-Oriented Programming.

        Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

        Object-oriented programming has several advantages over procedural programming:

        OOP is faster and easier to execute
        OOP provides a clear structure for the programs
        OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        OOP makes it possible to create full reusable applications with less code and shorter development time
        Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
 */
        //Java - What are Classes and Objects?
        //Classes and objects are the two main aspects of object-oriented programming.

        
        W3S_Main myObj = new W3S_Main();
        System.out.println(myObj.x);
      

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would complie an error

        W3S_Main myObj2 = new W3S_Main(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method on the object

        // Inside main, call the methods on the myCar object 
        W3S_Main myCar = new W3S_Main();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    
         W3S_Main myObj3 = new W3S_Main(); 
        System.out.println(myObj3.y);

        Person myPerson = new Person();
        myPerson.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myPerson.getName());
    }

    int x = 15;

    // the differences between static and public methods:
    // Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    // Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

     int y = 5;

     // Create a class constructor for the Main class
    public W3S_Main() {
        y = 728;  // Set the initial value for the class attribute x
    }




}
