package fa.training.main;

import fa.training.entities.*;

public class main2 {
    public static void main(String[] args){
        Person per = new Person();
        Wallet wal = new Wallet();
        int[] arr = null;
        int total = 0;

        System.out.println("===== Shopping program ======");
        total = per.calcTotal(arr);
        wal.inputMoney();
        System.out.println("This is total of bill:" + total);
        if(wal.payMoney(total)){
            System.out.println("You can buy it");
        }else{
            System.out.println("You can't buy it");
        }
    }
}
