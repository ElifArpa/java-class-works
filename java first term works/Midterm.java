// import javax.sound.sampled.SourceDataLine;

// public class Midterm {
//     public static void main(String[] args){
//         System.out.println("I like pizza");
//         System.out.println("It's really good");
//         System.out.println("Buy me pizza!");

//     }

    


    
// }

// DATA TYPES
// PRİMİTİVE = simple value stored directly in memory(stack) =int-double-char-boolean
// REFERENCE = memory address (stack) that points to the (heap)=string-array-object

// STEPS TO CREATİNG A VARİABLE
// 1-) DECLARATİON
// 2-) ASSİGNMENT
// 
// public static void main(String[] args) {
//     int age = 30;
// System.out.println("Jack's age is: "+ age);
    
// }

// public static void main(String[] args) {
//     double price = 17.99;
//     double temperature = 22.3;
//      System.out.println("the pizza'z price is: "+ price);
    
// }


// public static void main(String[] args){
//     char symbol = '!';
//     char grade = 'A';
//     System.out.println("Her math grade was: "+ grade);

// }

// public static void main(String[] args){
//     boolean forSale = false;
//     System.out.println("is these vegetables on sale ? : "+ forSale);
// }

// public static void main(String[] args){
//     String email = "fake123@gmail.com";
//      System.out.println("my email is : " + email);
// }


// HOW WE ACCEPT A USER'S İNPUT İN JAVA WİTH SCANNER 
// import java.util.Scanner;
// public class Midterm{
//     public static void main(String[] args){
//         Scanner elf = new Scanner(System.in);

//         // System.out.println("Enter your name : ") ;

//         // String name = elif.nextLine();
//         // System.out.println("Hello "+ name);
        

//         System.out.println("What is your GPA : ");
//         double GPA = elf.nextDouble();
//         System.out.println("your GPA is : " + GPA);

//         elf.close();
//     }

// }


// public class Midterm {
//     public static void main(String[] args) {
    // İNCREMENT AND DECREMENT OPERATORS
    // int x = 1;
    // x = x + 1; == x +=1; == x++;  all are same =2
    // x = x - 1; == x -=1; == x--;  all are same =0
    // System.out.println(x);
    

    // ORDER OF OPERATİONS [P-E-M-D-A-S]
    // double result = 3 + 4 * (7-5) / 2.0;
    // System.out.println(result);
    // }
    
// }


// import java.util.Scanner;
// public class Midterm {
//     public static void main(String[] args) {
        // if STATEMENT = PERFORMS A  BLOCK OF CODE İF İTS CONDİTİON İS TRUE
        // Scanner ages = new Scanner(System.in);
        // System.out.println("please enter your age: ");
        // int age = ages.nextInt();

        // if(age>=65){
        //     System.out.println("You are a senior!");
        // }
        // else if(age>=18){
        //     System.out.println("you are an adult!");
        // }
        // else if(age==0){
        //     System.out.println("you are a baby!");
        // }
        // else if(age<0){
        //     System.out.println("you havent been born yet!");
        // }
        // else{
        //     System.out.println("you are a child!");
        // }
        // ages.close();

//         Scanner names = new Scanner(System.in);
//         System.out.println("Please enter your name: ");
//         String name = names.nextLine();
//         if(name.isEmpty()){
//             System.out.println("You didn't enter your name!");
//         }
//         else{
//             System.out.println("Your name is " + name );
//         }
//         names.close();
//     }

    
// }

// RANDOM NUMBERS

// import java.util.Random;

// public class Midterm {
//     public static void main(String[] args) {
//         Random numbers = new Random();

//         // int number;
//         // number = numbers.nextInt(987);  //zero to 987 zero include but 987 not

//         // System.out.println(number);

//         // double number = numbers.nextDouble();
//         // System.out.println(number); //give number between 1 and 0

//         boolean isHeads = numbers.nextBoolean();
        
//         if(isHeads){
//             System.out.println("HEADS");
//         }
//         else{
//             System.out.println("TAILS");
//         }
        
//     }
    
// }


// MATH CLASS
// public class Midterm {
//     public static void main(String[] args) {
//         System.out.println(Math.PI);
//         System.out.println(Math.E);

//         double result;
//         double result1;
//         double result2;
//         double result3;
//         double result4;
//         double result5;
//         double result6;
//         double result7;
        
//         result = Math.pow(3,2);
//         result1 = Math.abs(-7);
//         result2 = Math.sqrt(16);
//         result3 = Math.round(4.87);
//         result4 = Math.ceil(4.23); //its round to the upper integer
//         result5 = Math.floor(4.99);//its round to the floor integer
//         result6 = Math.max(10,20);
//         result7 = Math.min(10,20);

//         System.out.println(result);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//         System.out.println(result4);
//         System.out.println(result5);
//         System.out.println(result6);
//         System.out.println(result7);

//     }
    
// }


//printf() STATEMENT İN JAVA
// printf() =(PLACEHOLDER) is a method used to format output it is an alternative for print() and println()

// public class Midterm {
//     public static void main(String[] args) {
//         // String name = "SpongeBob";//%s
//         // char firstletter = 'S';//%c
//         // int age = 30;          //%d
//         // double height = 60.5;  //%f
//         // boolean isEmployed = true;//%b

//         // System.out.printf("Hello %s\n",name);
//         // System.out.printf("Your name starts with %c\n",firstletter);
//         // System.out.printf("You are %d years old\n",age);
//         // System.out.printf("You are %.3f inches tall\n",height);
//         // System.out.printf("Employed: %b\n",isEmployed);
//         // System.out.printf("My name is %s and I'm %d years old and my height is %f cm and my name's first letter is %c and the news about which I'm works in the Krusty Krab is %b",name,age,height,firstletter,isEmployed);

//         // + = output a plus
//         // , = comma grouping seperator
//         // ( = negative numbers are enclosed in ()
//         // space = display a minus if negative, space if positive

//         // double price1 = 9.99;
//         // double price2 = 100.15;
//         // double price3 = -54.01;

//         // System.out.printf("%.4f\n",price1); //it says there will be 4 char after decimal 
//         // System.out.printf("% .2f\n",price1);
//         // System.out.printf("% .2f\n",price2);
//         // System.out.printf("% .2f\n",price3);

//         //[width]
//         // 0 = zero padding
//         // number = right justified padding
//         // negative number = left justified padding

//         double id1 = 1.0;
//         int id2 = 23;
//         int id3 = 456;
//         int id4 = 7890;

//         System.out.printf("%4f\n",id1);
//         System.out.printf("%4d\n",id2);
//         System.out.printf("%4d\n",id3);
//         System.out.printf("%4d\n",id4);

//     }



    
// }


// NESTED IF STATEMENTS
// public class Midterm{
//     public static void main(String[] args) {
        
//         boolean isStudent = true;
//         boolean isSenior = true;
//         double price = 10.0;
//         if(isStudent){
//             if(isSenior){
//             System.out.println("you get a senior discount of 20%");
//             System.out.println("You get a student discount of 10% ");
//             price *= 0.7;
//             System.out.println(price);

//             }
//             else{
//                 System.out.println("you get a student discount of 10%");
//                 price *= 0.9;
//                 System.out.println(price);
//             }
//         }
//         else{
//             if(isSenior){
//                 System.out.println("you get a senior discount of 20%");
//             price *= 0.8;
//             System.out.println(price);
//             }
//             else{
//                 price *= 1;
//             }
//         }

//         System.out.printf("The price of a ticket is: %.2f",price);
//     }
// }


// STRING METHODS
// public class Midterm {
//     public static void main(String[] args) {
//         String name = "Elif Arpa";
//         int length = name.length(); //writes length of the string
//         System.out.println(length);
//         char letter = name.charAt(0);//writes which char at the this index
//         System.out.println(letter);
//         int index = name.indexOf("a");
//         System.out.println(index);
//         int LastIndex = name.lastIndexOf("A");
//         System.out.println(LastIndex);

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();//deletes the spaces 
        //name = name.replace("a","e");
        //boolean control = name.isEmpty();//if its empty = true or = false
        //System.out.println( name);

        // if(name.contains(" ")){
        //     System.out.println("your name contains a space");
        // }
        // else{
        //     System.out.println("your name doesn't contain any spaces");
        // }

//         if(name.equals("Password")){ // or use name.equalsIgnoreCase
//             System.out.println("your name can't be password");
//         }
//         else{
//             System.out.println("Hello " + name);
//         }
//     }
    
// }


// SUBSTRING METHOD
//.substring() = A method used to extract a portion of a string 
          //.substring(start, end)
// import java.util.Scanner;
// public class Midterm {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Please enter your email: ");
//         String email = scanner.nextLine();
//         System.out.print("please enter the first num of range: ");
//         int num1 = scanner.nextInt();
//         System.out.print("please enter the second num of the range: ");
//         int num2 = scanner.nextInt();
//         String mail = email;
//         String username = mail.substring(num1,num2);
//         // String domain = email.substring(email.indexOf("a")+1);
//         System.out.println(username);
//         scanner.close();

//     }
    
// }


// TERNARY OPERATOR 
// ternary operator ? = Return 1 of 2 values if a condition is true
// variable = (condition) ? ifTrue : ifFalse;

// public class Midterm {
//     public static void main(String[] args){
//         int score = 45;
//         String trueOrfalse = (score>=50) ? "true" : "false";
//         System.out.println(trueOrfalse);
//     }
    
// }


//ENHANCED SWİTCHES 
// Enhanced swştch = A replacemnet to many else if statements 
// import java.util.Scanner;
// public class Midterm {
//      public static void main(String[] args) {
//          Scanner getDays = new Scanner(System.in);
//          System.out.print("Please enter a day: ");
//          String day = getDays.nextLine();
//         // String day = "Monday";
//         switch(day){
//             case "Monday":
//                 System.out.println("it is a weekday");
//                 break;
//             case "Tuesday":
//                 System.out.println("it is a weekday");
//                 break;
//             case "Wednesday":
//                 System.out.println("it is a weekday");
//                 break;
//             case "Thursday":
//                 System.out.println("it is a weekday");
//                 break;
//             case "Friday":
//                 System.out.println("it is a weekday");
//                 break;
//             case "Saturday":
//                 System.out.println("it is weekend");
//                 break;
//             case "Sunday":
//                 System.out.println("it is weekend");
//                 break;
//             default :
//                 System.out.println(day+" is not a day");

//         // getDays.close();




            

//         }
// }

// }  


// LOGICAL OPERATIONS= they allow us to check or modify more than one condition
//&& = AND(in if all conditions must be true)   || = OR      ! =NOT
// public class Midterm {
//     public static void main(String[] args) {
//         double temp = -10;
//         boolean isSunny = true;

//         if(temp<=30 && temp>=0 && isSunny){
//             System.out.println("The weather is good");
//             System.out.println("It is sunny outside");
//         }
//         else if(temp<=30 && temp>=0 && !isSunny){
//             System.out.println("The weather is good ");
//             System.out.println("It is cloudy outside");
//         }
//         else if(temp>30 || temp<0 ){
//             System.out.println("The weather is bad");
//         }
//     }
    
// }


// WHİLE LOOPS 
// while loop = repeat some code forever while some conditions remains true
// import java.util.Scanner;
// public class Midterm {
//     public static void main(String[] args) {
        // Scanner getName = new Scanner(System.in);
        //  String name = "";

        //  while(name.isEmpty()){
        //     System.out.print("Please enter your name: ");
        //     name = getName.nextLine();
        //  }
        //  System.out.println("Hello "+ name);
        //  getName.close();

        //  in do-while loop its always write do part first then goes to the while loop part
//         Scanner getage = new Scanner(System.in);
//         int age = 0;
//         do{
//             System.out.println("Your age cant be negative");
//             System.out.print("Please enter your age: ");
//             age = getage.nextInt();
//         }while(age<0);
//         System.out.print("you are "+ age + " years old");
//     }   
       
    
    
// }


// FOR LOOPS = execute some code a certain amount of time for(başlatma;koşul;artış)
// import java.util.Scanner;
// public class Midterm {
//     public static void main(String[] args){
//         Scanner getnums = new Scanner(System.in);
//         System.out.println("Enter how many times you want to loop: ");
//         int num = getnums.nextInt();
//         for(int i = 1; i<=num; i++){
//             System.out.println(i);
//         }
//         getnums.close();



//     }
    
// }


// BREAK-CONTINUE
// break = break out of a loop (STOP)
// continue = skip current iteration of a loop (skip)
// public  class Midterm {
//     public static void main(String[] args) {
//         // for(int i =0; i<=10;i++){
//         //     if(i==7){
//         //         break;
//         //     }
//         //     System.out.print(i + " ");
//         // }
//         for(int i =0;i<10;i++){
//             if(i==6){
//                 continue;
//             }   
//             System.out.println(i + " ");
            
//         }   
//     }   

    
// }

//  NESTED LOOPS
// nested loop = a loop inside another loop
// public class Midterm {
//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
//             for(int j=1;j<=9;j++){
//                 System.out.print(j + " ");

//             }
            

//         }
//     }
    
// }


// METHODS
// method = a block of reusable code that is executed when called(outside the main method)
// public class Midterm {
//     public static void main(String[] args) {
//         happyNewYear();
//         happyNewYear();
//         happyNewYear();
//         String name = "SpongeBob";
//         int age = 21;
//         happyBirthday(name,age);
//         happyBirthday(name, age);

        
//     }
//     static void happyNewYear(){
//         System.out.println("happy new yearr!!!");
//         System.out.println("congrats you pass the last year!!!");
//     }
//     static void happyBirthday(String name,int age){
//         System.out.printf("Happy birthday dear %s\n ",name);
//         System.out.printf("you are %d years old anymore\n",age);
//     }
// }

// OVERLOADED METHODS
// overloaded methods = methods that share the same name,
//                      but different parameters
//                      signature = name + parameters
// public class Midterm {
//     public static void main(String[] args){
//         String pizza = bakePizza("flat bread","mozzarella","pepperoni");
//         System.out.println(pizza);

//     }
//     static  String bakePizza(String bread){
//         return bread + " pizza";
//     }
//     static String bakePizza(String bread,String cheese){
//         return cheese + " " + bread + " pizza";
//     }
//     static String bakePizza(String bread,String cheese,String topping){
//         return topping + " " + cheese +" " + bread + "pizza";
//     }
// }



// VARİABLE SCOPE
// variable scope = where a variable can be accessed (java likes to use local variable first )
// public class Midterm {
//     static int x = 3; //CLASS
//     public static void main(String[] args) {
//         int x = 2;  // LOCAL
//         System.out.println(x);
//         doSomething();
//     }
//     static void doSomething(){
//         int x = 1;
//         System.out.println(x);  //LOCAL
//     }
    
// }


// ARRAYS
// array = a collection of values of the same data type
// **think of it as a variable that can store more than 1 value**

// import java.util.Arrays;

// public class Midterm {
//     public static void main(String[] args) {
//         String[] fruits = {"apple", "orange", "banana", "coconut"};

        //System.out.println(fruits[2]);  //it shows which item in the index of that

        //fruits[0] = "pineapple"; //we put the pineapple at index of 0

        //int numOfFruits = fruits.length;//show how many elements has array

        //for(int i =0;i<fruits.length;i++)//it writes all list

        //Arrays.sort(fruits); //it writes array alphabetically
//         Arrays.fill(fruits,"pineapple");//it fills all array with this element
//         for(String fruit : fruits){
//             System.out.println(fruit);
//         }
            





//     }


    
// }


//ENTER USER INPUT INTO AN ARRAY
// import java.util.Scanner;
// public class Midterm{
//     public static void main(String[] args) {
//         Scanner getFoods = new Scanner(System.in);
//         String[] foods ;
//         // System.out.print("What number of food do you want?: ");
//         // int size = getFoods.nextInt();
//         // getFoods.nextLine();


//         //foods = new String[size];

//         for (int i = 0;i <foods.length;i++){
//             System.out.print("Enter a food: ");
//             foods[i] = getFoods.nextLine();
//         }

//         for (String food : foods){
//             System.out.println(food);
//         }
//         getFoods.close();
//     }
// }

// SEARCH AN ARRAY
// public class Midterm {

//     public static void main(String[] args) {
//         int[] numbers = {1,4,5,9,7,3};
//         int target = 6;
//         boolean isFound = false;
//         for(int i = 0; i<numbers.length;i++){
//             if(target==numbers[i]){
//                 System.out.println("Element found at index: " + i);
//                 isFound = true;
//                 break;
//             }
//         }
//         if(!isFound){
//             System.out.println("Element is not in the array");
//         }
        
//     }
// }

// public  class Midterm {

//     public static void main(String[] args) {
//         // 2D array = an array where each element is an array useful for storing a matrix of data

//           String[] fruits = {"apple","orange","banana"};
//           String[]  vegetables = {"potato","onion","carrot"};
//           String[] meats = {"chicken","pork","beef","fish"};

//           String [][] groceries = {{"apple","orange","banana"},vegetables,meats};

//           for(String[]foods:groceries){
//             for(String food: foods){
//                 System.out.println(food + " ");
//             }
//             System.out.println();
//           }



//     }

// }

// OBJECT ORİENTED PROGRAMMİNG
// public class Midterm {

//         public static void main(String[] args) {
//                 // object = an entity that holds data(attributes)
//                 // and can perform actions (methods)
//                 // it is a reference data type
                
//                 car car = new car();

//                 System.out.println(car.isRunning);
//                 car.start();
//                 System.out.println(car.isRunning);
//                 car.stop();
//                 System.out.println(car.isRunning);
//         }
// }


// public class Midterm {
//         public static void main(String[] args) {
//                 // constructor = A special method to initialize objects
//                 // you can pass arguments to a constructor
//                 // and set initial values

//         // overloaded constructors = Allow a class to have multiple constructors
//         // with different parameter lists
//         // enable objects to be initialized in various ways.

//                 car car1 = new car();


//         }
// }

// import java.util.ArrayList;

// public class Midterm {
//         public static void main(String[] args) {

                

                // ArrayList <Integer> Primes = new ArrayList<>();
                // int num  ;
                // for(num=1;num<=50;num++){
                //         for(int i=1;i<=50;i++){
                //                 if(num%i ==0  && num!= i && num!=1){
                //                         Primes.add(num);
                                        
                //                 }
                //                 else{
                //                         System.out.println(num+" is not a prime number");
                //                 }
                                

                //         }
                //  for (int i = 1; i <= 5; i++){
                //         for (int j = 1; j <= 5; j++)
                //                 if ((i == j) || (i + j == 6)){
                //                 System.out.print("X");
                //                 }else{
                //                 System.out.print("_");
                //                 }
                //                 System.out.println("");
                //                 }

                // System.out.println(Primes);
        // }
        // public static int max( int a , int b){
        //         a = 3;
        //         b = 4;
        //        if(a<b){
        //         return b;
        //        }
        //        else{
        //         return a;
                
        //        }
                

        // }
      
        
//}



// public class Midterm {
//         public static void main(String[] args) {
//                 int i = +1;
//                 int j = +1;
//                 // while(i != 8 && j != 8){
//                         if ( i < 5 && (j == 5- i || j == 3 + i)){
// System.out.print("O");
// break;
// }else if (i >=5 && (j == i- 3 || j == 11- i)){
// System.out.println("O");
// break;
// }else {
// System.out.println("X");

// }
// System.out.println();

// }
                        
                

//                         for (int i = 1; i <= 7; i++){
// for (int j = 1; j <= 7; j++)
// if ( i < 5 && (j == 5- i || j == 3 + i)){
// System.out.print("O");
// }else if (i >=5 && (j == i- 3 || j == 11- i)){
// System.out.print("O");
// }else {
// System.out.print("X");
// }
// System.out.println();
// }
                
        // }
// }








        


