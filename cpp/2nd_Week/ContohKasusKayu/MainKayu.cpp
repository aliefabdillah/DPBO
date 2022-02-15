// #include "Pengusaha.cpp"
#include "Pengerajin.cpp"
// #include "HasilKerajinan.cpp"
#include "Kerajinan.cpp"
#include "Komoditas.cpp"
#include "Kayu.cpp"
using namespace std;

int main()
{
    Pengerajin dataPengusaha;
    Kerajinan dataHasil;
    Komoditas dataKomoditas;
    Kayu dataKayu;

    //set class pengusaha
    dataPengusaha.setNamaPengusaha("Jajang");
    dataPengusaha.setAlamat("Bandung");
    dataPengusaha.setNamaUsaha("Kayu Raya");
    dataPengusaha.setNomorUsaha(1);

    cout << dataPengusaha.getNama() << endl;
    cout << dataPengusaha.getAlamat() << endl;
    cout << dataPengusaha.getNamaUsaha() << endl;
    cout << dataPengusaha.getNomorUsaha() << endl;

    cout << "=================================" << endl;
    

    //set class pengerajin
    dataPengusaha.setNamaPengusaha("Dika");
    dataPengusaha.setAlamat("Semarang");
    dataPengusaha.setNamaUsaha("Jati Diri");
    dataPengusaha.setNomorUsaha(2);
    dataPengusaha.setNoKTP("3220200");
    dataPengusaha.setOmsetPerBulan(22000000);
    dataPengusaha.setDeskripsi("Usaha Kerajinan Mebeul");

    //set class hasil kerajinan
    dataHasil.setKodeKerajinan(101);
    dataHasil.setBahan("Kayu Jati");
    dataHasil.setNamaKerajinan("Kursi Ruang Tamu");

    //set class kerajinan;
    dataHasil.setHarga(8000000);
    dataHasil.setFungsi("Tempat Duduk di Ruang Tamu");
    
    // set class komoditas
    dataKomoditas.setKodeKomoditas("K001");
    dataKomoditas.setJenisKomoditas("Export");
    dataKomoditas.setNegaraTujuan("Belanda");

    // set class Kayu
    dataKayu.setKodeKayu("KAYU001");
    dataKayu.setJenisPohon("Pohon Jati");
    dataKayu.setBerat(20);
    dataKayu.setVolume(200);

    // print ke 2

    cout << "-------------------------------" << endl;
    cout << dataPengusaha.getNama() << endl;
    cout << dataPengusaha.getAlamat() << endl;
    cout << dataPengusaha.getNamaUsaha() << endl;
    cout << dataPengusaha.getNomorUsaha() << endl;
    cout << dataPengusaha.getNoKTP() << endl;
    cout << dataPengusaha.getOmsetPerBulan() << endl;
    cout << dataPengusaha.getDeskripsi() << endl;

    cout << "-------------------------------" << endl;
    cout << dataHasil.getKodeKerajinan() << endl;
    cout << dataHasil.getBahan() << endl;
    cout << dataHasil.getNamaKerajinan() << endl;
    cout << dataHasil.getHarga() << endl;
    cout << dataHasil.getFungsi() << endl;

    cout << "-------------------------------" << endl;
    cout << dataKomoditas.getKodeKomoditas() << endl;
    cout << dataKomoditas.getJenisKomoditas() << endl;
    cout << dataKomoditas.getNegaraTujuan() << endl;

    cout << "-------------------------------" << endl;
    cout << dataKayu.getKodeKayu() << endl;
    cout << dataKayu.getJenisPohon() << endl;
    cout << dataKayu.getBerat() << endl;
    cout << dataKayu.getVolume() << endl;
    
    return 0;
}

