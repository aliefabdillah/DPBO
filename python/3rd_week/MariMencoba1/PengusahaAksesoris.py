class PengusahaAksesoris():
    def __init__(self):
        # super().__init__(noIjin, namaPemilik, kota, deskripsiIndustri)
        self.kodePengusaha = ""
        self.namaPengusaha = ""
        self.kotaPengusaha = ""
        self.kodeAksesoris = ""
    
    def setKodePengusaha(self, paramKodePengusaha):
        self.kodePengusaha = paramKodePengusaha
    
    def getKodePengusaha(self):
        return self.kodePengusaha

    def setNamaPengusaha(self, paramNamaPengusaha):
        self.namaPengusaha = paramNamaPengusaha
    
    def getNamaPengusaha(self):
        return self.namaPengusaha

    def setKotaPengusaha(self, paramKotaPengusaha):
        self.kotaPengusaha = paramKotaPengusaha
    
    def getKotaPengusaha(self):
        return self.kotaPengusaha
    
    def setKodeAksesoris(self, paramKodeAksesoris):
        self.kodeAksesoris = paramKodeAksesoris
    
    def getKodeAksesoris(self):
        return self.kodeAksesoris