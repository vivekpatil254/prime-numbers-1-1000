package com.bridgelabz;

public class PrimeMain {

    public static void main(String[] args) {
      //  int array[] = new int[100];
     //   int prime[] = new int[60];
        int i, flag;
      /*  for (i = 0; i < 1000; i++) {
            array[i] = i + 1;
        }
        /*for (i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }*/

        int p = 0;
            for(i=1;i<=1000;i++)  {  //for (i = 1; i < array.length; i++) {
            int n = i;      //array[i];
            flag = 0;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime : "+n);
       //         prime[p] = n;
         //       p++;
            }
        }
      /*  System.out.println("prime number from 1 to 100 are : ");
        for (i = 0; i <= p; i++) {
            System.out.println(prime[i]);
        }*/
    }
}
