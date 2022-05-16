package kuis.ArithmeticParser;

import kuis.ArithmeticParser.Classes.MyDataInputStream;
import kuis.ArithmeticParser.Classes.MyDataOutputStream;
import kuis.ArithmeticParser.Exception.MissingOperandException;
import kuis.ArithmeticParser.Interfaces.MyDataStream;

public class MyParser {
    MyParser(){}

//    method add data ouput stream
    public static boolean isiDataOutputStream(MyDataStream m){
//        if parameter is MyDataouputsteram Type
        if (m instanceof MyDataOutputStream){
            return true;        //return true
        }
        else {
            return false;
        }
    }

//    method convert outputDataStream to inputDataStream Type
    public static MyDataInputStream convertDataOutputStreamToDataInputStream(MyDataOutputStream m){
        MyDataInputStream dataInput = new MyDataInputStream(m.getDataStream());
        return dataInput;
    }

//    method convert inputDataStream to outputDataStream Type
    public static MyDataOutputStream  convertDataInputStreamToDataOutputStream(MyDataInputStream m){
        MyDataOutputStream dataOutput = new MyDataOutputStream(m.getDataStream());
        return dataOutput;
    }

    public static boolean isOperator(char c){
//    check if char parameter is operator aritmethic
        if (c == '+' || c == '-' || c == '*' || c == '/'){
            return true;
        }
        else {
            return false;
        }
    }

//    method check if parameter is digit/number
    public static boolean isDigit(char c){
        return Character.isDigit(c);
    }

//    method for get Digit Output Stream
    public static MyDataOutputStream getDigitOutputStream(MyDataInputStream in){
        String stream = "";
        for(int i=0; i < in.getDataStream().length(); i++){
            // if word in parameter in is digit add to stream
            if(isDigit(in.getDataStream().charAt(i))){
                stream = stream + in.getDataStream().charAt(i);
            }
        }

        return new MyDataOutputStream(stream);
    }

    //    method for get Operator Output Stream
    public static MyDataOutputStream getOperatorOutputStream(MyDataInputStream in){
        String stream = "";
        for(int i=0; i < in.getDataStream().length(); i++){
            // if word in parameter in is operator add to stream
            if(isOperator(in.getDataStream().charAt(i))){
                stream = stream + in.getDataStream().charAt(i);
            }
        }

        return new MyDataOutputStream(stream);
    }

//    method to parse string to integer
    public static int parseStringToInteger(String s) throws NumberFormatException{
        return Integer.parseInt(s);
    }

//    method for validation stream is valid with format
    public static boolean isInputStreamValid(MyDataInputStream in) throws NumberFormatException, MissingOperandException {
        String stream = in.getDataStream();
//        if first // last word in stream is operator
        if(isOperator(stream.charAt(0)) || isOperator(stream.charAt(stream.length()-1))){
            throw new MissingOperandException();
        }

//        for loop stream
        for(int i=0; i<stream.length(); i++){
            // if operator and digit was not valid
            if(isOperator(stream.charAt(i)) == false && isDigit(stream.charAt(i)) == false){
                throw new NumberFormatException();
            }
            //if word is last in stream
            if(i != stream.length()-1){
//                check if word is operator
                if(isOperator(stream.charAt(i)) && isOperator(stream.charAt(i+1))){
                    throw new MissingOperandException();
                }
            }
        }

        return true;
    }

//    method calculate the number/stream
    public static int calculate(MyDataInputStream in) throws MissingOperandException {
        int result = 0;

        //if stream is valid
        if (isInputStreamValid(in)){
            String number1 = "";
            String number2 = "";
            String stream = in.getDataStream();
            char operator =  '!';               //set operator to !

            for (int i = 0; i < stream.length(); i++) {
                if (isOperator(stream.charAt(i))){
                    //jika sudah bertemu operator
                    if (operator != '!'){

                        //hitung number1 dan number 2
                        if (operator == '+'){
                            result = parseStringToInteger(number1) + parseStringToInteger(number2);
                        }
                        else if(operator == '-'){
                            result = parseStringToInteger(number1) - parseStringToInteger(number2);
                        }
                        else if(operator == '*'){
                            result = parseStringToInteger(number1) * parseStringToInteger(number2);
                        }
                        else if(operator == '/'){
                            result = parseStringToInteger(number1) / parseStringToInteger(number2);
                        }

                        //memasukan nilai result ke number 1 dan set number 2 menjadi null
                        number1 = String.valueOf(result);
                        number2 = "";
                    }
                    operator = stream.charAt(i);
                }
                else if (operator == '!'){
                    //jika operator belum ketemu
                    number1 = number1 + stream.charAt(i);
                }else{
                    //jika operator selanjutnya belum ditemukan
                    number2 = number2 + stream.charAt(i);
                }
            }

            //hitung number 1 dan number 2
            if (operator == '+'){
                result = parseStringToInteger(number1) + parseStringToInteger(number2);
            }
            else if(operator == '-'){
                result = parseStringToInteger(number1) - parseStringToInteger(number2);
            }
            else if(operator == '*'){
                result = parseStringToInteger(number1) * parseStringToInteger(number2);
            }
            else if(operator == '/'){
                result = parseStringToInteger(number1) / parseStringToInteger(number2);
            }
        }
        return result;
    }
}
