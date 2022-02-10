#include <iostream>
#include <string>

using namespace std;

class DataTim
{
    //private properties
    private:
        //variabel menampung data tim
        string nama, negara, kota, kandang, tahunBerdiri, pemain;
        int nomorPunggung;
    public:
        //constructor kosong dan yang memakai paramter
        DataTim(){};

        DataTim(
            string paramNama, string paramNegara, 
            string paramKota, string paramKandang, 
            string paramTahunBerdiri, string paramPemain,
            int paramNomorPunggung)
        {
            nama = paramNama;
            negara = paramNegara;
            kota = paramKota;
            kandang = paramKandang;
            tahunBerdiri = paramTahunBerdiri;
            pemain = paramPemain;
            nomorPunggung = paramNomorPunggung;
        }

        //method setter
        void setNama(string paramNama) { nama = paramNama;}

        void setNegara(string paramNegara) {negara = paramNegara;}

        void setKota(string paramKota) { kota = paramKota;}

        void setKandang(string paramKandang) {kandang = paramKandang;}

        void setTahunBerdiri(string paramTahunBerdiri) {tahunBerdiri = paramTahunBerdiri;}

        void setPemain(string paramPemain) { pemain = paramPemain; }

        void setNomorPunggung(int paramNomorPunggung) { nomorPunggung = paramNomorPunggung;}


        //method get
        string getNama() { return nama; }

        string getNegara() { return negara; }

        string getKota() { return kota; }

        string getKandang() { return kandang; }

        string getTahunBerdiri() { return tahunBerdiri;}

        string getPemain() { return pemain; }

        int getNomorPunggung() {return nomorPunggung;}

        //destructor
        ~DataTim(){};
};