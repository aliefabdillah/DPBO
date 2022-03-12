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
    
    def getIdMarketPlace(self):
        return self.idMarketPlace
    
    def getNamaMarketPlace(self):
        return self.namaMarketPlace
    
    def getTipeMarket(self):
        return self.tipeMarket
    
    def getTipeMarketBussines(self):
        return self.tipeMarketBussines
    
    def printDataMarketPlace(self):
        print(f"id MarketPlace : {self.getIdMarketPlace()}")
        print(f"Nama Marketplace : {self.getNamaMarketPlace()}")
        print(f"Tipe Market : {self.getTipeMarket()}")
        print(f"Tipe Market Bussines : {self.getTipeMarketBussines()}")
        print("---------------------------------------")