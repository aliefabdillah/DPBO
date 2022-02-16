#include "Memory.cpp"

int main()
{
    Memory data;        //instansiasi class memory dengan objcet data

    //memasukan data ke dalam object data
    data.setIdProduct("101");
    data.setPrice(15000000);
    data.setBrand("Lenovo");
    data.setModel("S340");
    data.setFrequency("3200 MHZ");
    data.setMemorySize("8 GB");
    data.setSupportsCuda("false");

    // print data
    cout << "======================" << endl;
    cout << "=    Data Product    =" << endl;
    cout << "======================" << endl;
    cout << "1. Id Product   : " << data.getIdProduct() << endl;
    cout << "2. Price        : " << data.getPrice() << endl;
    cout << "3. Brand        : " << data.getBrand() << endl;
    cout << "4. Model        : " << data.getModel() << endl;
    cout << "5. Freqeuency   : " << data.getFrequency() << endl;
    cout << "6. Memory Size  : " << data.getMemorySize() << endl;
    cout << "7. Supports Cuda: " << data.isSupportsCuda() << endl;
    
    return 0;
}
