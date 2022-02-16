class Product:
    # implementasi class product

    # constructor
    def __init__(self):
        self.price = 0
        self.idProduct = ""
    
    # set and get method
    def setPrice(self, price):
        self.price = price
    
    def setIdProduct(self, idProduct):
        self.idProduct = idProduct
    
    def getPrice(self):
        return self.price
    
    def getIdProduct(self):
        return self.idProduct