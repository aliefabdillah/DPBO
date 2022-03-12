""" 
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan Kuis 1 dalam mata kuliah Desain Pemrogaman
Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin 
"""

from Petani import Petani
from PemilikTengkulak import PemilikTengkulak
from Komoditas import Komoditas
from Lahan import Lahan
from MarketPlace import MarketPlace

def main():
    #instanition class Petani
    print("=================")
    print("Data Petani:")
    print("=================")
    dataPetani = [Petani() for i in range(2)]

    dataPetani[0].setDataPetani("320001", "Asep", "Ciburuy", "PTN001", False, "Tengkulak", "TGKLK001")
    dataPetani[1].setDataPetani("320002", "Joko", "Cipadung", "PTN002", True, "Marketplace", "MRKT001")

    for i in range(2):
        dataPetani[i].printDataPetani()

    #instanition class Tengkulak
    print("=================")
    print("Data Tengkulak:")
    print("=================")
    dataTengkulak = [PemilikTengkulak() for i in range(2)]

    dataTengkulak[0].setDataTengkulak("320003", "Jaka", "Rancabatok", "TGKLK001", "KMD001", )
    dataTengkulak[1].setDataTengkulak("320004", "Rudi", "Ciseeng", "MRKT001", "KMD002")

    for i in range(2):
        dataTengkulak[i].printDataTengkulak()

    #instanition class Komoditas
    print("=================")
    print("Data Komoditas:")
    print("=================")
    dataKomoditas = [Komoditas() for i in range(2)]

    dataKomoditas[0].setDataKomoditas("KMD001", "Cabe", "Gambut", "Campur Sari")
    dataKomoditas[1].setDataKomoditas("KMD002", "Padi", "Sawah", "Tunggal Tanam")
    for i in range(2):
        dataKomoditas[i].printDataKomoditas()

    #instanition class Lahan
    print("=================")
    print("Data Lahan:")
    print("=================")
    dataLahan = [Lahan() for i in range(2)]

    dataLahan[0].setDataLahan("LHN001", "Gambut", "Sukatani", "Sukatanam", "Bandung", "Jawa Barat", 300)
    dataLahan[1].setDataLahan("LHN002", "Sawa", "Pancar", "Rancasila", "Cianjur", "Jawa Barat", 250)
    for i in range(2):
        dataLahan[i].printDataLahan()
    
    #instanition class MarketPlace
    print("=================")
    print("Data MarketPlace:")
    print("=================")
    dataMarketplace = [MarketPlace() for i in range(2)]

    dataMarketplace[0].setDataMarketPlace("MRKT001", "WarungPedia", True, False)
    dataMarketplace[1].setDataMarketPlace("MRK002", "Pasar Minggu", False, False)
    for i in range(2):
        dataMarketplace[i].printDataMarketPlace()

    """ masukan input nama petani yang ingin dicari """
    inputName = input("\ninput nama petani : ")
    sign = 0
    for i in range(2):
        # jika input sama dengan nama petani
        if inputName == dataPetani[i].getNama():
            print("==========================")
            print(f"Data Petani yang dicari: ")
            print("==========================")
            dataPetani[i].printDataPetani()
            dataKomoditas[i].printDataKomoditas()
            dataLahan[i].printDataLahan()
            sign = 1
    
    # jika input nama tidak sesuai
    if sign == 0:
        print(f"Nama Petani Tidak Ditemukan")

if __name__=="__main__":
    main()