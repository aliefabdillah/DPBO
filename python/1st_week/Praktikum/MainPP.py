import imp
from PersegiPanjang import PersegiPanjang

# memakai setter
rec1 = PersegiPanjang()
rec1.setPanjang(6)
rec1.setLebar(3)

# memakai constructor
rec2 = PersegiPanjang(10,5)

n = int(input())

# jika objek nya banyak, begini cara alokasi class dan instalasi objeknya
arrRec = [PersegiPanjang() for i in range(n)]
i = 0

for i in range(n):
    # cara input banyak angka dalam satu baris
    p, l = map(int, input().split())
    # menampung nilai menggunakan setter
    arrRec[i].setPanjang(p)
    arrRec[i].setLebar(l)

# ambil nilai dengan getter
print("Keliling persegi panjang 1 : " + str(rec1.keliling()))
print("Luas persegi panjang 1 : " + str(rec1.luas()))
print("Keliling persegi panjang 2 : " + str(rec2.keliling()))
print("Luas persegi panjang 2 : " + str(rec2.luas()))

# jika memakai perulangan
i = 0
for i in range(n):
    print(f"keliling array persegi panjang ke {i+1} : {arrRec[i].keliling()}")
    print(f"luas array persegi panjang ke {i+1} : {arrRec[i].luas()}")