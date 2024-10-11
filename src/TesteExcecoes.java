import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteExcecoes {

    public static void main(String[] args) {
        try {
            m();
        } catch (ExcecaoC e) {
            System.out.println("ExcecaoA foi capturada.");
        } catch (ExcecaoB e) {
            System.out.println("ExcecaoB foi capturada.");
        } catch (ExcecaoA e) {
            System.out.println("ExcecaoA foi capturada.");
        }
    }

    public static void m() throws ExcecaoB {
        throw new ExcecaoB();
    }
}
