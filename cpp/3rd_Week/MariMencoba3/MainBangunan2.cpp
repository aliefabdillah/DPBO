#include "Arsitek.cpp"
#include "PenjualBahanBangunan.cpp"
#include "Semen.cpp"

int main()
{
        Arsitek dataArsitek;
        PenjualBahanBangunan dataPenjual;
        Semen dataSemen;

        //memasukan data ke dalam object arsitek
        dataArsitek.setKodeArsitek("A1");
        dataArsitek.setNamaArsitek("Rendy");
        dataArsitek.setKantor("Podomoro Group");
        dataArsitek.setTahunBekerja("2021");

        dataPenjual.setKodeToko("TK01");
        dataPenjual.setNamaToko("PD Sumber Makmur");
        dataPenjual.setAlamatToko("Jalan Setiabudi");
        dataPenjual.setNoKtp("3204280012");
        dataPenjual.setNamaPenjual("Hj. Asep");
        dataPenjual.setAlamat("Rancaekek");
        dataPenjual.setTelepon("08122319288");

        
        dataSemen.setKodeBahan("SMN01");
        dataSemen.setKategoriJenisBahan("Semen");
        dataSemen.setNamaSemen("Semen Tiga Roda");
        dataSemen.setKodePabrik("PB001");
        dataSemen.setKualitas("Sangat Baik");
        dataSemen.setHarga("40K/sak");

        //        print data
        cout << "Data" << endl;
        cout << "===============" << endl;
        cout << "Arsitek" << endl;
        cout << "---------------" << endl;
        cout << "Kode: " << dataArsitek.getKodeArsitek() << endl;
        cout << "Nama: "+dataArsitek.getNamaArsitek() << endl;
        cout << "Kantor: "+dataArsitek.getKantor() << endl;
        cout << "Tahun bekerja: "+dataArsitek.getTahunBekerja() << endl;
        cout << "---------------" << endl;
        cout << "Toko Bangunan" << endl;
        cout << "---------------" << endl;
        cout << "Kode Toko: "+dataPenjual.getKodeToko() << endl;
        cout << "Nama Toko: "+dataPenjual.getNamaToko() << endl;
        cout << "Alamat Toko: "+dataPenjual.getAlamatToko() << endl;
        cout << "---------------" << endl;
        cout << "Penjual Bahan Bangunan" << endl;
        cout << "---------------" << endl;
        cout << "Kode Toko: "+dataPenjual.getKodeToko() << endl;
        cout << "Nama Toko: "+dataPenjual.getNamaToko() << endl;
        cout << "Alamat Toko: "+dataPenjual.getAlamatToko() << endl;
        cout << "No KTP: "+dataPenjual.getNoKtp() << endl;
        cout << "Nama Penjual: "+dataPenjual.getNamaPenjual() << endl;
        cout << "No Telepon: "+dataPenjual.getTelepon() << endl;
        cout << "---------------" << endl;
        cout << "Bahan Bangunan" << endl;
        cout << "---------------" << endl;
        cout << "1. Semen" << endl;
        cout << "   - KodeBahan : "+dataSemen.getKodeBahan() << endl;
        cout << "   - Kategori Jenis Bahan : "+dataSemen.getKategoriJenisBahan() << endl;
        cout << "   - Nama : "+dataSemen.getNamaSemen() << endl;
        cout << "   - Kode Pabrik : "+dataSemen.getKodePabrik() << endl;
        cout << "   - Kualitas : "+dataSemen.getKualitas() << endl;
        cout << "   - Harga : "+dataSemen.getHarga() << endl;
        return 0;
}
