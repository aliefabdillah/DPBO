#include <iostream>
#include <string>

using namespace std;

class Tabel
{
    private:
        int baris;
        int kolom;
    public:
    Tabel(){
    }

    Tabel(int b, int k){
        baris = b;
        kolom = k;
    }
    
    //method membuat baris
    void buatBaris(string isi[], int add){
        
        int i = 0, j = 0;

        //membuat garis tabel bagian atas
        for ( i = 0; i < add; i++)
        {
            for (j = 0; j < (isi[i].length() + add); j++)
            {
                cout << "-";
            }
        }
        cout << "" << endl;

        //menampilkan isi array
        for ( i = 0; i < add; i++)
        {
            cout << "| ";
            cout << isi[i];
            for (j = 0; j < add - 3; j++)
            {
                cout << " " << isi[i];
            }
            cout << "|";
        }
        cout << "" << endl;
        

        //membuat garis tabel bagian bawah
        for ( i = 0; i < add; i++)
        {
            for (j = 0; j < (isi[i].length() + add); j++)
            {
                cout << "-";
            }
        }
        cout << "" << endl;
    }

    ~Tabel(){
    }
};
