package com.company;

public class Main {

    public static void main(String[] args) {
        //If-Else statements
      /*  int a = 4;
        if(a==1) {
            System.out.println("A is 1");
        }
        else if (a==2){
            System.out.println("A is 2");
        }
        else if (a==3){
        System.out.println("A is 3");
    }
        else if (a==4){
            System.out.println("A is 4");
        }
        else {
            System.out.println("A is something else");
        }

        int a = 4;

        switch (a){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                int b =(a + 5);
                System.out.println("B is:" +b);
                break;
            case 2:
                int c= (a * 5);
                System.out.println("C is:" + c);
                break;
            case 3:
                int d= (a + 50);
                System.out.println(d);
                break;
            case 4:
                System.out.println("We have four");
                break;
            default:
                System.out.println("Nothing to see here, move along");
                break;
        }


        //Use of For loop
     String[] names = new String[] {"Randy","Aaliyah","Winter","Joi","Ryan"};
     for (int i=0; i<5;i++){ //better to use i<name.length
         System.out.println("The current index is:" +i);
         System.out.println("The current name is:" + names[i]);
     }

//Use of Enhance Loops
        String[] names = new String[] {"Randy","Aaliyah","Winter","Joi","Ryan"};
        for (String s: names){
            System.out.println("Name is:" + s);
        }


//Nested for loop
        String[] names = new String[] {"Randy","Aaliyah","Winter","Joi","Ryan"};
        for (int i=0; i<5;i++){ //better to use i<name.length
            System.out.println("The current index is:" +i);
            System.out.println("The current name is:" + names[i]);
        }
        for(int j=0;j<10;j++){
            System.out.print(j);
            for(int k=0; k<20;k++){
                System.out.print("*");
                if (k ==19){
                    System.out.println();
                }

            }

        }


        //Use if While Loops-need to know if true or false to run
        boolean flag = true;
        int x = 0;

        do {
            x++;
            System.out.println("Hello" + x);
            if (x == 55555) {
                flag = false;
            }
        }

        while (flag); {
            System.out.println("Stop Here");


        }


        //Ternary operations

        boolean flag = true;
        String z =(flag? "hello":"goodbye");
        System.out.println(z);
   */
        boolean flag = false;

        int z =(flag ? 3 : 5);

        System.out.println("Z is : " + z);

        String m = (flag ? method1() : method2() );

        System.out.println("M is: " + m);

    }
    private static String method2() {
        return "five";
    }

    private static String method1() {
        return "three";
    }

}

