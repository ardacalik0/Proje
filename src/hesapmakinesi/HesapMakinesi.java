package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc = 0;
        char operator;

       
        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = input.nextDouble();

        
        System.out.print("İşlem operatörünü giriniz (+, -, *, /): ");
        operator = input.next().charAt(0);

       
       
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();

    
        switch(operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata! Sıfıra bölme yapılamaz.");
                    return; 
                }
                break;
            default:
                System.out.println("Hata! Geçersiz operatör.");
                return; 
        }

      
        System.out.println("\nSonuç: " + sayi1 + " " + operator + " " + sayi2 + " = " + sonuc);
        
        input.close(); 
    }


	}
	

