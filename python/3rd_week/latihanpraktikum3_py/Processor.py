class Processor:
    # implementasi class processor

    # atribut
    name = ""
    procPrice = 0

    # constrtucor
    def __init__(self):
        pass

    # set and get name
    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name    

    # set and get procPrice
    def setProcPrice(self, procPrice):
        self.procPrice = procPrice
    
    def getProcPrice(self):
        return self.procPrice

    # method print data processor
    def printProc(self):
        print("-Data Processor")
        print(f" Nama Processor  : {self.name}")
        print(f" Harga Processor : {self.procPrice}")
        print("--------------------------------------")
    
