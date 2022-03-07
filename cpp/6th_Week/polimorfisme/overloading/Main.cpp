#include "Buku.cpp"

int main()
{
    Buku obuku;
    obuku.setBuku("PBO");
    cout << "Judul : " << obuku.getJudul() << endl;
    cout << "Tahun : " << obuku.getTahun() << endl;
    cout << "Pengarang : " << obuku.getPengarang() << endl;

    obuku.setBuku("PBO2", 2011);
    cout << "Judul : " << obuku.getJudul() << endl;
    cout << "Tahun : " << obuku.getTahun() << endl;
    cout << "Pengarang : " << obuku.getPengarang() << endl;
    return 0;
}
