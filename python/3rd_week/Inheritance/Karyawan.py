import imp
from Manusia import Manusia

class Karyawan(Manusia):
    # implementasi class karyawan dengan parent class, class manusia
    
    # konstruktor
    def __init__(self):
        self.nomorPegawai = ""
        self.jabatan = ""
        self.departemen = ""
    
    # method set
    def setNomorPegawai(self, nomorPegawai):
        self.nomorPegawai = nomorPegawai
    
    def setJabatan(self, jabatan):
        self.jabatan = jabatan
    
    def setDepartemen(self, departemen):
        self.departemen = departemen
    
    # method get
    def getNomorPegawai(self):
        return self.nomorPegawai
    
    def getJabatan(self):
        return self.jabatan
    
    def getDepartemen(self):
        return self.departemen
