class IndustriKreatif:
    def __init__(self):
        self.noIjin = ""
        self.namaPemilik = ""
        self.kota = ""
        self.deskripsiIndustri = ""

    def setNoIjin(self, paramNoIjin):
        self.noIjin = paramNoIjin
    
    def setNamaPemilik(self, paramNamaPemilik):
        self.namaPemilik = paramNamaPemilik
    
    def setKota(self, paramKota):
        self.kota = paramKota
    
    def setDeskripsiIndustri(self, paramDeskripsiIndustri):
        self.deskripsiIndustri = paramDeskripsiIndustri
    
    def getNoijin(self):
        return self.noIjin
    
    def getNamaPemiliki(self):
        return self.namaPemilik
    
    def getKota(self):
        return self.kota
    
    def getDeskripsiIndustri(self):
        return self.deskripsiIndustri
        
