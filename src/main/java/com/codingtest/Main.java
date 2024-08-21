package com.codingtest;
import java.util.*;

public class Main {

    public static void main(String[] args){
        //Hello World!를 출력하시오.
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.println("두 정수 A와 B를 입력받은 다음, A + B 를 출력하는 프로그램을 작성하시오.");
        System.out.print("연산 하실 숫자 A를 입력해 주세요 : ");
        A = sc.nextInt();
        System.out.print("연산 하실 숫자 B를 입력해 주세요 : ");
        B = sc.nextInt();

        System.out.println(" A + B = "+(A+B));

        System.out.println("두 정수 A와 B를 입력받은 다음, A - B 를 출력하는 프로그램을 작성하시오.");
        System.out.print("연산 하실 숫자 A를 입력해 주세요 : ");
        A = sc.nextInt();
        System.out.print("연산 하실 숫자 B를 입력해 주세요 : ");
        B = sc.nextInt();

        System.out.println(" A - B = "+ (A-B));

        System.out.println("두 정수 A와 B를 입력받은 다음, A x B 를 출력하는 프로그램을 작성하시오.");
        int C;
        System.out.print("연산 하실 숫자 A를 입력해 주세요 : ");
        A = sc.nextInt();
        System.out.print("연산 하실 숫자 B를 입력해 주세요 : ");
        B = sc.nextInt();
        C=A*B;
        System.out.println(" A * B = "+C);

        System.out.println("두 정수 a와 b를 입력받은 다음, a x b 를 출력하는 프로그램을 작성하시오.");
        Double a,b;
        System.out.print("연산 하실 숫자 a를 입력해 주세요 : ");
        a=sc.nextDouble();
        System.out.print("연산 하실 숫자 b를 입력해 주세요 : ");
        b=sc.nextDouble();
        System.out.println(" a / b = "+(a/b));

        System.out.println("두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.");

        System.out.print("연산 하실 숫자 A를 입력해 주세요 : ");
        A=sc.nextInt();

        System.out.print("연산 하실 숫자 A를 입력해 주세요 : ");
        B=sc.nextInt();

        System.out.println(" A + B = "+ (A+B));
        System.out.println(" A - B = "+ (A-B));
        System.out.println(" A * B = "+ (A*B));
        System.out.println(" A / B = "+ (A/B));
        System.out.println(" A % B = "+ (A%B));

        System.out.println("준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다."
                +" 준하는 놀람을 ??!로 표현한다"
                +" 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.");
        System.out.print("");
        System.out.print("아이디를 입력해 주세요 : ");
        String ID = sc.nextLine();

        System.out.println( ID + "??!");

        System.out.println("불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.");
        System.out.println("반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.");
        System.out.println("서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)");
        int x,y;
        System.out.print("알고 싶은 불교 불멸기원을 입력해 주세요 (1000~3000): ");
        y=sc.nextInt();
        x = y-543;
        if(y >= 1000 && y <= 3000){
            System.out.print("입력하신 불멸기원 "+ y +" 는 현재 서기" + x +"입니다.");
        }else{
            System.out.print("범위가 틀렸습니다."+ y +"(1000년~3000년 사이를 입력해 주세요)");
        }



    }


}