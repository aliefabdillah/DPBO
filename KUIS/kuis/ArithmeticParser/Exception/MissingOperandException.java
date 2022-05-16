package kuis.ArithmeticParser.Exception;

public class MissingOperandException extends Exception{
    public MissingOperandException(){
        super("Operand tidak ditemukan!");
    }
}
