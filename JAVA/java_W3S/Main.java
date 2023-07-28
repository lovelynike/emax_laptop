import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Jake");


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
    }
    
}
