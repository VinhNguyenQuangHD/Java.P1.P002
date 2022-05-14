package fa.training.entities;

import java.util.Scanner;

public class Wallet {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void inputMoney(){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of wallet:");
        i = sc.nextInt();
        setMoney(i);
    }

    public boolean payMoney(int total){
        if(total > getMoney()){
            return false;
        }else{
            return true;
        }
    }
}
