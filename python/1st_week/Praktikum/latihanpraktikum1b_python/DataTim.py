class DataTim:
    # private atribut
    # nama = " ", negara = " ", kota, kandang, tahunBerdiri, pemain
    # nomorPunggung = 0
    def __init__(self, paramNama = "", paramNegara = "", paramKota = "", paramKandang = "", paramTahunBerdiri = "", paramPelatih = "", paramKapten = ""):
        self.nama = paramNama
        self.negara = paramNegara
        self.kota = paramKota
        self.kandang = paramKandang
        self.tahunBerdiri = paramTahunBerdiri
        self.pelatih = paramPelatih
        self.kapten = paramKapten
    
    # method set dan get
        # set method
    def setNama(self, paramNama):
        self.nama = paramNama
    
    def setNegara(self, paramNegara):
        self.negara = paramNegara

    def setKota(self, paramKota):
        self.kota = paramKota

    def setKandang(self, paramKandang):
        self.kandang = paramKandang

    def setTahunBerdiri(self, paramTahunBerdiri):
        self.tahunBerdiri = paramTahunBerdiri

    def setPelatih(self, paramPelatih):
        self.pelatih = paramPelatih

    def setKapteb(self, paramKapten):
        self.kapten = paramKapten

        # get method
    def getNama(self):
        return self.nama

    def getKandang(self):
        return self.negara

    def getNegara(self):
        return self.kota

    def getKota(self):
        return self.kandang
    
    def getTahunBerdiri(self):
        return self.tahunBerdiri
    
    def getPelatih(self):
        return self.pelatih
    
    def getKapten(self):
        return self.kapten

    def printData(self):
        print(f"Nama Tim : {self.nama}")
        print(f"Negara Asal Tim : {self.negara}")
        print(f"Kota Asal Tim : {self.kota}")
        print(f"Kandang Tim : {self.kandang}")
        print(f"Tahun Berdiri Tim : {self.tahunBerdiri}")
        print(f"Pelatih Tim : {self.pelatih}")
        print(f"Kapten Tim : {self.kapten}")
    
