# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Petani import Petani
from Penduduk import Penduduk

class PemilikTengkulak(Petani, Penduduk):
    __idTengkulak = ""
    __idKomoditasTengkulak = ""

    # constructor
    def __init__(self, petani, penduduk, idTengkulak="", idKomoditasTengkulak=""):
        self.__petani = petani
        self.__penduduk = penduduk
        self.__idTengkulak = idTengkulak
        self.__idKomoditasTengkulak = idKomoditasTengkulak

    # setter
    def setIdTengkunglak(self, idTengkulak):
        self.__idTengkulak = idTengkulak
    def setIKomoditasTengkulak(self, idKomoditasTengkulak):
        self.__idKomoditasTengkulak = idKomoditasTengkulak
    
    # getter
    def getIdTengkulak(self):
        return self.__idTengkulak
    def getIdKomoditasTengkulak(self):
        return self.__idKomoditasTengkulak

    # method print untuk data kelas PemilikTengkulak
    def printPemilikTengkulak(self):
        self.__petani.printPetani()
        self.__penduduk.printPenduduk()
        print(f"ID Tengkulak           : {self.getIdTengkulak()}")
        print(f"ID Komoditas Tengkulak : {self.getIdKomoditasTengkulak()}")