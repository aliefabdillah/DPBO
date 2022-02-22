class Ram:
    # implementasi class ram

    # atribut
    ramCapacity = ""
    ramPrice = 0

    def __init__(self):
        pass
    
    def setRamCapacity(self, ramCapacity):
        self.ramCapacity = ramCapacity
    
    def getRamCapacity(self):
        return self.ramCapacity

    def setRamPrice(self, ramPrice):
        self.ramPrice = ramPrice
    
    def getRamPrice(self):
        return self.ramPrice

    def printRam(self):
        print("-Data RAM")
        print(f" Kapasitas RAM : {self.ramCapacity}")
        print(f" Harga RAM     : {self.ramPrice}")
        print("--------------------------------------")
    