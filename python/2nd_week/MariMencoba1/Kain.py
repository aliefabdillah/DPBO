from BahanAksesoris import BahanAksesoris

class Kain(BahanAksesoris):
    
    def __init__(self, jenisSerat, deskripsiKain):
        # super().__init__(nama, deskripsi)
        self.jeniSerat = jenisSerat
        self.deskripsiKain = deskripsiKain
    
    def setJenisSerat(self, paramJenisSerat):
        self.jeniSerat = paramJenisSerat
    
    def setDeskripsiKain(self, paramDeskripsiKain):
        self.deskripsiKain = paramDeskripsiKain
    
    def getJenisSerat(self):
        return self.jeniSerat
    
    def getDeskripsiKain(self):
        return self.deskripsiKain