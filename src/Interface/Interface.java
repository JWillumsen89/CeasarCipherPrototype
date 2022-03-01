package Interface;

import java.util.Scanner;

public class Interface {

  void userInterfaceStart() {
    Scanner in = new Scanner(System.in);
    System.out.println("1) \tCaesar");
    System.out.println("2) \tVigenére");
    System.out.println("3) \tNumber");
    System.out.println("0) \tExit");
    System.out.print("Type your decision: ");
    int inputNumberStart = in.nextInt();
    switch (inputNumberStart) {
      case 1:
        caesarMenu();
      case 2:
        vigenere();
      case 3:
        number();
      default:
        System.exit(0);
    }
  }

  void caesarMenu() {
    Scanner in = new Scanner(System.in);
    System.out.println("Caesar:");
    System.out.println("1) \tEncrypt");
    System.out.println("2) \tDecrypt");
    System.out.print("Type your decision: ");
    int inputNumberCaesar = in.nextInt();
    switch (inputNumberCaesar) {
      case 1:
        encryptMenu();
      case 2:
        decryptMenu();
      default:
        userInterfaceStart();
    }

  }

  void number() {

  }

  void vigenere() {

  }

  void decryptMenu() {
    Scanner in = new Scanner(System.in);
    System.out.println("1) \tNew Text");
    System.out.println("2) \tDecrypt");
    System.out.println("3) \tMain menu");
    System.out.print("Type your decision: ");
    int inputNumberDecryptMenu = in.nextInt();
  }

  void encryptMenu() {

  }

  void go() {
    userInterfaceStart();

  }


  public static void main(String[] args) {
    new Interface().go();
  }
}

