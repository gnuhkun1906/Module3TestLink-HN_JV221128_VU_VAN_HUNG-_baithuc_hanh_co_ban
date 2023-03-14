package ra.baitap3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ///In mảng
        int arr[] = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println("arr: " + Arrays.toString(arr));

        ///Tìm Min Max
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }


        }
        System.out.println("Min: " + min);
        System.out.println("max :" + max);

        //Sắp xếp mảng tăng dần
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là : " + Arrays.toString(arr));


        // Đếm Số nguyên tố xuất hiện trong mảng
        int count = 0;
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] < 2) {
                    check = false;
                    break;
                }

                     else if (arr[i] % j == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }


                }
                if (check) {
                    count++;
                }
            }


           System.out.println("Số lần xuất hiện của số nguyên tố là :" + count);
    }
}
