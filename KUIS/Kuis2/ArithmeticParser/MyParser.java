package ArithmeticParser;

import ArithmeticParser.Classes.MyDataInputStream;
import ArithmeticParser.Classes.MyDataOutputStream;
import ArithmeticParser.Exceptions.MissingOperandException;
import ArithmeticParser.Interfaces.MyDataStream;

public class MyParser {
    public static boolean isDataOutputStream(MyDataStream m){
        if(m instanceof MyDataOutputStream)
            return true;
        return false;
    }

    public static MyDataInputStream convertDataOutputStreamToDataInputStream(MyDataOutputStream m){
        return new MyDataInputStream(m.getDataStream());
    }

    public static MyDataOutputStream convertDataInputStreamToDataOutputStream(MyDataInputStream m){
        return new MyDataOutputStream(m.getDataStream());
    }

    public static boolean isOperator(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%')
            return true;
        return false;
    }

    public static boolean isDigit(char c){
        return Character.isDigit(c);
    }

    public static MyDataOutputStream getDigitOutputStream(MyDataInputStream in){
        String stream = "";
        for(int i=0; i < in.getDataStream().length(); i++){
            if(isDigit(in.getDataStream().charAt(i))){
                stream += in.getDataStream().charAt(i);
            }
        }

        return new MyDataOutputStream(stream);
    }

    public static MyDataOutputStream getOperatorOutputStream(MyDataInputStream in){
        String stream = "";
        for(int i=0; i < in.getDataStream().length(); i++){
            if(isOperator(in.getDataStream().charAt(i))){
                stream += in.getDataStream().charAt(i);
            }
        }

        return new MyDataOutputStream(stream);
    }

    public static int parseStringToInteger(String s) throws NumberFormatException{
        return Integer.parseInt(s);
    }

    public static boolean isInputStreamValid(MyDataInputStream in) throws Exception{
        String stream = in.getDataStream();
        if(isOperator(stream.charAt(0)) || isOperator(stream.charAt(stream.length()-1)))
            throw new MissingOperandException();
        for(int i=0; i<stream.length(); i++){
            if(!isOperator(stream.charAt(i)) && !isDigit(stream.charAt(i))){
                throw new NumberFormatException();
            }
            if(i != stream.length()-1){
                if(isOperator(stream.charAt(i)) && isOperator(stream.charAt(i+1)))
                    throw new MissingOperandException();
            }
        }
        return true;
    }

    public static int calculate(MyDataInputStream in) throws Exception{
        int result = 0;
        if(isInputStreamValid(in)){
            String num1 = "", num2 = "", s = in.getDataStream();
            char operator = '#';
            
            // traverse stream
            for(int i=0; i<s.length(); i++){
                // jika bertemu operator
                if(isOperator(s.charAt(i))){
                    // opertor sudah pernah ditemukan sebelumnya
                    if(operator != '#'){
                        result = calculate(parseStringToInteger(num1), parseStringToInteger(num2), operator);
                        num1 = String.valueOf(result);
                        num2 = "";
                    }
                    operator = s.charAt(i);
                }else if(operator == '#'){
                    // masih belum ditemukan operator
                    // yang diisi adalah num1
                    num1 += s.charAt(i);
                }else{
                    // sudah pernah ditemukan operator
                    // yang diisi adalah num2
                    num2 += s.charAt(i);
                }
            }
            result = calculate(parseStringToInteger(num1), parseStringToInteger(num2), operator);
        }
        
        return result;
    }

    // method untuk menghitung 2 buah operand
    public static int calculate(int num1, int num2, char operator){
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                result = 0;
                break;
        }
        return result;
    }
}
