/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class bank {
     int saldo;
    bank ( int saldo){
    this.saldo = saldo;
    
}
void getSaldo(){
    System.out.println("Selamat Datang di Bank ABC");
    System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
}
int simpanUang (int saldo){
    this.saldo += saldo;
    System.out.println("Simpan uang : Rp. " + saldo);
    System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
    return this.saldo;
}
    int ambilUang(int saldo){
    System.out.println("Ambil uang: Rp. " + saldo);
    if(this.saldo >= saldo ){
        this.saldo -= saldo;
        System.out.println("Saldo saat ini : Rp. " + this.saldo);
    }else {
        System.out.println("Saldo Anda Tidak Mencukupi");
    }
    return this.saldo;
} 
    
}

