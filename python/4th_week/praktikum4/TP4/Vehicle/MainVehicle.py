from Ship import Ship
from Airplane import Airplane

def main():
    # instantiation ship data
    print("=================")
    print("Ship Data:")
    print("=================")
    dataShip = [Ship() for i in range(5)]

    # input for ship data
    dataShip[0].setDataShip("Container Ship", 4, "German", "Biofuel", 100)
    dataShip[1].setDataShip("Tanker Ship", 10, "China", "Low-Sulphur", 250)
    dataShip[2].setDataShip("Passanger Ship", 3, "Japan", "Low-Sulphyr", 5000)
    dataShip[3].setDataShip("Offshore Ship", 15, "China", "Distilate", 20)
    dataShip[4].setDataShip("Fishing Ship", 10, "Vietnam", "Biofuel", 15)

    # print ship data
    i = 0
    for i in range(5):
        dataShip[i].printDataShip()
    
    # instantiation airplane data
    print("\n=================")
    print("Airplane Data:")
    print("=================")
    dataPlane = [Airplane() for i in range(5)]

    # input for airplane data
    dataPlane[0].setDataPlane("Antonov An-2", 5, 18.2, "Avgas", 2)
    dataPlane[1].setDataPlane("Boeing 377", 20, 14, "Kerosene", 84)
    dataPlane[2].setDataPlane("Airbus A300", 14, 44.84, "Avgas", 149)
    dataPlane[3].setDataPlane("Boeing 737", 10, 28.9, "Avtur", 132)
    dataPlane[4].setDataPlane("Stuka Bomber", 25, 30, "Kerosene", 2)

    # print airplane data
    i = 0
    for i in range(5):
        dataPlane[i].printDataPlane()

if __name__=="__main__":
    main()