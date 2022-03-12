""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1  dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

class Lahan:
    #implementasi class Lahan
    # constructor
    def __init__(self):
        super().__init__()
        self.idKomoditas = "Null"
        self.jenisTanah = "Null"
        self.desa = "Null"
        self.kecamatan = "Null"
        self.kota = "Null"
        self.provinsi = "Null"
        self.luas = 0

    #setter method
    def setDataLahan(self, paramIdLahan, paramJenisTanah, paramDesa, paramKecamatan, paramKota, paramProvinsi, paramLuas):
        self.idLahan = paramIdLahan
        self.jenisTanah = paramJenisTanah
        self.desa = paramDesa
        self.kecamatan = paramKecamatan
        self.kota = paramKota
        self.provinsi = paramProvinsi
        self.luas = paramLuas

    # getter method
    def getIdLahan(self):
        return self.idLahan
    
    def getJenisTanah(self):
        return self.jenisTanah
    
    def getDesa(self):
        return self.desa
    
    def getKecamatan(self):
        return self.kecamatan
    
    def getKota(self):
        return self.kota
    
    def getProvinsi(self):
        return self.kota
    
    def getLuas(self):
        return self.luas

    
    # print method data Lahan
    def printDataLahan(self):
        print(f"Id Lahan: {self.getIdLahan()}")
        print(f"Jenis Tanah: {self.getJenisTanah()}")
        print(f"Desa: {self.getDesa()}")
        print(f"Kecamatan: {self.getKecamatan()}")
        print(f"kota: {self.getKota()}")
        print(f"Provinsi: {self.getProvinsi()}")
        print(f"Luas: {self.getLuas()}")
        print("---------------------------------------")
    

            

