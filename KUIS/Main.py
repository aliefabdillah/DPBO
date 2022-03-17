# Saya Hilman Fauzi Herdiana (2000879) mengerjakan Kuis 1 dalam mata kuliah 
# Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak 
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Penduduk import Penduduk
from Petani import Petani
from Lahan import Lahan
from KomoditasPertanian import KomoditasPertanian
from PemilikTengkulak import PemilikTengkulak
from MarketPlace import MarketPlace

# data untuk object oPenduduk 
oPenduduk = [Penduduk for i in range(7)]
oPenduduk[0] = Penduduk(32001, "Riki", "Sumedang")
oPenduduk[1] = Penduduk(32002, "Siti", "Solo")
oPenduduk[2] = Penduduk(32003, "Wijaya", "Surabaya")
oPenduduk[3] = Penduduk(32004, "Erik", "Jakarta")
oPenduduk[4] = Penduduk(32005, "Joni", "Bandung")
oPenduduk[5] = Penduduk(32006, "Jarwin", "Padang")
oPenduduk[6] = Penduduk(32006, "Soni", "Medan")

# menampilkan isi objek oPenduduk
print(f"Data Penduduk")
print(f"=================")
for i in range(7):
    print(f"Data Penduduk ke {i+1}:")
    print(f"------------------------------------")
    oPenduduk[i].printPenduduk()
    print(f"")

print(f"==========================================================\n")

# data untuk object oPetani
oPetani = [Petani for i in range(4)]
oPetani[0] = Petani(oPenduduk[0] ,"201","4001","Buruh", "M002", "MarketPlace")
oPetani[1] = Petani(oPenduduk[1] ,"202","4002","Pemilik Lahan", "M001", "MarketPlace")
oPetani[2] = Petani(oPenduduk[2] ,"203","4003","Buruh", "T001", "Tengkulak")
oPetani[3] = Petani(oPenduduk[3] ,"204","4004","Pemilik Lahan", "T002", "Tengkulak")

# menampilkan isi objek oPetani
print(f"Data Petani")
print(f"=================")
for i in range(4):
    print(f"Data Petani ke {i+1}:")
    print(f"------------------------------------")
    oPetani[i].printPetani()
    print(f"")

print(f"==========================================================\n")

# data untuk object oLahan
oLahan = [Lahan for i in range(4)]
oLahan[0] = Lahan(oPetani[0], "4001", "Sawah", "Situraja Utara", "Situraja", "Sumedang", "Jawa Barat", 399)
oLahan[1] = Lahan(oPetani[1], "4002", "Tegalan", "Pamulihan", "Sumedang Utara", "Sumedang", "Jawa Barat", 100)
oLahan[2] = Lahan(oPetani[2], "4003", "Gembur", "Tagog", "Ganeas", "Sumedang", "Jawa Barat", 399)
oLahan[3] = Lahan(oPetani[3], "4004", "Gambut", "Tegalkalong", "Sumedang Selatan", "Sumedang", "Jawa Barat", 200)

# menampilkan isi objek oLahan
print(f"Data Lahan")
print(f"=================")
for i in range(4):
    print(f"Data Lahan ke {i+1}:")
    print(f"------------------------------------")
    oLahan[i].printLahan()
    print(f"")

print(f"==========================================================\n")

# data untuk object oKomoditasPertanian
oKomoditasPertanian = [KomoditasPertanian for i in range(4)]
oKomoditasPertanian[0] = KomoditasPertanian(oPetani[0], "Kom_001", "Sawah Corporation", "Sawah", "Tunggal tanam")
oKomoditasPertanian[1] = KomoditasPertanian(oPetani[1], "Kom_002", "PT. Tegalpanjang", "Tegalan", "Campur sari")
oKomoditasPertanian[2] = KomoditasPertanian(oPetani[2], "Kom_003", "Gembur Gembira", "Gembur", "Campur sari")
oKomoditasPertanian[3] = KomoditasPertanian(oPetani[3], "Kom_003", "Gembur Gembira", "Gembur", "Campur sari")


# menampilkan isi objek oKomoditasPertanian
print(f"Data KomoditasPertanian")
print(f"=================")
for i in range(4):
    print(f"Data KomoditasPertanian ke {i+1}:")
    print(f"------------------------------------")
    oKomoditasPertanian[i].printKomoditasPertanian()
    print(f"")

print(f"==========================================================\n")

# data untuk object oMarketPlace
oMarketPlace = [MarketPlace for i in range(2)]
oMarketPlace[0] = MarketPlace(oPetani[1], "M001", "Shopii", "Online", "BusinessToCustomer")
oMarketPlace[1] = MarketPlace(oPetani[0], "M002", "Sukses Salawasna", "Offline", "BusinessToBusiness")

# menampilkan isi objek oMarketPlace
print(f"Data MarketPlace")
print(f"=================")
for i in range(2):
    print(f"Data MarketPlace ke {i+1}:")
    print(f"------------------------------------")
    oMarketPlace[i].printMarketPlace()
    print(f"")

print(f"==========================================================\n")

# data untuk object oPemilikTengkulak
oPemilikTengkulak = [PemilikTengkulak for i in range(2)]
oPemilikTengkulak[0] = PemilikTengkulak(oPetani[2], Penduduk[3], "T001", "IKT001")
oPemilikTengkulak[1] = PemilikTengkulak(oPetani[3], oPenduduk[4], "T002", "IKT002")

# menampilkan isi objek oPemilikTengkulak
print(f"Data PemilikTengkulak")
print(f"=================")
for i in range(2):
    print(f"Data PemilikTengkulak ke {i+1}:")
    print(f"------------------------------------")
    oPemilikTengkulak[i].printPemilikTengkulak()
    print(f"")