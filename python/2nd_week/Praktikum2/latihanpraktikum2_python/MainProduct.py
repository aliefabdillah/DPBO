from Memory import Memory

# instansiasi class
data = Memory()

# set atribut pad aobject
data.setIdProduct("001")
data.setPrice(15000000)
data.setBrand("Acer")
data.setModel("Nitro 5")
data.setFreqeuncy("4200 MHZ")
data.setMemorySize("16 GB")
data.setSupportsCuda(True)

# print atribut pada object
print(f"====================")
print(f"1. Id Product: {data.getIdProduct()}")
print(f"2. Price: {data.getPrice()}")
print(f"3. Brand: {data.getBrand()}")
print(f"4. Model: {data.getModel()}")
print(f"5. Frequency: {data.getFrequency()}")
print(f"6. Memory Size: {data.getMemorySize()}")
print(f"7. Support Cuda: {data.getSupportsCuda()}")
print(f"====================")
