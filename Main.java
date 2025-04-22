import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int total = 0;
        String opt;
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter operator (+, -, *, /): ");
        opt = input.next();
        
    switch (opt.charAt(0)) {
        case '+':
            total = num1 + num2;
            System.out.println("The sum is: " + total);
            break;
        
        case '-':
            total = num1 - num2;
            System.out.println("The difference is: " + total);
            break;
            
        case '*':
            total = num1 * num2;
            System.out.println("The product is: " + total);
            break;
        
        case '/':
            if (num2 == 0) {
                System.out.println("Cannot divide to zero");
            } else {
                total = num1 / num2;
                System.out.println("The division is: " + total);
            }
            break;
            
        default:
            System.out.println("You must enter a valid operator (+, -, *, /)");     
    }
        
      input.close();       
    }
}
