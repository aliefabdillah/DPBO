from Aksesoris import Aksesoris

class AksesorisHandmade(Aksesoris):
    # implementasi class

    def __init__(self):
        # super().__init__(kodeAksesoris, jenis, pangsaPasar)
        self.kodeBahan = ""
        self.harga = ""
    
    def setKodeBahanHandmade(self, paramKodeBahan):
        self.kodeBahan = paramKodeBahan
    
    def setHargaHandmade(self, paramHarga):
        self.harga = paramHarga
    
    def getKodeBahanHandmade(self):
        return self.kodeBahan
    
    def getHargaHandmade(self):
        return self.harga