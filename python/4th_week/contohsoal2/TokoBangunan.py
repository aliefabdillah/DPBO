class TokoBangunan:

    def __init__(self, kodeToko=0, namaToko="", alamatToko=""):
        self.kodeToko = kodeToko
        self.namaToko = namaToko
        self.alamatToko = alamatToko
    
    def getKodeToko(self):
        return self.kodeToko
    
    def getNamaToko(self):
        return self.namaToko

    def getAlamatToko(self):
        return self.alamatToko
    
    def setKodeToko(self, kodeToko):
        self.kodeToko = kodeToko
    
    def setNamaToko(self, namaToko):
        self.namaToko = namaToko
    
    def setAlamatToko(self, alamatToko):
        self.alamatToko = alamatToko
    
