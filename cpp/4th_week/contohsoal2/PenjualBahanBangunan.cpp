#include "TokoBangunan.cpp"

class PenjualBahanBangunan
{
private:
    /* data */
    string noKtp, nama;
    int banyakToko;
    static TokoBangunan toko[10];
public:
    PenjualBahanBangunan() {}
    PenjualBahanBangunan(string noKtp, string nama, int banyakToko) {
        this->noKtp = noKtp;
        this->nama = nama;
        this->banyakToko = banyakToko;
        toko[banyakToko];
    }

    //  get and set noKtp
    string getnoKtp() {
        return noKtp;
    }

    void setnoKtp(string noKtp) {
        this->noKtp = noKtp;
    }

//    get and set nama
    string getNama() {
        return nama;
    }

    void setNama(string nama) {
        nama = nama;
    }

//    get and set Banyak Toko
    int getBanyakToko() {
        return banyakToko;
    }

    void setBanyakToko(int banyakToko) {
        this->banyakToko = banyakToko;
    }

//   get and set Toko
    TokoBangunan getToko() {
        return this->toko[banyakToko];
    }

    void setToko(TokoBangunan toko, int nomorToko) {
        this->toko[nomorToko] = toko;
    }

//  method
    void cetakPenjual(){
        cout << "------------------------" << endl;
        cout << "Nama Penjual       : " << this->nama << endl;
        cout << "No. KTP Penjual    : " << this->noKtp << endl;
        cout << "Toko Yang Dimiliki : " << endl;
        for (int i = 0; i < banyakToko; i++)
        {
            cout << i+1 << endl;
            cout << "- Kode Toko    : " << toko[i].getKodeToko() << endl;
            cout << "- Nama Toko    : " << toko[i].getNamaToko() << endl;
            cout << "- Alamat Toko  : " << toko[i].getAlamatToko() << endl;
        }
    }

    //method menampilkan penjual dan toko tertentu
    void cetakPenjualToko(int i){
        cout << "------------------------" << endl;
        cout << "Nama Penjual       : " << this->nama << endl;
        cout << "No. KTP Penjual    : " << this->noKtp << endl;
        cout << "Toko Yang Dimiliki : " << endl;
        
        cout << i+1 << endl;
        cout << "- Kode Toko    : " << toko[i].getKodeToko() << endl;
        cout << "- Nama Toko    : " << toko[i].getNamaToko() << endl;
        cout << "- Alamat Toko  : " << toko[i].getAlamatToko() << endl;
        
    }
    ~PenjualBahanBangunan() {}
};