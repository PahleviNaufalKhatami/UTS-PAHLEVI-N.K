/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SOAL3 {
  public static void main(String[] args) {

    int[] values = {80, 50, 50, 50, 80};
    sayCongrats("Eko", values);

    sayCongrats("Budi", 80, 90, 76, 80);

  }

  static void sayCongrats(String name, int... values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }
    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
    }
  }
}public class {
  public static void main(String[] args) {

    var result1 = sum(100, 100);
    System.out.println(result1);

    System.out.println(sum(200, 200));

    System.out.println(hitung(100, "+", 100));
    System.out.println(hitung(200, "-", 100));
    System.out.println(hitung(200, "salah", 100));
  }

  static int sum(int value1, int value2){
    var total = value1 + value2;
    return total;
  }

  static int hitung(int value1, String operasi, int value2){
    switch (operasi){
      case "+":
        return value1 + value2;
      
        return value1 - value2;

        return 0;
    }
  }
}
