class Gudang : public Bangunan, public Aset
{
private:
    int kodeGudang;
    string namaGudang;
    string alamatGudang;
public:
    Gudang() {};

    void setKodeGudang(int kodeGudang){
        this->kodeGudang = kodeGudang;
    }

    void setNamaGudang(string namaGudang){
        this->namaGudang = namaGudang;
    }

    void setAlamatGudang(string alamatGudang){
        this->alamatGudang = alamatGudang;
    }

    int getKodeGudang(){
        return this->kodeGudang;
    }

    string getNamaGudang(){
        return this->namaGudang;
    }

    string getAlamatGudang(){
        return this->alamatGudang;
    }

    ~Gudang() {};

};