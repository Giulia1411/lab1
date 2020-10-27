package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        sc.Print();
        Interval inter = new Interval();
        inter.SC();
        inter.Par();
        inter.NPar();
        inter.SC2();
        inter.fib(inter.k);
        inter.vid();


    }
}
class SomeClass {

    int i;
    char c;

    void Print() {

        System.out.println(i);
        System.out.println(c);

    }
}
class Interval{
    int a,b,c,k,sp=0,sn=0;


    void SC(){
        Scanner it=new Scanner(System.in);
        System.out.println("Введіть початок інтервалу:");
        a=it.nextInt();
        System.out.println("Введіть кінець інтервалу:");
        b=it.nextInt();
        if(a>b){
            System.out.println("Ви ввели неправильно!");
        }
    }
    void Par(){
        int sum1=0;
        c=b;
        for (; c >= a; c--) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
                sum1 += c;
            }
        }
        System.out.println();
        System.out.println("Сума парних чисел з даного інтервалу=" + sum1);

    }

    void NPar(){
        int sum2=0;
        for( ;a<=b;a++) {
            if (a%2!= 0) {
                System.out.print(a + " ");
                sum2 +=a;
            }
        }
        System.out.println();
        System.out.println("Сума непарних чисел з даного інтервалу="+sum2);
    }
    void SC2(){
        Scanner it=new Scanner(System.in);
        System.out.println("Введіть кіькість чисел ряду Фібоначчі:");
        k=it.nextInt();

    }
    void fib(int n ){
        int f1,f2,zm;
        f1=b;
        f2=a-2;
        System.out.println("Ряд Фібоначчі: ");
           /* System.out.print(f1+" ");
            System.out.print(f2+" ");*/
        for(int ch=1;ch<=n;ch++){
            zm=f1;
            f1 = f2;
            f2=f1+zm;
            if(f2%2==0){
                sp++;
            }else{sn++;}
            System.out.print(f2+" ");
        }
    }
    void vid(){
        System.out.println(" ");
        System.out.println(sp);
        System.out.println(sn);
        double v1=(sp*100)/(k);
        System.out.println("Відсоток парних: "+v1+"%");
        double v2=(sn*100)/(k);
        System.out.println("Відсоток непарних: "+v2+"%");
    }
}


