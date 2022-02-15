class BahanAksesoris:
    def __init__(self):
        self.kodeBahan = ""
        self.nama = ""
        self.detilBahan = ""
        self.deskripsi = ""

    def setKode(self, paramKodeBahan):
        self.kodeBahan = paramKodeBahan

    def setNama(self, paramNama):
        self.nama = paramNama
    
    def setDetilBahan(self, paramDetilBahan):
        self.detilBahan = paramDetilBahan

    def setDeskripsi(self, paramDeskripsi):
        self.deskripsi = paramDeskripsi
    
    def getKodeBahan(self):
        return self.kodeBahan

    def getNama(self):
        return self.nama
    
    def getDetilBahan(self):
        return self.detilBahan

    def getDeskripsi(self):
        return self.deskripsi