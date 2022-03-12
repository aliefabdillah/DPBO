""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1 dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""
class Penduduk:
    # implementasi Class penduduk

    # contructor
    def __init__(self):
        self.idPenduduk = "Null"
        self.nama = "Null"
        self.alamat = "Null"

    # setter method person
    def setDataPenduduk(self, paramIdPenduduk, paramNama, paramAlamat):
        self.idPenduduk = paramIdPenduduk
        self.nama = paramNama
        self.alamat = paramAlamat

    # get method
    def getIdPenduduk(self):
        return self.idPenduduk
    
    def getNama(self):
        return self.nama

    def getAlamat(self):
        return self.alamat
    
    # print data penduduk
    def printDataPenduduk(self):
        print(f"Id Penduduk: {self.getIdPenduduk()}")
        print(f"Nama: {self.getNama()}")
        print(f"Alamat: {self.getAlamat()}")
    