/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class IfStatement {
     public static void main(String[] args) {
        // TODO code application logic here
    var nilai = 80;
        var absen = 30;
        
        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;
        
        var lulus = lulusNilai && lulusAbsen;
            
        // if nilai >=: && absen <= 75) dirubah menjadi
        if (lulusNilai && lulusAbsen) {
            System.out.println("Selamat Anda Lulus");
        }else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai Anda A");
        }else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        }else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");   
        }else if (nilai >= 50 && absen >= 50 ){
            System.out.println("Nilai Anda D");
        }else {
            System.out.println("Nilai Anda E");
        }
    }
    
}
