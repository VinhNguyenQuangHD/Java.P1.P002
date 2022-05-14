package fa.training.entities;

import java.util.Scanner;

public class Person {
    private int bill;

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int calcTotal (int[] bills){
        int n = 0, sum = 0;
        int bill = 0;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Input number of bill:");
            n = sc.nextInt();
        }while(n <=0);
        bills = new int[n];

        for (int i = 0; i < n; i ++){
            System.out.println("Input value of bill" + (i + 1)+ ":");
            bills[i] = sc.nextInt();
            sum+=bills[i];
        }
        return sum;
    }

}
