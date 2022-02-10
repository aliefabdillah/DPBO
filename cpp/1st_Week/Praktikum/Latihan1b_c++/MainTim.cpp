#include "DataTim.cpp"
#include "TabelTim.cpp"

using namespace std;

int main()
{
    
    int i, j, k;            //variabel untuk iterasi
    int n = 0;
    int m = 0;       //variabel untuk banyaknya array

    //masunan n
    cout << "Masukan Jumlah Data Tim: ";
    cin >> n;

    //deklarasi array data dari class 
    // DataTim arrData[0];

    string nama, negara, kota, kandang, tahunBerdiri;

    //for loop untuk input dan output array
    for ( i = 0; i < n; i++)
    {   
        //masunkan data tim
        cout << "Masukan Nama, Negara, Kota, Kandang, dan Tahun Berdiri Tim ke-" << i+1 << ":\n";
        cin >> nama >> negara >> kota >> kandang >> tahunBerdiri;
        
        //masukan panjang array jumlah pemain
        
        cout << "Masukan Jumlah Pemain dalam Tim: ";
        cin >> m;
        
        //masukan nama dan nomor punggun pemain
        string namaPemain;
        int nomor = 0;
        DataTim arrData[m];
        for ( j = 0; j < m; j++)
        {
            cout << "Masukan Nama dan Nomor Punggung Pemain ke-" << j+1 << ": "; 
            cin >> namaPemain >> nomor;
            //memasukan data ke dalam object array yang memiliki panjang m
            arrData[j] = DataTim(nama, negara, kota, kandang, tahunBerdiri, namaPemain, nomor);     
        }

        
        //print data tim
        TabelTim tabTim(n, 4);
        cout << "Tim No." << i+1 << ":\n";
        string arrDataTimStr[5];

        //memasukan data yang ada pada object ke dalam array of string
        arrDataTimStr[0] = arrData[i].getNama(); 
        arrDataTimStr[1] = arrData[i].getNegara();
        arrDataTimStr[2] = arrData[i].getKota();
        arrDataTimStr[3] = arrData[i].getKandang();
        arrDataTimStr[4] = arrData[i].getTahunBerdiri();

        tabTim.buatBaris(arrDataTimStr, 4, 5);

        //print daftar pemain
        cout << "Daftar Pemain:" << endl;
        TabelTim tabPemain(m, 4);
        for (k = 0; k < m; k++)
        {
            //memasukan data yang ada pada object ke dalam array of string
            string arrDataPemainStr[2];
            arrDataPemainStr[0] = arrData[k].getPemain();
            arrDataPemainStr[1] = to_string(arrData[k].getNomorPunggung());
            tabPemain.buatBaris(arrDataPemainStr, 4, 2);                       //membuat output dalam bentuk tabel
        } 
    }

    return 0;
}