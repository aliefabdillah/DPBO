# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Petani import Petani

class Lahan(Petani):
    __idLahan = ""
    __jenisTanah = "" # gambut, gembur, tegalan, sawah
    __desa = ""
    __kecamatan = ""
    __kota = ""
    __provinsi = ""
    __luas = 0

    # constructor
    def __init__(self, petani, idLahan="", jenisTanah="", desa="", kecamatan="", kota="", Provinsi="", luas=0):
        self.__petani = petani
        self.__idLahan = idLahan
        self.__jenisTanah = jenisTanah
        self.__desa = desa
        self.__kecamatan = kecamatan
        self.__kota = kota
        self.__provinsi = Provinsi
        self.__luas = luas
    
    # setter
    def setLahan(self, idLahan):
        self.__idLahan = idLahan
    def setJenisTanah(self, jenisTanah):
        self.__jenisTanah = jenisTanah
    def setDesa(self, desa):
        self.__desa = desa
    def setKecamatan(self, kecamatan):
        self.__kecamatan = kecamatan
    def setKota(self, kota):
        self.__kota = kota
    def setProvinsi(self, Provinsi):
        self.__provinsi = Provinsi
    def setLuas(self, luas):
        self.__luas = luas

    # getter
    def getIdLahan(self):
        return self.__idLahan
    def getJenisTanah(self):
        return self.__jenisTanah
    def getDesa(self):
        return self.__desa
    def getKecamatan(self):
        return self.__kecamatan
    def getKota(self):
        return self.__kota
    def getProvinsi(self):
        return self.__provinsi
    def getLuas(self):
        return self.__luas

    # method untuk print data class lahan
    def printLahan(self):
        self.__petani.printPetani()
        print(f"ID Lahan               : {self.getIdLahan()}")
        print(f"Jenis  Tanah           : {self.getJenisTanah()}")
        print(f"Desa                   : {self.getDesa()}")
        print(f"Kecamatan              : {self.getKecamatan()}")
        print(f"Kota                   : {self.getKota()}")
        print(f"Luas                   : {self.getLuas()} meter")
