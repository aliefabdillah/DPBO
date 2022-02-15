from IndustriKreatif import IndustriKreatif
from Aksesoris import Aksesoris

class PengusahaAksesoris(IndustriKreatif, Aksesoris):
    def __init__(self):
        # super().__init__(noIjin, namaPemilik, kota, deskripsiIndustri)
        self.kodePengusaha = ""
    
    def setKodePengusaha(self, paramKodePengusaha):
        self.kodePengusaha = paramKodePengusaha
    
    def getKodePengusaha(self):
        return self.kodePengusaha