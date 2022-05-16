package kuis.ArithmeticParser.Classes;

import kuis.ArithmeticParser.Interfaces.MyDataStream;

public class MyDataInputStream implements MyDataStream {
    private String stream;

    MyDataInputStream(){}

    public MyDataInputStream(String stream){
        this.stream = stream;
    }

    //get set function
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    //method get data stream
    public String getDataStream(){
        return stream;
    }
}
