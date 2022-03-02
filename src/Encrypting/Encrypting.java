package Encrypting;

import java.util.Scanner;

public class Encrypting {

  public static void main(String[] args) {
    new Encrypting().go();
  }

  void go() {
    charToInt();

  }

  void charToInt() {
    Scanner in = new Scanner(System.in);
    char charLetter = in.next().charAt(0);
    char charSpace = ' ';
    int asciiEncrypt = Character.toUpperCase(charLetter);

    if ((asciiEncrypt >= 65 && asciiEncrypt <= 90) || asciiEncrypt >= 197 && asciiEncrypt <= 216) {
      // a to z ascii = 1 to 26
      if (asciiEncrypt >= 65 && asciiEncrypt <= 90) {
        asciiEncrypt = asciiEncrypt - 64;
        //Æ ascii = 27
      } else if (asciiEncrypt == 198) {
        asciiEncrypt = asciiEncrypt - 171;
        //Ø ascii = 28
      } else if (asciiEncrypt == 216) {
        asciiEncrypt = asciiEncrypt - 188;
        //Å ascii = 29
      } else if (asciiEncrypt == 197) {
        asciiEncrypt = asciiEncrypt - 168;
      }
      //charSpace
    } else {
      asciiEncrypt = 0;
    }
    System.out.println(asciiEncrypt);
  }

}
