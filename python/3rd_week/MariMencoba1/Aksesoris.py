class Aksesoris:
    # implementasi class untuk aksesoris

#   constructor
    def __init__(self):
        self.kodeAksesoris = ""
        self.jenis = ""
        self.kodeBahan = ""
        self.harga = ""
        self.pengelompokan = ""                 #class handmade dan pabrikan dilebur ke dalam class aksesoris dan disatukan dalam atribut pengelompokan
        self.pangsaPasar = ""

#   set and get method
    #set method
    def setKodeAksesoris(self, paramKodeAksesoris):
        self.kodeAksesoris = paramKodeAksesoris
    
    def setJenis(self, paramJenis):
        self.jenis = paramJenis

    def setKodeBahan(self, paramKodeBahan):
        self.kodeBahan = paramKodeBahan

    def setHarga(self, paramHarga):
        self.harga = paramHarga

    def setPengelompokan(self, paramPengelompokan):
        self.pengelompokan = paramPengelompokan

    def setPangsaPasar(self, paramPangsaPasar):
        self.pangsaPasar = paramPangsaPasar
    
    #get method
    def getKodeAksesoris(self):
        return self.kodeAksesoris
    
    def getJenis(self):
        return self.jenis

    def getKodeBahan(self):
        return self.kodeBahan
    
    def getHarga(self):
        return self.harga
    
    def getPengelompokan(self):             
        return self.pengelompokan
    
    def getPangsaPasar(self):
        return self.pangsaPasar
        