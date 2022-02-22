#include "Matriks.cpp"

int main()
{
    int baris = 0, kolom = 0, temp = 0;
    int i,j;

    cout << "Masukan Baris: ";
    cin >> baris;

    cout << "Masukan Kolom: ";
    cin >> kolom;

    // inisialiasi matriks
    Matriks m(baris, kolom);
    
    // mengisi matriks
    for ( i = 0; i < baris; i++)
    {
        for ( j = 0; j < kolom; j++)
        {
            cout << "Masukan angka:" << endl;
            cin >> temp;
            m.setSel(i, j, temp);
        }
    }

    // menampilkan matriks
    for (i = 0; i < baris; i++) 
    {
        for (j = 0; j < kolom; j++) 
        {
            cout << m.getSel(i, j) << " ";
        }
        cout << "\n";
    }
        
    return 0;
}
