package ArithmeticParser.Exceptions;
public class MissingOperandException
  extends Exception {
    public MissingOperandException() {
        super("Operand tidak ditemukan !");
    }
}