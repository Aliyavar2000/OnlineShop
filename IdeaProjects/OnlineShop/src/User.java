import java.util.*;

 public class User {
     private String anrede, vorname, name;
     private String email, password, passwordRepeat;
     private String adresse, telephone;
     private int UserNumber = 0;


    public  User() {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Anrede ein");
        this.anrede = input.nextLine();

        System.out.println("Geben Sie Ihren Vornamen ein");
        this.vorname = input.nextLine();

        System.out.println("Geben Sie Ihren Namen ein");
        this.name = input.nextLine();


        System.out.println("Geben Sie Ihren Email ein");
        this.email = input.nextLine();

        System.out.println("Geben Sie Ihren Password ein");
        this.password = input.nextLine();

        System.out.println("Geben Sie Ihren Telephone ein");
        this.telephone = input.nextLine();

        System.out.println("Geben Sie Ihren Adresse ein");
        this.adresse = input.nextLine();

        UserNumber++;
    }
    public void ShowInfo(){
        System.out.println("UserNumber: " + UserNumber);
        System.out.println("Anrede: " + this.anrede);
        System.out.println("Vorname: " + this.vorname);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Telephone: " + this.telephone);
        System.out.println("Adresse: " + this.adresse);

    }

}
