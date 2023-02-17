import java.util.Scanner;

class CalaculateG {
    public static double result;
    public static double multiresult=multi();

    private static double multi() {
        return multiresult;
    }

    public static double sumresult=sum();

    private static double sum() {
        return sumresult;
    }

    public static double squareresult=square();

    private static double square() {
        return squareresult;
    }

    public static void main(String[]args){
        double gravity=-9.81;//Earths gravity in m/s^2
        double fallingTime=30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition;


        //calculate finalPosition

        finalPosition=0.5*gravity*Math.pow(fallingTime,2)+initialVelocity*fallingTime+initialPosition/fallingTime;

        //calculate finalVelocity
        finalVelocity=gravity*fallingTime+initialVelocity;

        //print out results
        outline("The object's position after"+fallingTime+"seconds is"+finalVelocity +"m.");
        outline("The object's velocity after"+fallingTime+"second is"+finalVelocity+"m/s.");

        outline("multi:" ,multiresult);
        outline("sum:" ,sumresult);
        outline("square:" ,squareresult);
    }
    public static double multi(double num1,double num2){
        Scanner multiInput=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=multiInput.nextDouble();
        System.out.println("Enter the second number");
        num2=multiInput.nextDouble();
        //Method for multiplication
        multiresult=num1*num2;
        return num1*num2;
    }
    public static double outline(String message,double result){
        System.out.println(message + "" + result);
        return result;
    }

        public static double square(double num){
            Scanner squareInput=new Scanner(System.in);
            System.out.println("Enter the first number:");
            double num1 = squareInput.nextDouble();
            System.out.println("Enter the second number");
            double num2=squareInput.nextDouble();
            //method for powering to square
        return Math.pow(num,2);
    }
            public static double sum(double num1,double num2){
                Scanner sumInput=new Scanner(System.in);
                System.out.println("Enter the first number:");
                num1=sumInput.nextDouble();
                System.out.println("Enter the second number");
                num2=sumInput.nextDouble();
                //method for summation
            return num1+num2;
        }
        public static void outline(String message){
                //method for printing out a result
            System.out.println(message);
        }
}