""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1 dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

class MarketPlace:
    # implementasi class Marketplace

    # constructor
    def __init__(self):
        self.idMarketPlace = "Null"
        self.namaMarketPlace = "Null"
        self.tipeMarket = "Null"
        self.tipeMarketBussines = "Null"

    # setter method
    def setDataMarketPlace(self, paramIdMarketPlace, paramNamaMarketPlace, paramTipeMarket, paramTipeMarketBussines):
        self.idMarketPlace = paramIdMarketPlace
        self.namaMarketPlace = paramNamaMarketPlace

        if paramTipeMarket == True:
            self.tipeMarket = "Online"
        else:
            self.tipeMarket = "Offline"
        
        if paramTipeMarketBussines == True:
            self.tipeMarketBussines = "Bussines to Bussines"
        else:
            self.tipeMarketBussines = "Bussines to Customer"
    
    # getter method
    def getIdMarketPlace(self):
        return self.idMarketPlace
    
    def getNamaMarketPlace(self):
        return self.namaMarketPlace
    
    def getTipeMarket(self):
        return self.tipeMarket
    
    def getTipeMarketBussines(self):
        return self.tipeMarketBussines
    
    # print method data marketplace
    def printDataMarketPlace(self):
        print(f"id MarketPlace : {self.getIdMarketPlace()}")
        print(f"Nama Marketplace : {self.getNamaMarketPlace()}")
        print(f"Tipe Market : {self.getTipeMarket()}")
        print(f"Tipe Market Bussines : {self.getTipeMarketBussines()}")
        print("---------------------------------------")