from Processor import Processor
from Disk import Disk
from Ram import Ram
from Pc import Pc

# instansiasi class processor

dataProc = Processor()
dataProc.setName("AMD")
dataProc.setProcPrice(2500000)

# instansiasi class disk
dataDisk = Disk()
dataDisk.setDiskType("HDD")
dataDisk.setDiskCapacity("1 TB")
dataDisk.setDiskPrice(500000)

# instansiasi class ram
dataRam = Ram()
dataRam.setRamCapacity("GB")
dataRam.setRamPrice(1500000)

# instansiaasi class pc
dataPc = Pc()
dataPc.setProcObj(dataProc)
dataPc.setDiskObj(dataDisk)
dataPc.setRamObj(dataRam)

# memanggil method hitung total price
dataPc.countTotal()

# print seluruh data pada objek
dataPc.printPc()