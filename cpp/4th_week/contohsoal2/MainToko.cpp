#include "PenjualBahanBangunan.cpp"
#include <string.h>

int main(int argc, char const *argv[])
{
    string cari;
    PenjualBahanBangunan penjual[3];
    
    penjual[0] = PenjualBahanBangunan("001", "Ida Jubaedah", 2);
    penjual[0].setToko(TokoBangunan("t001", "Sejahtera Abadi", "Parompong Ngamprah"), 0);
    penjual[0].setToko(TokoBangunan("t002", "Bahagia Abadi", "Lembang"), 1);

    penjual[1] = PenjualBahanBangunan("002", "Maman Suhedi", 3);
    penjual[1].setToko(TokoBangunan("t003", "Makmur Abadi", "Cimahi Utara"), 0);
    penjual[1].setToko(TokoBangunan("t004", "Jaya Sejahtera", "Cimahi Utara"), 1);
    penjual[1].setToko(TokoBangunan("t005", "Jaya Indah", "Cimahi Utara"), 2);

    penjual[2] = PenjualBahanBangunan("003", "Tina Surahman", 1);
    penjual[2].setToko(TokoBangunan("t006", "Laris Jaya", "Cimahi Utara"), 0);

    /* menampilkan data */
    for (int i = 0; i < sizeof(penjual)/sizeof(penjual[0]); i++)
    {
        penjual[i].cetakPenjual();
    }

    // meminta masukan nama toko yang ingin di cari
    cout << "Masukan Nama toko yang dicari: ";
    cin >> cari;

    // menampilkan hasil pencarian
    cout << "Hasil Pencarian : " << endl;

    for (int i = 0; i < sizeof(penjual)/sizeof(penjual[0]); i++)
    {
        for (int j = 0; j < sizeof(penjual[i].getToko())/sizeof(penjual[0].getToko()); j++) 
        {
            if (penjual[i].getToko().getNamaToko().find(cari) != 0)
            {
                penjual[i].cetakPenjualToko(j);
            }
        }
    }
    return 0;
}
