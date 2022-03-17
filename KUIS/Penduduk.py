# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Penduduk:
    __idPenduduk = 0
    __nama = ""
    __alamat = ""

    # constructor
    def __init__(self, idPenduduk=0, nama="", alamat=""):
        self.__idPenduduk = idPenduduk
        self.__nama = nama
        self.__alamat = alamat
    
    # setter
    def setIdPenduduk(self, idPenduduk):
        self.__idPenduduk = idPenduduk
    def setNama(self, nama):
        self.__nama = nama
    def setNama(self, alamat):
        self.__alamat = alamat

    # getter untuk idPenduduk
    def getIdPenduduk(self):
        return self.__idPenduduk
    def getNama(self):
        return self.__nama
    def getAlamat(self):
        return self.__alamat
    
    # method untuk print data petani
    def printPenduduk(self):
        print(f"ID Penduduk            : {self.getIdPenduduk()}")
        print(f"Nama                   : {self.getNama()}")
        print(f"Alamat                 : {self.getAlamat()}")