from turtle import pen
from Aksesoris import Aksesoris
from IndustriKreatif import IndustriKreatif
from PengusahaAksesoris import PengusahaAksesoris
from BahanAksesoris import BahanAksesoris


# instansiasi class aksesoris
aks = Aksesoris()

# modifikasi data menggunakan method yang ada di class aksesoris
aks.setKodeAksesoris("001")        
aks.setJenis("Pakaian")
aks.setKodeBahan("bhn01")
aks.setHarga("RP.50000")
aks.setPengelompokan("Handmade")            #pengelompokan berdasarkan pembuatan
aks.setPangsaPasar("Orang Tua")

# instansiasi class bahan menggunakan class BahanAksesoris
bahan = BahanAksesoris()
bahan.setKode("bhn01")
bahan.setNama("Kain")
bahan.setDetilBahan("Katun")                #class kain di masukan ke dalam class bahan dalam bentuk atribut
bahan.setDeskripsi("Kain untuk Pakaian")

# intansiasi data class Industri Kreatif menggunakan class PengusahanAksesoris
industri = IndustriKreatif()
industri.setNoIjin("01")
industri.setNamaPemilik("Dina")
industri.setKota("Bandung")
industri.setDeskripsiIndustri("Industri bergerak di bidang Pakaian")

# memasukan data ke dalam atribut pengusaha aksesoris 
pengusaha = PengusahaAksesoris()
pengusaha.setKodePengusaha("111")
pengusaha.setNamaPengusaha("Alief")
pengusaha.setKotaPengusaha("Bandung")
pengusaha.setKodeAksesoris("001")

# print data 1
print("Data ke-1")
print("Aksesoris:")
print("--------------")
print(f"Kode         : {str(aks.getKodeAksesoris())}")
print(f"Jenis        : {str(aks.getJenis())}")
print(f"Harga        : {str(aks.getHarga())}")
print(f"Kode Bahan   : {str(aks.getKodeBahan())}")
print(f"Pengelompokan: {str(aks.getPengelompokan())}")
print(f"Pangsa Pasar : {str(aks.getPangsaPasar())}")
print("--------------")
print("Bahan Aksesoris:")
print("--------------")
print(f"Kode Bahan : {str(bahan.getKodeBahan())}")
print(f"Nama Bahan : {str(bahan.getNama())}")
print(f"Detil Bahan: {str(bahan.getDetilBahan())}")
print(f"Deskripsi  : {str(bahan.getDeskripsi())}")
print("--------------")
print("Industri Kreatif:")
print("--------------")
print(f"No. Ijin    : {str(industri.getNoijin())}")
print(f"Nama Pemilik: {str(industri.getNamaPemiliki())}")
print(f"Kota        : {str(industri.getKota())}")
print(f"Deskripsi   : {str(industri.getDeskripsiIndustri())}")
print("--------------")
print("Pengusaha Aksesoris:")
print("--------------")
print(f"Kode Pengusaha: {str(pengusaha.getKodePengusaha())}")
print(f"Nama Pengusaha: {str(pengusaha.getNamaPengusaha())}")
print(f"Kota          : {str(pengusaha.getKotaPengusaha())}")
print(f"Kode Aksesoris: {str(pengusaha.getKodeAksesoris())}")



