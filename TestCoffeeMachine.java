package machine;

import java.util.Scanner;

public class TestCoffeeMachine {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine mc = new CoffeeMachine(); //creazione macchina da caffè

        String action="";
        do{
           System.out.println("Write action (buy, fill, take, remaining, exit): ");
           action = scanner.next();
           switch (action) {
               case "buy" :
                   System.out.println("What do you want to buy? 1 - espresso, 2 - latte," +
                           " 3 - cappuccino, back - to main menu:");
                   String scelta = scanner.next();
                   if(scelta.equals("back"))
                       break;
                   mc.buy(scelta);
                   break;
               case "fill" :
                   System.out.println("Write how many ml of water you want to add:");
                   int wAdd = scanner.nextInt();
                   System.out.println("Write how many ml of milk you want to add:");
                   int mAdd = scanner.nextInt();
                   System.out.println("Write how many grams of coffee beans you want to add:");
                   int cAdd = scanner.nextInt();
                   System.out.println("Write how many disposable cups of coffee you want to add:");
                   int cupAdd = scanner.nextInt();
                   mc.fill(wAdd,mAdd,cAdd,cupAdd);
                   break;
               case "remaining" :
                   System.out.println(mc.remaining());
                   break;
               case "exit":
                   break;
               case "take" :
                   mc.take();
                   break;
               default :
                   System.out.println("Wrong input");
           }

        }while(!action.equals("exit"));


    }
}
