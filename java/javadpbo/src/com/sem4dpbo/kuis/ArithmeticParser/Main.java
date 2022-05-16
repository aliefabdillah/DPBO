package com.sem4dpbo.kuis.ArithmeticParser;

import com.sem4dpbo.kuis.ArithmeticParser.Classes.MyDataInputStream;
import com.sem4dpbo.kuis.ArithmeticParser.Exception.MissingOperandException;

public class Main {
    public static void main(String[] args) {
        try {
            //input stream
            MyDataInputStream input;
            input = new MyDataInputStream("10-5+10*3/2");
            System.out.println(MyParser.calculate(input));
        } catch (MissingOperandException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
