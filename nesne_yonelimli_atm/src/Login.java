
import java.util.Scanner;


public class Login {
    
    //herhangi bir özelliğimiz olmayacak sadece bir method olacak 
    //giriş başarılı ise true,başarılı değilse false değer döndüreceğiz. bütün olayımız bu .
    public boolean login(Hesap hesap){
        Scanner scn = new Scanner(System.in);
        String kullanıcı_adı;
        String kullanıcı_parola;
        System.out.println("Lütfen kullanıcı adınızı giriniz : ");
        kullanıcı_adı = scn.nextLine();
        System.out.println("Lütfen parolanızı giriniz : ");
        kullanıcı_parola =scn.nextLine();
        if(hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getParola().equals(kullanıcı_parola)){
            return true;
        }else if(hesap.getKullanıcı_adı().equals(kullanıcı_adı) && !hesap.getParola().equals(kullanıcı_parola)){
            return false;
            
        }else if(!hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getParola().equals(kullanıcı_parola)){
            return false;
        }else{
            return false;
        }
            
    
    
    
    }

        
        
        
    
    
}
