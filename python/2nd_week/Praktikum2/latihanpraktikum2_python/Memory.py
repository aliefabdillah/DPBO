from Hardware import Hardware

class Memory(Hardware):

    def __init__(self):
        self.frequency = ""
        self.memorySize = ""
        self.supportsCuda = False

    def setFreqeuncy(self, frequency):
        self.frequency = frequency

    def setMemorySize(self, memorySize):
        self.memorySize = memorySize

    def setSupportsCuda(self, supportsCuda):
        self.supportsCuda = supportsCuda

    def getFrequency(self):
        return self.frequency
    
    def getMemorySize(self):
        return self.memorySize
    
    def getSupportsCuda(self):
        return self.supportsCuda
    