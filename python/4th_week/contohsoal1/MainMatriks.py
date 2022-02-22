from Matriks import Matriks

baris = int(input("Masukan Baris: "))
kolom = int(input("Masukan Kolom: "))
print(baris)
print(kolom)
m = Matriks(baris, kolom)
# m.setMat()

# mengisi matriks
for i in range(baris):
    print("ini i")
    for j in range(kolom):
        print("ini j")
        temp = int(input("Masukan Angka: "))
        m.setSel(i, j, temp)
    

# menampilkan matriks
for i in range(baris):
    for j in range(kolom):
        print(f"{m.getSel(i, j)} ")
    


