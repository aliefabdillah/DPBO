#include <iostream>
#include <string>

using namespace std;

class TabelTim
{
    private:
        int baris;
        int kolom;
    public:
    TabelTim(){
    }

    TabelTim(int b, int k){
        baris = b;
        kolom = k;
    }
    
    //method membuat baris
    void buatBaris(string isi[], int spacing, int arraySize){
        
        int i = 0, j = 0;

        //membuat garis tabel bagian atas
        for ( i = 0; i < arraySize; i++)
        {
            for (j = 0; j < (isi[i].length() + spacing); j++)
            {
                cout << "-";
            }
        }
        cout << "" << endl;

        //menampilkan isi array
        for ( i = 0; i < arraySize; i++)
        {
            cout << "| ";
            cout << isi[i];
            for (j = 0; j < (spacing - 3); j++)
            {
                cout << " ";
            }
            cout << "|";
        }
        cout << "" << endl;
        

        //membuat garis tabel bagian bawah
        for ( i = 0; i < arraySize; i++)
        {
            for (j = 0; j < (isi[i].length() + spacing); j++)
            {
                cout << "-";
            }
        }
        cout << "" << endl;
    }

    ~TabelTim(){
    }
};