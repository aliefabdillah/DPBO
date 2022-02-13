from Manusia import Manusia
from Karyawan import Karyawan

# instansiasi
m = Manusia()
k = Karyawan()

# mengset atribut manusia/m
m.setNama("Nana")
m.setAlamat("Bogor")
m.setNoKtp("32042822010")
m.setNoTelepon("0813232321")

# cetak atribut manusia/m
print(f"m : nama : {str(m.getNama())}")
print(f"m : alamat : {str(m.getAlamat())}")
print(f"m : No.Ktp : {str(m.getNoKtp())}")
print(f"m : No.Telepon : {str(m.getNoTelepon())}")

# set atribut karyawan
k.setNama("Dina")
k.setAlamat("Tangerang")
k.setNoKtp("3204282101002")
k.setNoTelepon("0822747221")
k.setNomorPegawai("034032")
k.setJabatan("Purchasing Staff")
k.setDepartemen("Purchasing")

# cetak atribut karyawan/k
print(f"\nk : nama : {str(k.getNama())}")
print(f"k : alamat : {str(k.getAlamat())}")
print(f"k : No.Ktp : {str(k.getNoKtp())}")
print(f"k : No.Telepon : {str(k.getNoTelepon())}")
print(f"k : Nomor Pegawai : {str(k.getNomorPegawai())}")
print(f"k : Jabatan : {str(k.getJabatan())}")
print(f"k : Departemen : {str(k.getDepartemen())}")