""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1 dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

class Komoditas:
    #implementasi class Komoditas
    # constructor
    def __init__(self):
        super().__init__()
        self.idKomoditas = "Null"
        self.namaKomoditas = "Null"
        self.jenisTanahKomoditas = "Null"
        self.sistemTanam = "Null"

    #setter method
    def setDataKomoditas(self, paramIdKomoditas, paramNamaKomoditas, paramJenisTanahKomoditas, paramSistemTanam):
        self.idKomoditas = paramIdKomoditas
        self.jenisTanahKomoditas = paramJenisTanahKomoditas
        self.namaKomoditas = paramNamaKomoditas
        self.sistemTanam = paramSistemTanam

    # getter method
    def getIdKomoditas(self):
        return self.idKomoditas
    
    def getNamaKomoditas(self):
        return self.namaKomoditas
    
    def getJenisTanahKomoditas(self):
        return self.jenisTanahKomoditas

    def getSistemTanam(self):
        return self.sistemTanam
    
    # print method data petani
    def printDataKomoditas(self):
        print(f"Id Komoditas: {self.getIdKomoditas()}")
        print(f"Nama Komoditas: {self.getNamaKomoditas()}")
        print(f"Jenis Tanah Komoditas : {self.getJenisTanahKomoditas()}")
        print(f"Sistem Tanam: {self.getSistemTanam()}")
        print("---------------------------------------")
    

            

