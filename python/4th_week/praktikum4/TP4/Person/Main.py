from Person import Person
from Job import Job
from Driver import Driver

def main():
    # instantiation person class
    dataPerson = [Person() for i in range(5)]

    # input data
    dataPerson[0].setDataPerson("3200", "Adit", "Male")
    dataPerson[1].setDataPerson("3201", "Adi", "Male")
    dataPerson[2].setDataPerson("3202", "Ati", "Female")
    dataPerson[3].setDataPerson("3203", "Ari", "Female")
    dataPerson[4].setDataPerson("3204", "Abdi", "Male")

    # print person data
    print("=======================")
    print("      Person Data      ")
    print("=======================")
    for i in range(5):
        dataPerson[i].printDataPerson()
        print("")
    
    # instantiation job class
    dataJob = [Job() for i in range(5)]

    # input data
    dataJob[0].setDataJob("100", "Warungpedia", "Enginner")
    dataJob[1].setDataJob("101", "KHT MAJU JAYA", "Chief Director")
    dataJob[2].setDataJob("102", "Nabati", "Driver")
    dataJob[3].setDataJob("103", "Tutuplapak", "Frontend")
    dataJob[4].setDataJob("104", "ECER", "Electronic Enginner")

    # print job data
    print("\n=======================")
    print("        Job Data       ")
    print("=======================")
    for i in range(5):
        dataJob[i].printDataJob()
        print("")

    # instantiation class driver
    dataDriver = [Driver() for i in range(5)]

    # input data
    print("\n=======================")
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