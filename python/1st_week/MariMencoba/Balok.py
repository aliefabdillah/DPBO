class Balok:
    # class unutk balok

    def __init__(self, panjang, lebar, tinggi):
        self.panjang = panjang
        self.lebar = lebar
        self.tinggi = tinggi

    # prosedur get
    def getPanjang(self):
        return self.panjang
    
    def getLebar(self):
        return self.lebar

    def getTinggi(self):
        return self.tinggi

    # fungsi set
    def setPanjang(self, p):
        self.panjang = p
    
    def setLebar(self, l):
        self.lebar = l
    
    def setTinggi(self, t):
        self.tinggi = t

    # fungsi volume
    def volume(self):
        return self.panjang*self.lebar*self.tinggi
    
    # fungsi luas permukaan
    def luasPermukaan(self):
        return (2*self.panjang*self.lebar)+(2*self.lebar*self.tinggi)+(2*self.tinggi*self.panjang)