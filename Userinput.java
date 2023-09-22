import java.util.Scanner;

class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Hello please tell me your name?");
            String name = sc.nextLine();
            System.out.println("Hello " + name + ", it is nice to meet you.");
            
            System.out.println("Which state do you live in?");
            String state = sc.next();
            System.out.println("I am sure " + state + ", its lovely place");
            
            System.out.println("How old are you?");
            int age = sc.nextInt();
            System.out.println("you been in this world for " + age + " years so far");

            System.out.println("which one you prefer if your loved one to tell you True staff or false?");
            boolean moments = sc.hasNextBoolean();
            System.out.println(" you like to heard " + moments + " staff haa");

            System.out.println("Operators examples");

            System.out.println("Now, Enter which state has highest capital?"); 
            float highcap = sc.nextFloat();
            System.out.println("What is you state capital? you can put in decimal.");
            float statecap = sc.nextFloat();
            float capital = (highcap - statecap);
            System.out.println("Wonderful the highest state has" + highcap + "capital. your state has" + statecap + "your state need get" + capital + " to be on top");

            System.out.println("to add two numbers type your first number");
            int add1 = sc.nextInt();
            System.out.println("type second number");
            int add2 = sc.nextInt();
            System.out.println("The sum of your two numbers are" + add1 + add2);

            System.out.println("Want to know the remender between two number? type your first number");
            int rem1 = sc.nextInt();
            System.out.println("type second number");
            int rem2 = sc.nextInt();
            int rem3 = rem1 % rem2;
            System.out.println("The remender of your two numbers are" + rem3);

            System.out.println("Logical operators");

            // got me little challenge this one only return false

            System.out.println("check the two words are equals, enter your first word");
            String word1 = sc.nextLine();
            System.out.println("enter your second word");
            String word2 = sc.nextLine();
            String word3 = Boolean.toString(word1 == word2);
            System.out.println("The results of your two words are " + word3);

            sc.close();
    }
}



