import java.util.Date;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args)throws Exception {

        Client Tanya = new Client("Tanya", -56);
        if (Tanya.age<0){
            throw new Exception();
        }
    }
}
