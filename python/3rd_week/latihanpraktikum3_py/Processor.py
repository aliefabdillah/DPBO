class Processor:
    # implementasi class processor

    # atribut
    name = ""
    procPrice = 0

    def __init__(self):
        pass

    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name    
    
    def setProcPrice(self, procPrice):
        self.procPrice = procPrice
    
    def getProcPrice(self):
        return self.procPrice

    def printProc(self):
        print("-Data Processor")
        print(f" Nama Processor  : {self.name}")
        print(f" Harga Processor : {self.procPrice}")
        print("--------------------------------------")
    
