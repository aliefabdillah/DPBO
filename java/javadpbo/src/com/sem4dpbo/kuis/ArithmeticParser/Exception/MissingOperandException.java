package com.sem4dpbo.kuis.ArithmeticParser.Exception;

public class MissingOperandException extends Exception{
    public MissingOperandException(){
        super("Operand tidak ditemukan!");
    }
}
