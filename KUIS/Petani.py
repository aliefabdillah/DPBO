# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Penduduk import Penduduk

class Petani(Penduduk):
    __idPetani = ""
    __idLahan = ""
    __status = "" # Buruh/Pemilik Lahan
    __idPenjual = ""
    __metodeJual = "" # MarketPlace/Tengkulak

    # constructor
    def __init__(self, penduduk, idPetani="", idLahan="", status="", idPenjual="", metodeJual=""):
        self.__penduduk = penduduk
        self.__idPetani = idPetani
        self.__idLahan = idLahan
        self.__status = status # Buruh/Pemilik Lahan
        self.__idPenjual = idPenjual 
        self.__metodeJual = metodeJual # MarketPlace/Tengkulak
        
    
    # setter
    def setIdPetani(self, idPetani):
        self.__idPetani = idPetani
    def setIdLahan(self, idLahan):
        self.__idLahan = idLahan
    def setStatus(self, status):
        self.__status = status
    def setIdPenjual(self, idPenjual):
        self.__idPenjual = idPenjual
    def setMetodeJual(self, metodeJual):
        self.__metodeJual = metodeJual

    # getter untuk 
    def getIdPetani(self):
        return self.__idPetani
    def getIdLahan(self):
        return self.__idLahan
    def getStatus(self):
        return self.__status
    def getIdPenjual(self):
        return self.__idPenjual
    def getMetodeJual(self):
        return self.__metodeJual
    
    # method untuk print data petani
    def printPetani(self):
        self.__penduduk.printPenduduk()
        print(f"ID Petani              : {self.getIdPetani()}")
        print(f"ID Lahan               : {self.getIdLahan()}")
        print(f"Status                 : {self.getStatus()}")
        print(f"ID Penjual             : {self.getIdPenjual()}")
        print(f"Metode Jual            : {self.getMetodeJual()}")