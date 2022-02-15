class Aksesoris:
    # implementasi class untuk aksesoris

    def __init__(self, kodeAksesoris, jenis, pangsaPasar):
        self.kodeAksesoris = kodeAksesoris
        self.jenis = jenis
        self.pangsaPasar = pangsaPasar
    
    def setKodeAksesoris(self, paramKodeAksesoris):
        self.kodeAksesoris = paramKodeAksesoris
    
    def setJenis(self, paramJenis):
        self.jenis = paramJenis
    
    def setPangsaPasar(self, paramPangsaPasar):
        self.pangsaPasar = paramPangsaPasar
    
    def getKodeAksesoris(self):
        return self.kodeAksesoris
    
    def getJenis(self):
        return self.jenis
    
    def getPangsaPasar(self):
        return self.pangsaPasar
        