package ra.baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương");
        int n=input.nextInt();
        if (n<0){
            System.out.println("số bạn nhập chưa đúng, vui lòng nhập lại");
            n= input.nextInt();
        }
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            if (i%2==0){
               sum+=i;
            }
        }
        System.out.println("Tổng các số chẵn từ 0-"+n+" là: "+sum);
    }
}
