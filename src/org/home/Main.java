package org.home;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, world!");
        System.out.println("second commit");//второй коммит проверка//
        System.out.println("dev1 branch");//ветка dev1//
        System.out.println("4th commit in branch dev1");//коммит в dev1//
        System.out.println("Cherry pick commit");//коммит чери пик
        System.out.println("dev1 continues");
        //комит 2 в продолжении ветки dev1
        Print p=new Print("Hello, text");
        p.printin();


    }
}
