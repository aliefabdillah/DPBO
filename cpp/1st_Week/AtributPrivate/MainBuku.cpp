#include "Buku.cpp"

using namespace std;
int main()
{
    //deklarasi object b1 dari class Buku 
    Buku b1;
    b1.setJudul("J2ME");
    b1.setPengarang("Orang_1");

    cout << b1.getJudul() << endl;
    cout << b1.getPengarang() << endl;

    //membuat object b2 dari class Buku yang memiliki constructor
    Buku b2("J2NE", "Orang_2");
    cout << b2.getJudul() << endl;
    cout << b2.getPengarang() << endl;
    
    return 0;
}
