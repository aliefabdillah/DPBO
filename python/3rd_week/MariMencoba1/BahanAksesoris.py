from AksesorisHandmade import AksesorisHandmade
from AksesorisPabrikan import AksesorisPabrikan

class BahanAksesoris(AksesorisHandmade, AksesorisPabrikan):
    def __init__(self):
        # super().__init__(kodeBahan, harga)
        super()
        self.nama = ""
        self.deskripsi = ""

    def setNama(self, paramNama):
        self.nama = paramNama
    
    def setDeskripsi(self, paramDeskripsi):
        self.deskripsi = paramDeskripsi
    
    def getNama(self):
        return self.nama

    def getDeskripsi(self):
        return self.deskripsi