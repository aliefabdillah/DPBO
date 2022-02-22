class Disk:
    # implementasi class Disk

    # atribut
    diskType = ""
    diskCapacity = ""
    diskPrice = 0

    def __init__(self):
        pass

    def setDiskType(self, diskType):
        self.diskType = diskType

    def getDiskType(self):
        return self.diskType    
    
    def setDiskCapacity(self, diskCapacity):
        self.diskCapacity = diskCapacity
    
    def getDiskCapacity(self):
        return self.diskCapacity

    def setDiskPrice(self, diskPrice):
        self.diskPrice = diskPrice
    
    def getDiskPrice(self):
        return self.diskPrice

    def printDisk(self):
        print("-Data Disk")
        print(f" Type           : {self.diskType}")
        print(f" Kapasitas Disk : {self.diskCapacity}")
        print(f" Harga Disk     : {self.diskPrice}")
        print("--------------------------------------")
    