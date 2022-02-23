package machine;

public class CoffeeMachine{
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    //costruttore
    public CoffeeMachine(){
        this.water =400;
        this.milk =540;
        this.beans =120;
        this.cups =9;
        this.money =550;
    }

    //metodo remaining
    public String remaining(){
        String s = "";
        s += "The coffee machine has:\n";
        s += this.water+" ml of water\n";
        s += this.milk+" ml of milk\n";
        s += this.beans+" g of beans\n";
        s += this.cups+" disposable cups\n";
        s += "$"+this.money+" of money\n";
        return s;
    }

    //metodo buy
    public void buy(String n){
        switch(n) {
            case "1"://espresso
                if(this.water < 250){
                    System.out.println("Sorry, not enough water!");
                    break;
                }else if(this.beans < 16){
                    System.out.println("Sorry, not enought beans of coffee!");
                    break;
                }else if(this.cups < 1){
                    System.out.println("Sorry, not enought cups!");
                    break;
                }else if(this.water >= 250 && this.beans >= 16 && this.cups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 250;
                    this.beans -= 16;
                    this.cups -= 1;
                    this.money += 4;
                    break;
                }
            case "2": //latte
                if(this.water < 350){
                    System.out.println("Sorry, not enough water!");
                    break;
                }else if(this.beans < 20){
                    System.out.println("Sorry, not enought beans of coffee!");
                    break;
                }else if(this.cups < 1){
                    System.out.println("Sorry, not enought cups!");
                    break;
                }else if(this.milk < 75){
                    System.out.println("Sorry, not enought milk!");
                    break;
                }else if(this.water >= 350 && this.beans >= 20 && this.cups >= 1 && this.milk >= 75){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 350;
                    this.beans -= 20;
                    this.cups -= 1;
                    this.money += 7;
                    this.milk -= 75;
                    break;
                }
            case "3": //cappuccino
                if(this.water < 200){
                    System.out.println("Sorry, not enough water!");
                    break;
                }else if(this.beans < 12){
                    System.out.println("Sorry, not enought beans of coffee!");
                    break;
                }else if(this.cups < 1){
                    System.out.println("Sorry, not enought cups!");
                    break;
                }else if(this.milk < 100){
                    System.out.println("Sorry, not enought milk!");
                    break;
                }else if(this.water >= 200 && this.beans >= 12 && this.cups >= 1 && this.milk >= 100){
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 200;
                    this.beans -= 12;
                    this.cups -= 1;
                    this.money += 6;
                    this.milk -= 100;
                    break;
                }
        }
    }

    //metodo fill
    public void fill(int wAdd, int mAdd, int cAdd, int cupAdd){
        this.water += wAdd;
        this.milk += mAdd;
        this.cups += cupAdd;
        this.beans += cAdd;
    }

    //metodo take
    public void take(){
        System.out.println("I gave you $"+this.money);
        this.money = 0;
    }

}