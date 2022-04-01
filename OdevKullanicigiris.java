package Giris;
import java.util.Scanner;
public class OdevKullanicigiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, yenisifre;
        int secim;

        System.out.print("kullanici adinizi giriniz:");
        username = input.nextLine();

        System.out.print("sifrenizi giriniz:");
        password = input.nextLine();
        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        //   eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı
        // olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, " +
        //   "lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        if (username.equals("busem") && password.equals("1234")) {
            System.out.print("Giris yaptiniz...");
        }
        if (username.equals("busem")) {
            if (!password.equals("1234")) {
                System.out.println("Sifreniz yanlis...");
                System.out.println("Sifrenizi degistirmek ister misiniz...");
                System.out.println("1-Evet\n2-Hayir");
                System.out.print("seciminizi yapiniz : ");
                secim = input.nextInt();
                if (secim == 1) {
                    System.out.println("yenisifrenizi giriniz: ");
                    yenisifre = input.nextLine();
                     if (yenisifre.equals("1234")) {
                         System.out.println("Sifre olusturulamadı.Lütfen baska sifre giriniz...");
                     }else {
                        System.out.println("Sifre olusturuldu...");
                    }
                }else if (secim == 2) {
                        System.out.println("Cikis Yapildi...");
                    } else {
                        System.out.println("Gecerli secim yapiniz...");
                    }
                }


            }

        }

    }


