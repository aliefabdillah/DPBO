from numpy import mat


class Matriks:
    # implementasi class matriks
    # contruktor
    
    def __init__(self, baris, kolom):
        self.baris = baris
        self.kolom = kolom
        self.mat = [baris][kolom]

    # set and get baris
    def setBaris(self, paramBaris):
        self.baris = paramBaris
    
    def getBaris(self):
        return self.baris
    
    # set and get kolom
    def setKolom(self, paramKolom):
        self.kolom = paramKolom
    
    def getKolom(self):
        return self.kolom

    # set and get matriks
    def setMat(self):
        mat[self.baris][self.kolom]
    
    def getMat(self):
        return mat
    
    # set and get 
    def setSel(self, b, k, nilai):
        self.mat[b][k] = nilai
    
    def getSel(self, baris, kolom):
        return self.mat[baris][kolom]