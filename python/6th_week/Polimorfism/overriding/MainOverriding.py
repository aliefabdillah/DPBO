class BangunDatar:
    def __init__(self):
        print("Bangun Datar")

    def luas(self):
        return 0

class Persegi(BangunDatar):
    def __init__(self):
        print("Persegi")

    def luas(self, p=0, l=0):
        print(p)
        print(l)
        print(p*l)


opersegi = Persegi
print(opersegi.luas(opersegi, 5,6))