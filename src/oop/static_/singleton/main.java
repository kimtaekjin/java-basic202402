package oop.static_.singleton;

public class main {
    public static void main(String[] args) {

      singleton s=singleton.getinstance();
      s.method1();
        System.out.println("s = " + s);
    }
}
