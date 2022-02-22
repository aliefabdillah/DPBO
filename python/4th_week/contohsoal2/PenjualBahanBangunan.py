from TokoBangunan import TokoBangunan

class PenjualBahanBangunan:

    
    def __init__(self, noKtp = "", nama = "", banyakToko = 0):
        self.noKtp = noKtp
        self.nama = nama
        self.banyakToko = banyakToko
        self.toko = [TokoBangunan() for i in range(banyakToko)]

    # set and get method
    def setNoKtp(self, paramNoKtp):
        self.noKtp = paramNoKtp
        
    def setNama(self, paramNama):
        self.nama = paramNama
        
    def setBanyakToko(self, paramBanyakToko):
        self.banyakToko = paramBanyakToko
        
    def setToko(self, paramToko, nomorToko):
        self.toko[nomorToko] = paramToko

    def getNoKtp(self):
        return self.noKtp
        
    def getNama(self):
        return self.nama
        
    def getBanyakToko(self):
        return self.banyakToko
        
    def getToko(self):
        return self.toko
    
    # method print semua data
    def cetakPenjual(self):
        print("------------------------------")
        print(f"Nama Penjual       : {self.nama}")
        print(f"No KTP Penjual     : {self.noKtp}")
        print(f"Toko Yang Dimiliki :")
        for i in range(self.banyakToko):
            print(i+1)
            print(f"- Kode Toko   : {self.toko[i].getKodeToko()}")
            print(f"- Nama Toko   : {self.toko[i].getNamaToko()}")
            print(f"- Alamat Toko : {self.toko[i].getAlamatToko()}")
        
    # method print data penjual dan toko tertentu
    def cetakPenjualToko(self, i):
        print("------------------------------")
        print(f"Nama Penjual       : {self.nama}")
        print(f"No KTP Penjual     : {self.noKtp}")
        print(f"Toko Yang Dimiliki :")
        
        print(i+1)
        print(f"- Kode Toko   : {self.toko[i].getKodeToko()}")
        print(f"- Nama Toko   : {self.toko[i].getNamaToko()}")
        print(f"- Alamat Toko : {self.toko[i].getAlamatToko()}")

        
        