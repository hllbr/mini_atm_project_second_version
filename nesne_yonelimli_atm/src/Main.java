
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("hllbr", "123456", 2000);
        atm.calıs(hesap);
        System.out.println("Programdan çıkılıyor.");
    }
   
    
}
