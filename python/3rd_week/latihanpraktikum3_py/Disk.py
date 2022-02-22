class Disk:
    # implementasi class Disk

    # atribut
    diskType = ""
    diskCapacity = ""
    diskPrice = 0

    # contructor
    def __init__(self):
        pass

    # get and set disk type
    def setDiskType(self, diskType):
        self.diskType = diskType

    def getDiskType(self):
        return self.diskType    
    
    # get and set disk capcity
    def setDiskCapacity(self, diskCapacity):
        self.diskCapacity = diskCapacity
    
    def getDiskCapacity(self):
        return self.diskCapacity

    # get and set disk price
    def setDiskPrice(self, diskPrice):
        self.diskPrice = diskPrice
    
    def getDiskPrice(self):
        return self.diskPrice

    # method print data disk
    def printDisk(self):
        print("-Data Disk")
        print(f" Type           : {self.diskType}")
        print(f" Kapasitas Disk : {self.diskCapacity}")
        print(f" Harga Disk     : {self.diskPrice}")
        print("--------------------------------------")
    