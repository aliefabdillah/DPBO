from turtle import pen
from PenjualBahanBangunan import PenjualBahanBangunan
from TokoBangunan import TokoBangunan

penjual = [PenjualBahanBangunan() for i in range(3)]

penjual[0] = PenjualBahanBangunan("001", "Ida Jubaedah", 2)
penjual[0].setToko(TokoBangunan("t001", "Sejahtera Abadi", "Parompong Ngamprah"), 0)
penjual[0].setToko(TokoBangunan("t002", "Bahagia Abadi", "Lembang"), 1)

penjual[1] = PenjualBahanBangunan("002", "Maman Suhedi", 3)
penjual[1].setToko(TokoBangunan("t003", "Makmur Abadi", "Cimahi Utara"), 0)
penjual[1].setToko(TokoBangunan("t004", "Jaya Sejahtera", "Cimahi Utara"), 1)
penjual[1].setToko(TokoBangunan("t005", "Jaya Indah", "Cimahi Utara"), 2)

penjual[2] = PenjualBahanBangunan("003", "Tina Surahman", 1)
penjual[2].setToko(TokoBangunan("t006", "Laris Jaya", "Cimahi Utara"), 0)

# menampilkan data
print("Daftar Penjual Beserta Toko:")
for i in range(len(penjual)):
    penjual[i].cetakPenjual()

# menampilkan data tertentu
print("\n")
cari = str(input("Nama toko yang dicari: "))

print("Hasil Pencarian:")
for i in range(len(penjual)):
    for j in range(len(penjual[i].getToko())):
        if cari in penjual[i].getToko()[j].getNamaToko():
            penjual[i].cetakPenjualToko(j)