import imp
from Aksesoris import Aksesoris

class AksesorisPabrikan(Aksesoris):
    # implementasi class Aksesoris Handmade
    def __init__(self, kodeBahan, harga):
        # super().__init__(kodeAksesoris, jenis, pangsaPasar)
        self.kodeBahan = kodeBahan
        self.harga = harga

    # def __init__(self,):
    #     # super().__init__(kode, jenis, pangsaPasar)
        
    
    def setKodeBahanPabrikan(self, paramKodeBahan):
        self.kodeBahan = paramKodeBahan
    
    def setHargaPabrikan(self, paramHarga):
        self.harga = paramHarga
    
    def getKodeBahanPabrikan(self):
        return self.harga
    
    def getHargaPabrikan(self):
        return self.harga