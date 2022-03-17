# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Petani import Petani

class MarketPlace(Petani):
    __idMarketPlace = ""
    __namaMarketPlace = ""
    __tipeMarket = "" # online/offline
    __sistemMarket = "" # BusinessToCostumer, BusineesToBusiness

    # constructor
    def __init__(self, petani, idMarketPlace="", namaMarketPlace="", tipemMarket="", sistemMarket=""):
        self.__petani = petani
        self.__idMarketPlace = idMarketPlace
        self.__namaMarketPlace = namaMarketPlace
        self.__tipeMarket = tipemMarket
        self.__sistemMarket = sistemMarket

    # setter
    def setMarketPlace(self, idMarketPlace):
        self.__idMarketPlace = idMarketPlace
    def setMarketPlace(self, namaMarketPlace):
        self.__namaMarketPlace = namaMarketPlace
    def setMarketPlace(self, tipemMarket):
        self.__tipeMarket = tipemMarket
    def setMarketPlace(self, sistemMarket):
        self.__sistemMarket = sistemMarket
    
    # getter
    def getIdMarketPlace(self):
        return self.__idMarketPlace
    def getNamaMarketPlace(self):
        return self.__namaMarketPlace
    def getTipemMarket(self):
        return self.__tipeMarket
    def getSistemMarket(self):
        return self.__sistemMarket

    # method print untuk data class MarketPlace
    def printMarketPlace(self):
        self.__petani.printPetani()
        print(f"ID Marketplace         : {self.getIdMarketPlace()}")
        print(f"Nama Marketplace       : {self.getNamaMarketPlace()}")
        print(f"Tipe Market            : {self.getTipemMarket()}")
        print(f"Proses Bisnis          : {self.getSistemMarket()}")