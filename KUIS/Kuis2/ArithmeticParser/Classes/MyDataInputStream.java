package ArithmeticParser.Classes;

import ArithmeticParser.Interfaces.MyDataStream;

public class MyDataInputStream implements MyDataStream{
    String stream;

    public MyDataInputStream(String stream) {
        this.stream = stream;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String getDataStream() {
        return stream;
    }
}
