package tugas;

import java.util.Scanner;


public class beratbadan {

    
    public static void main(String[] args) {
        
        int bb;
        double tb;
        String nama,status;
	Scanner sc = new Scanner(System.in);
	nama = sc.next();
	tb = sc.nextDouble();
	bb = sc.nextInt();
		//Masukkan
		//	Nama				  : contoh Fauzan Ray
		//	Tinggi badan (Dalam ukuran meter) : contoh 1.70
		//	Berat badan			  : contoh 46
		double hasil = (bb/(tb*tb));
			
		if (hasil<=18.5){
			System.out.println(nama+"kamu kurus, ayo naikkan berat badanmu :) ");
		}
		else if (hasil==18.6){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=19){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=20){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=21){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=22){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=23){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=24){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil<=24.9){
			System.out.println(nama+",berat badanmu normal, jaga pola hidup sehat agar tetap normal :D ");
		}
		else if (hasil>=25){
			System.out.println(nama+" kamu Gemuk, ayo kurus kan badan mu :D ");
		}
       
    }
    
}
