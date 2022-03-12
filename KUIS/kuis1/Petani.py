""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1  dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

from Penduduk import Penduduk
from PemilikTengkulak import PemilikTengkulak
from Komoditas import Komoditas
from Lahan import Lahan
from MarketPlace import MarketPlace

class Petani(Penduduk):
    #implementasi class Petani

    #atribut
    komoditasObj = Komoditas()
    lahanObj = Lahan()
    pemilikTengkulakObj = PemilikTengkulak()
    marketplaceObj = MarketPlace()

    # constructor
    def __init__(self):
        super().__init__()
        self.idPetani = "Null"
        self.status = "Null"
        self.tempatPenjualan = "Null"
        self.idPenjual = "Null"

    # setter method for composite
    def setKomoditasObj(self, komoditas):
        self.komoditasObj = komoditas
    
    def setLahanObj(self, lahan):
        self.lahanObj = lahan
    
    def setTengkulakObj(self, pemilikTengkulak):
        self.pemilikTengkulakObj = pemilikTengkulak
    
    def setMarketplaceObj(self, marketplace):
        self.marketplaceObj = marketplace

    #setter method
    def setDataPetani(self, paramIdPenduduk, paramNama, paramAlamat, paramIdPetani, paramStatus, paramTempatPenjualan, paramIdPenjual):
        self.setDataPenduduk(paramIdPenduduk, paramNama, paramAlamat)
        self.idPetani = paramIdPetani
        if paramStatus == True:
            self.status = "Buruh"
        else:
            self.status = "Pemilik Lahan"
        self.tempatPenjualan = paramTempatPenjualan
        self.idPenjual = paramIdPenjual

    # getter method
    def getIdPetani(self):
        return self.idPetani
    
    def getStatus(self):
        return self.status
    
    def getTempatPenjualan(self):
        return self.tempatPenjualan
    
    def getIdPenjual(self):
        return self.idPenjual

    # def gettter composite object
    def getKomoditasObj(self):
        return self.komoditasObj
    
    def getLahanObj(self):
        return self.lahanObj
    
    def getTengkulakObj(self):
        return self.pemilikTengkulakObj
    
    def getMarketplaceObj(self):
        return self.marketplaceObj
    
    # print method data petani
    def printDataPetani(self):
        self.printDataPenduduk()
        print(f"Id Petani: {self.getIdPetani()}")
        print(f"Status : {self.getStatus()}")
        print(f"Tempat Penjualan: {self.getTempatPenjualan()}")
        print(f"Id Penjual: {self.getIdPenjual()}")
        print("---------------------------------------")
            

