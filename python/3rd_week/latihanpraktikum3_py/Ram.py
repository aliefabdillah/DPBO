class Ram:
    # implementasi class ram

    # atribut
    ramCapacity = ""
    ramPrice = 0

    # constructor
    def __init__(self):
        pass
    
    # getter and setter ram capacity
    def setRamCapacity(self, ramCapacity):
        self.ramCapacity = ramCapacity
    
    def getRamCapacity(self):
        return self.ramCapacity

    # setter and getter ramPrice
    def setRamPrice(self, ramPrice):
        self.ramPrice = ramPrice
    
    def getRamPrice(self):
        return self.ramPrice

    # method print data ram
    def printRam(self):
        print("-Data RAM")
        print(f" Kapasitas RAM : {self.ramCapacity}")
        print(f" Harga RAM     : {self.ramPrice}")
        print("--------------------------------------")
    