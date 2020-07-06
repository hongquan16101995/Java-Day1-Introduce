package Exercise2;

import java.util.Scanner;

public class ReadNumberIntoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int num = scanner.nextInt();

        if (num>0 && num<10){
            switch (num){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (num < 20){
            if (num == 10){
                System.out.print("ten");
            }else{
                switch (num%10){
                    case 1:
                        System.out.print("eleven");
                        break;
                    case 2:
                        System.out.print("twelfth");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("fourteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("nineteen");
                        break;
                }
            }
        } else if (num <100){
            int num1 = num%10;
            int num2 = (num-num%10)%10;
            if (num == 20){
                System.out.print("twenty");
            }
        }
    }
}
