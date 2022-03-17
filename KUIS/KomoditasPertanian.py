# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Petani import Petani

class KomoditasPertanian(Petani):
    __idKomoditas = ""
    __namaKomoditas = ""
    __jenisLahanKomoditas = "" # gambut, gembur, tegalan, sawah
    __sistemTanam = "" # campur sari, tunggal tanam

    # constructor
    def __init__(self, petani, idKomoditas="", namaKomoditas="", jenisLahanKomoditas="", sistemTanam=""):
        self.__petani = petani
        self.__idKomoditas = idKomoditas
        self.__namaKomoditas = namaKomoditas
        self.__jenisLahanKomoditas = jenisLahanKomoditas
        self.__sistemTanam = sistemTanam

    # setter
    def setIdKomoditas(self, idKomoditas):
        self.__idKomoditas = idKomoditas
    def setNamaKomoditas(self, namaKomoditas):
        self.__namaKomoditas = namaKomoditas
    def setJenisLahanKomoditas(self, jenisLahanKomoditas):
        self.__jenisLahanKomoditas = jenisLahanKomoditas
    def setSistemTanam(self, sistemTanam):
        self.__sistemTanam = sistemTanam

    # getter
    def getIdKomoditas(self):
        return self.__idKomoditas
    def getNamaKomoditas(self):
        return self.__namaKomoditas
    def getJenisLahanKomoditas(self):
        return self.__jenisLahanKomoditas
    def getSistemTanam(self):
        return self.__sistemTanam

    # method untuk print data class KomoditasPertanian
    def printKomoditasPertanian(self):
        self.__petani.printPetani()
        print(f"ID Komoditas           : {self.getIdKomoditas()}")
        print(f"Nama Komoditas         : {self.getNamaKomoditas()}")
        print(f"Jenis Lahan Komoditas  : {self.getJenisLahanKomoditas()}")
        print(f"Sistem Tanam           : {self.getSistemTanam()}")