""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1  dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

from Penduduk import Penduduk
class PemilikTengkulak(Penduduk):
    #implementasi class Pemilik Tengkulak
    # contructor
    def __init__(self):
        super().__init__()
        self.idTengkulak = "Null"
        self.idKomoditasTengkulak = "Null"

    #setter method
    def setDataTengkulak(self, paramIdPenduduk, paramNama, paramAlamat, paramIdTengkulak, paramIdKomoditasTengkulak):
        self.setDataPenduduk(paramIdPenduduk, paramNama, paramAlamat)
        self.idTengkulak = paramIdTengkulak
        self.idKomoditasTengkulak = paramIdKomoditasTengkulak

    # getter method
    def getIdTengkulak(self):
        return self.idTengkulak
        
    def getIdKomoditasTengkulak(self):
        return self.idKomoditasTengkulak

    # print data tengkulak
    def printDataTengkulak(self):
        self.printDataPenduduk()
        print(f"Id Tengkulak: {self.getIdTengkulak()}")
        print(f"Id Komoditas Tengkulak: {self.getIdKomoditasTengkulak()}")
        print("---------------------------------------")
    

            

