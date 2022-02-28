package Decrypting;

import java.util.Scanner;

public class Decrypting {

  public static void main(String[] args) {
    new Decrypting().go();
  }

  void go() {
    intToChar();
  }

  void intToChar() {
    Scanner in = new Scanner(System.in);
    int charNumber = in.nextInt();

    if ((charNumber >= 1 && charNumber <= 26) || charNumber >= 27 && charNumber <= 29) {
      // a to z ascii = 1 to 26
      if (charNumber >= 1 && charNumber <= 26) {
        charNumber = charNumber + 64;
        //Æ ascii = 27
      } else if (charNumber == 27) {
        charNumber = charNumber + 171;
        //Ø ascii = 28
      } else if (charNumber == 28) {
        charNumber = charNumber + 188;
        //Å ascii = 29
      } else if (charNumber == 29) {
        charNumber = charNumber + 168;
      }
      //charSpace
    } else {
      charNumber = 0;
    }
  }
}

