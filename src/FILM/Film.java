package FILM;

import java.util.Scanner;

public class Film {

    static void menuGiris() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Film Tahmin Oyunumuza Hoşgeldiniz:" +
                "\nLütfen  giriş yapınız." +
                "\nAdmin girişi için - 1" +
                "\nKullanıcı girişi için - 2" +
                "\nKayıt olamak için - 3" +
                "\nÇıkış için - 4" +
                "\nSeçiniz : ");
        int sec = scanner.nextInt();// seçim alındı
        if (sec == 1) {
            Admin.adminKontrol();
        }
        else if(sec== 2){
            User.userKontrol();
        }else if(sec==3){
            User.userKayıt();
        }else if(sec==4){
            System.out.println("Çıkış işlemi gerçekleştiriliyor...");
        }else {
            System.out.println("Hatalı Giriş Yaptınız.Lütfen Tekrar deneyin");
            menuGiris();
        }

    }
}
