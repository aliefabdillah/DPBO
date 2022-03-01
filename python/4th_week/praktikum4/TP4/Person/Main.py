from Driver import Driver

def main():
    # instantiation class driver
    dataDriver = [Driver() for i in range(5)]

    # input data
    print("=======================")
    print("      Driver Data      ")
    print("=======================")
    dataDriver[0].setDataPerson("3201929", "Adil", "Male")
    dataDriver[0].setDataJob("212", "Pertamini", "Main Driver")
    dataDriver[0].setDataDriver("001", 2025, "B")

    dataDriver[1].setDataPerson("320020", "Nita", "Female")
    dataDriver[1].setDataJob("222", "Going-Jek", "Bike Driver")
    dataDriver[1].setDataDriver("002", 2024, "C")

    dataDriver[2].setDataPerson("320033", "Abdul", "Male")
    dataDriver[2].setDataJob("232", "Alfajune", "Box Driver")
    dataDriver[2].setDataDriver("003", 2022, "B2")

    dataDriver[3].setDataPerson("3203314", "Jamal", "Male")
    dataDriver[3].setDataJob("242", "Ruber", "Car driver")
    dataDriver[3].setDataDriver("004", 2025, "B")

    dataDriver[4].setDataPerson("3200210", "Reza", "Male")
    dataDriver[4].setDataJob("252", "Si Lambat", "Expedition Driver")
    dataDriver[4].setDataDriver("005", 2023, "B2")
    
    # print data
    for i in range(5):
        dataDriver[i].printDataDriver()

if __name__=="__main__":
    main()