from Processor import Processor
from Disk import Disk
from Ram import Ram

class Pc:
    # implementasi class pc
    
    # atribut
    procObj = Processor()
    diskObj = Disk()
    ramObj = Ram()
    totalPrice = 0
    
    # constructor
    def __init__(self):
        pass
    
    # setter atribut
    def setProcObj(self, procObj):
        self.procObj = procObj
    
    def setDiskObj(self, diskObj):
        self.diskObj = diskObj
    
    def setRamObj(self, ramObj):
        self.ramObj = ramObj
    
    # getter atribut
    def getProcObj(self):
        return self.procObj
    
    def getDiskObj(self):
        return self.diskObj
    
    def gerRamObj(self):
        return self.ramObj
    
    # method menghitung total harga
    def countTotal(self):
        self.totalPrice = self.procObj.getProcPrice() + self.diskObj.getDiskPrice() + self.ramObj.getRamPrice()
    
    # method print data pc
    def printPc(self):
        self.procObj.printProc()
        self.diskObj.printDisk()
        self.ramObj.printRam()
        print("-Data PC")
        print(f" Harga PC : {self.totalPrice}")
        print("--------------------------------------")


