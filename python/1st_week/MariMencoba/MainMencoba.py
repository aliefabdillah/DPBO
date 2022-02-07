from Balok import Balok
from Tabel import Tabel

n = input("masukan banyak nya balok : ")
arrBalok = Balok()

for i in range(n):
    print("masukan panjang lebar dan tinggi balok ke", i+1)
    p = input("panjang : ")
    l = input("lebar : ")
    t = input("tinggi : ")
    arrBalok[i] = Balok(p, l, t)


# menampilkan array
tab = Tabel(n, 5)

arrStr = []
for i in range(n):
    arrStr[0] = arrBalok[i].getPanjang()
    arrStr[1] = arrBalok[i].getLebar()
    arrStr[2] = arrBalok[i].getTinggi()
    arrStr[3] = arrBalok[i].volume()
    arrStr[4] = arrBalok[i].luasPermukaan()
    tab.buatBaris(arrStr, 5)
    


    