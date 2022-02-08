#include "Manusia.cpp"
#include "Karyawan.cpp"
using namespace std;

int main()
{
    //deklrasi class
    Manusia kelasManusia;
    Karyawan kelasKaryawan;

    //class Manusia
    kelasManusia.setNama("Gina");
    kelasManusia.setAlamat("Bandung");
    kelasManusia.setNoKtp("320.210.7777");
    kelasManusia.setNoTelepon("08888888881");

    cout << kelasManusia.getNama() << endl;
    cout << kelasManusia.getAlamat() << endl;
    cout << kelasManusia.getNoKtp() << endl;
    cout << kelasManusia.getNoTelepon() << endl;
    
    kelasKaryawan.setNama("Gina");
    kelasKaryawan.setAlamat("Bandung");
    kelasKaryawan.setNoKtp("320.210.7777");
    kelasKaryawan.setNoTelepon("08888888881");
    kelasKaryawan.setNomorPegawai("111");
    kelasKaryawan.setJabatan("Produser");
    kelasKaryawan.setDepartemen("Tv");

    cout << kelasKaryawan.getNama() << endl;
    cout << kelasKaryawan.getAlamat() << endl;
    cout << kelasKaryawan.getNoKtp() << endl;
    cout << kelasKaryawan.getNoTelepon() << endl;
    cout << kelasKaryawan.getNomorPegawai() << endl;
    cout << kelasKaryawan.getJabatan() << endl;
    cout << kelasKaryawan.getDepartemen() << endl;
    return 0;
}
