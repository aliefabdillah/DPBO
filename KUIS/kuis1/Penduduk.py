class Penduduk:
    # implementasi Class penduduk

    # contructor
    def __init__(self):
        self.idPenduduk = "Null"
        self.nama = "Null"
        self.alamat = "Null"

    # setter method person
    def setDataPenduduk(self, paramIdPenduduk, paramNama, paramAlamat):
        self.idPenduduk = paramIdPenduduk
        self.nama = paramNama
        self.alamat = paramAlamat

    # get method
    def getIdPenduduk(self):
        return self.idPenduduk
    
    def getNama(self):
        return self.nama

    def getAlamat(self):
        return self.alamat

    def printDataPenduduk(self):
        print(f"Id Penduduk: {self.getIdPenduduk()}")
        print(f"Nama: {self.getNama()}")
        print(f"Alamat: {self.getAlamat()}")
    