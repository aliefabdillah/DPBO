class Titik:
    # class untuk implementasi titik

    # constructor, menggunakan kata kunci __init__
    def __init__(self, x, y):
        self.x = x
        self.y = y


    """ funngsi set """
    def setX(self, x):
        self.x = x

    def setY(self, y):
        self.y = y

    """ Fungsi get """
    def getX(self):
        return self.x
    
    def getY(self):
        return self.y
        