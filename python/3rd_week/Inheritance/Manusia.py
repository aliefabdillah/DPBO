class Manusia:
    # implementasi class manusia

    # constructor
    def __init__(self):
        self.nama = ""
        self.alamat = ""
        self.no_ktp = ""
        self.no_telepon = ""

    # set method
    def setNama(self, nama):
        self.nama = nama
    
    def setAlamat(self, alamat):
        self.alamat = alamat
    
    def setNoKtp(self, no_ktp):
        self.no_ktp = no_ktp
    
    def setNoTelepon(self, no_telepon):
        self.no_telepon = no_telepon
    
    # get method
    def getNama(self):
        return self.nama
    
    def getAlamat(self):
        return self.alamat
    
    def getNoKtp(self):
        return self.no_ktp
    
    def getNoTelepon(self):
        return self.no_telepon
    