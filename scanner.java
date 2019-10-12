package tugas;

import java.util.Scanner;


public class beratbadan {

    
    public static void main(String[] args) {
        
       Scanner qq = new Scanner(System.in);
        String nama;
        System.out.print("Masukkan nama :");
        nama = qq.nextLine();
        float bb,tb,hasil;
        System.out.print("Masukkan Berat badan :");
        bb = qq.nextFloat();
        System.out.print("Masukkan Tinggi badan :");
        tb = qq.nextFloat();
        hasil = (bb/((tb/100)*(tb/100)));
        System.out.println(hasil);
         if  (hasil<=18.5)
        System.out.println(nama+" kamu kurus, ayo naikkan berat badan mu");
    else if(hasil>=18.6 && hasil<25.0)
        System.out.println(nama+" kamu normal, tetap jaga pola hidup sehat");
    else if(hasil>=25.1 && hasil<29)
        System.out.println(nama+" kamu gemuk, ayo olah raga dan jalani pola hidup sehat");
        
       
    }
    
}
