#include "PersegiPanjang.cpp"
using namespace std;

int main(){
    PersegiPanjang rec1;
    
    //inisialisasi menggunakan setter
    rec1.setPanjang(6);
    rec1.setLebar(3);

    //inisialiasi menggunakan constructor
    PersegiPanjang rec2(10, 5);

    //memakai inputan
    int n = 0, i = 0;
    cin >> n;

    //membuat array object
    PersegiPanjang arrRec[n];

    for ( i = 0; i < n; i++)
    {
        int p, l;
        cin >> p >> l;

        //memasukan nilai array object
        arrRec[i].setLebar(l);
        arrRec[i].setPanjang(p);
    }
    
    cout<<"Keliling Persegi Panjang 1 : "<< rec1.keliling() << endl;
    cout<<"Luas Persegi Panjang 1 : "<< rec1.luas() << endl;
    cout<<"Keliling Persegi Panjang 2 : "<< rec2.keliling() << endl;
    cout<<"Luas Persegi Panjang 2 : "<< rec2.luas() << endl;

    //output array
    for ( i = 0; i < n; i++)
    {
        cout<<"Keliling Persegi Panjang array : " << arrRec[i].keliling() << endl;
        cout<<"Luas Persegi Panjang array : "<< arrRec[i].luas() << endl;
    }
    
    return 0;
}