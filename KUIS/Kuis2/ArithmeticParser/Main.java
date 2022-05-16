package ArithmeticParser;

import ArithmeticParser.Classes.MyDataInputStream;
import ArithmeticParser.Exceptions.MissingOperandException;
public class Main {
    public static void main(String[] args) {
        try {
            /** Contoh input tidak valid */
            // MyDataInputStream in = new MyDataInputStream("12+4++1");
            // MyDataInputStream in = new MyDataInputStream("-12+4+1");
            // MyDataInputStream in = new MyDataInputStream("12+4+1*");
            // MyDataInputStream in = new MyDataInputStream("12@+4+1");
            MyDataInputStream in = new MyDataInputStream("12+11-5*2/5");
            System.out.println(MyParser.calculate(in));
        } catch (NumberFormatException e) {
            System.out.println("Format Number Salah");
        } catch (MissingOperandException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
