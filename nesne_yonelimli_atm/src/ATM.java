
import java.util.Scanner;


public class ATM {
    public void calıs(Hesap hesap){
        Login login = new Login();
        Scanner scn = new Scanner(System.in);
        System.out.println("Bankamıza HOŞGELDİNİZ...............");
        System.out.println("************************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("************************************");
        int giris_hakkı = 3;
        
        while (true) {     
            if(login.login(hesap)){
                System.out.println("Sistem Girişi Başarılı");
                break;
            }else{
                System.out.println("Giriş Başarısız.");
                giris_hakkı--;
                System.out.println( giris_hakkı+" Giriş Hakkınız Kaldı");
            }if(giris_hakkı == 0){
                System.out.println("Giriş Hakkınız Bitti");
                return;//buarada metodu o anda sonlandırmak için kullanabilirim.
            }
            
        }
        //atm işlemlerini gerçekleştirdiğimiz alan
        
        System.out.println("*************************************************");
        String islemler = "1.Bakiye Görüntüle\n"
                + "2.Para Yatırma\n"
                + "3.Para Çekme\n"
                + "Çıkış için q";
        System.out.println(islemler);
        System.out.println("*************************************************");
        while (true) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
            String islem = scn.nextLine();
            if(islem.equals("1")){
                System.out.println("Bakiyeniz : " +hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.println("Yatırmak istediniz Tutar : ");
                int tutar =scn.nextInt();
                scn.nextLine();
                hesap.paraYatır(tutar);
            }else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz Tutar");
                int tutar =scn.nextInt();
                scn.nextLine();
                hesap.paraCek(tutar);
                
            }else if(islem.equals("q") || islem.equals("Q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }else{
                System.out.println("Yanlış veya hatalı bir tuşlama yaptınız işlemden çıkılıyor....");
                break;
            }
            
        }


        
        
    }
    
}
