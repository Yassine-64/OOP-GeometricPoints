class Point :
    def __init__(self, abscisse = 0, ordonné = 0)  :
        
        self.abscisse = abscisse
        self.ordonné = ordonné


    def get_abscisse(self):
        return self.abscisse
    
    def set_abscisse(self, valeur):
        self.abscisse = valeur

    def get_ordonné(self):
        return self.ordonné
    
    def set_ordonné(self, valeur):
        self.ordonné = valeur

    def distance(self,point):
        return ((self.abscisse - point.abscisse)**2 + (self.ordonné - point.ordonné)**2)**0.5

    def norm(self):
        return ((self.abscisse)**2 + (self.ordonné)**2)**0.5
    
point1 = Point(4,3 )

print("Distance:", point1.distance(Point(0, 0)))

print("Norm:", point1.norm())
