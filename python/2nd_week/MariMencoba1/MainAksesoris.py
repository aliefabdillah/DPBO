# from Aksesoris import Aksesoris
from AksesorisHandmade import AksesorisHandmade
# from AksesorisPabrikan import AksesorisPabrikan
# from IndustriKreatif import IndustriKreatif
from PengusahaAksesoris import PengusahaAksesoris
from BahanAksesoris import BahanAksesoris
from Kain import Kain


# instansiasi class aksesoris
aks = AksesorisHandmade()

# modifikasi data di class aksesoris handmade menggunakan method yang ada di class aksesoris
aks.setKodeAksesoris("001H")        #H untuk Handmade 
aks.setJenis("Pakaian")
aks.setPangsaPasar("Orang Tua")

# modifikasi atribut class AksesorisHandMade
aks.setKodeBahanHandmade("101")
aks.setHargaHandmade("RP.50000")

# instansiasi class bahan menggunakan class BahanAksesoris
bahan = BahanAksesoris()
bahan.setKodeBahanHandmade(aks.getKodeBahanHandmade())
bahan.setNama("Kain")
bahan.setDeskripsi("Kain untuk Pakaian")
# jika bahan kain
if bahan.getNama() == "Kain":
    # buat object kain dari class Kain
    kain = Kain("Katun", "Katun untuk membuat Pakaian")
    kain.setKodeBahanHandmade(bahan.getKodeBahanHandmade())
    kain.setNama(bahan.getNama())

# intansiasi data class Industri Kreatif menggunakan class PengusahanAksesoris
industri = PengusahaAksesoris()
industri.setNoIjin("01")
industri.setNamaPemilik("Dina")
industri.setKota("Bandung")
industri.setDeskripsiIndustri("Industri bergerak di bidang Pakaian")

# memasukan data ke dalam atribut pengusaha aksesoris 
industri.setKodePengusaha("111")
industri.setKodeAksesoris(aks.getKodeAksesoris())


# print data 1
print("Data ke-1")
print("Aksesoris:")
print("--------------")
print(f"Kode: {str(aks.getKodeAksesoris())}")
print(f"Jenis: {str(aks.getJenis())}")
print(f"Pangsa Pasar: {str(aks.getPangsaPasar())}")
print("--------------")
print("Aksesoris Handmade:")
print("--------------")
print(f"Kode: {str(aks.getKodeAksesoris())}")
print(f"Kode Bahan: {str(aks.getKodeBahanHandmade())}")
print(f"Harga: {str(aks.getHargaHandmade())}")
print("--------------")
print("Bahan Aksesoris:")
print("--------------")
print(f"Kode Bahan: {str(bahan.getKodeBahanHandmade())}")
print(f"Nama Bahan: {str(bahan.getNama())}")
print(f"Deskripsi: {str(bahan.getDeskripsi())}")
if bahan.getNama() == "Kain":
    print("--------------")
    print("Kain:")
    print("--------------")
    print(f"Kode Bahan: {str(kain.getKodeBahanHandmade())}")
    print(f"Nama Bahan: {str(kain.getNama())}")
    print(f"Jenis Serat: {str(kain.getJenisSerat())}")
    print(f"Deskripsi: {str(kain.getDeskripsiKain())}")
print("--------------")
print("Industri Kreatif:")
print("--------------")
print(f"No. Ijin: {str(industri.getNoijin())}")
print(f"Nama Pemilik: {str(industri.getNamaPemiliki())}")
print(f"Kota: {str(industri.getKota())}")
print(f"Deskripsi: {str(industri.getDeskripsiIndustri())}")
print("--------------")
print("Pengusaha Aksesoris:")
print("--------------")
print(f"Kode Pengusaha: {str(industri.getKodePengusaha())}")
print(f"Nama Pemilik: {str(industri.getNamaPemiliki())}")
print(f"Kota: {str(industri.getKota())}")
print(f"Kode Aksesoris: {str(industri.getKodeAksesoris())}")



