package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            StringBuilder sb = new StringBuilder();

            //n입력
            int n = sc.nextInt();

            //-1이면 멈춘다.
            if(n == -1) {
                break;
            }

            int sum = 0;

            //입력한 n만큼 반복하며 나머지 0 인것을 담고 출력 시 분기처리
            for(int i = 1; i < n; i++)
                if(n % i == 0) {
                    sb.append(i + " + ");
                    sum += i;
                }

            System.out.println(n == sum ? n + " = " + sb.toString().substring(0, sb.length() - 3) : n + " is NOT perfect.");

        }

    }

}
