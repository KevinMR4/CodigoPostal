package codigopostal;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class CodigoPostal {

    public void cepe() {
        Scanner e = new Scanner(System.in);
        String cp;
        System.out.println("Introduce tu codigo postal");
        cp = e.nextLine();
        switch (cp.charAt(0)) {
            case '0':
                System.out.println(cp + " Esta en la costa este");
                break;
            case '1':
                System.out.println(cp + " Esta en la costa este");
                break;
            case '2':
                System.out.println(cp + " Esta en la costa este");
                break;
            case '3':
                System.out.println(cp + " Esta en la costa este");
                break;
            case '4':
                System.out.println(cp + " Esta en el area central");
                break;
            case '5':
                System.out.println(cp + " Esta en el area central");
                break;
            case '6':
                System.out.println(cp + " Esta en el area central");
                break;
            case '7':
                System.out.println(cp + " Esta en el area sur");
                break;
            case '8':
                System.out.println(cp + " Esta en el area sur");
                break;
            case '9':
                System.out.println(cp + " Esta en el area oeste");
                break;
            default:
                System.out.println(cp + " Este es un codigo postal invalido");
        }
    }

    public static void main(String[] args) {
        CodigoPostal c = new CodigoPostal();
        c.cepe();
    }

}
