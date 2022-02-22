#include <bits/stdc++.h>
#include <string>

using namespace std;

// #include "Processor.cpp"
// #include "Disk.cpp"
// #include "Ram.cpp"
#include "Pc.cpp"

int main()
{
    // class processor
    Processor dataProc("Intel", 3200000);
    
    //class disk
    Disk dataDisk("SSD", "256 GB", 800000);

    // class ram
    Ram dataRam("16 GB", 1200000);

    // class pc
    Pc dataPc(dataProc, dataDisk, dataRam);

    // menampilkan hasil akhir
    dataPc.countTotal();
    dataPc.printPc();

    return 0;
}
