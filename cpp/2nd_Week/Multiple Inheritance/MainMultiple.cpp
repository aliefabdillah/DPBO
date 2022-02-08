#include "Aset.cpp"
#include "Bangunan.cpp"
#include "Gudang.cpp"
using namespace std;

int main()
{
    Aset oaset;
    Bangunan obangunan;
    Gudang ogudang;

    oaset.setKodeAset(1);
    oaset.setJenisAset(1);
    oaset.setNilaiAset(30000000);

    cout << oaset.getKodeAset() << endl;
    cout << oaset.getjenisAset() << endl;
    cout << oaset.getNilaiAset() << endl;
    
    obangunan.setKodeBangunan(1);
    obangunan.setPemilikiBangunan("BDG AMIN");

    cout << obangunan.getKodeBangunan() << endl;
    cout << obangunan.getPemilikiBangunan() << endl;

    ogudang.setKodeAset(3);
    ogudang.setJenisAset(3);
    ogudang.setNilaiAset(300000);
    ogudang.setKodeBangunan(3);
    ogudang.setPemilikiBangunan("BDG AMIN");
    ogudang.setKodeGudang(1);
    ogudang.setNamaGudang("BDG AMIN 1");
    ogudang.setAlamatGudang("Bandung");

    cout << ogudang.getKodeAset() << endl;
    cout << ogudang.getjenisAset() << endl;
    cout << ogudang.getNilaiAset() << endl;
    cout << ogudang.getKodeBangunan() << endl;
    cout << ogudang.getPemilikiBangunan() << endl;
    cout << ogudang.getKodeGudang() << endl;
    cout << ogudang.getNamaGudang() << endl;
    cout << ogudang.getAlamatGudang() << endl;
    return 0;
}
