
class Tabel:
    # class untuk tabel

    def __init__(self, baris, kolom):
        self.baris = baris
        self.kolom = kolom

    # set baris
    def setBaris(self, b, k):
        self.kolom = k
        self.baris = b 
    
    # membuar baris
    def buatBaris(self, add, isi = []):
        # membuat garis tabel atas
        i = 0 
        for i in self.isi.len:
            j = 0
            for j in self.i.len() + self.add:
                print("-")
        print("\n")

        # membuat isi
        i, j = 0
        for i in self.isi.len:
            print("| ")
            print(i)
            for j in add-3:
                print(" ")
            print("|")
        print("\n")

        i = 0 
        for i in self.isi.len:
            j = 0
            for j in self.i.len() + self.add:
                print("-")
        print("\n")
    
