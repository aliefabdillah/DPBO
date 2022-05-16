package com.sem4dpbo.kuis.ArithmeticParser.Classes;

import com.sem4dpbo.kuis.ArithmeticParser.Interfaces.MyDataStream;

public class MyDataOutputStream implements MyDataStream {
    private String stream;

    MyDataOutputStream(){}

    public MyDataOutputStream(String stream){
        this.stream = stream;
    }

    //method get and set
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    //method get data stream implement from interface myDatastream
    @Override
    public String getDataStream() {
        return stream;
    }
}
