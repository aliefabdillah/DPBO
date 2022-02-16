from Product import Product

# implementasi class Hardware dengan parent product
class Hardware(Product):
    # constructor
    def __init__(self):
        self.brand = ""
        self.model = ""
    
    # set and get method
    def setBrand(self, brand):
        self.brand = brand
    
    def setModel(self, model):
        self.model = model
    
    def getBrand(self):
        return self.brand
    
    def getModel(self):
        return self.model