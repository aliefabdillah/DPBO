class PersegiPanjang():
    # private atribut
    __panjang = 0
    __lebar = 0
    
    def __init__(self, panjang = 0, lebar = 0):
        self.__panjang = panjang
        self.__lebar = lebar

    def setPanjang(self, panjang):
        self.__panjang = panjang

    def setLebar(self, lebar):
        self.__lebar = lebar

    def getPanjang(self):
        return self.__panjang

    def getLebar(self):
        return self.__lebar
    
    def keliling(self):
        return 2 * (self.__panjang + self.__lebar)
    
    def luas(self):
        return self.__panjang * self.__lebar
