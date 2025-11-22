from abc import ABC, abstractmethod
import math

class FormaGeometrica(ABC):

    contaFigura = 0             #Atributo de classe
    @classmethod                #Método de classe(Decorator)
    def getCountFigura(cls):
        return cls.contaFigura

    def __init__(self, cor):
        self.cor = cor
        FormaGeometrica.contaFigura += 1        #Contador de quantas figuras tem

    def getCor(self):
        return self.cor
    def setCor(self, novaCor):
        self.cor = novaCor

    @abstractmethod
    def area(self):         #Método abstrato
        pass                 #... é a mesma coisa que "pass"
    @abstractmethod
    def perimetro(self):
        ...

class quadrado(FormaGeometrica):
    def __init__(self, cor, lado=2):        #Lado está com valor padrão
        super().__init__(cor)
        self.lado = lado

    def getLado(self):
        return self.lado

    def setLado(self, novoLado):
        self.lado = novoLado

    def area(self):
        areaQuad = self.lado ** 2
        return areaQuad

    def perimetro(self):
        return 4 * self.lado

class circulo(FormaGeometrica):
    def __init__(self, cor, raio = 2):
        super().__init__(cor)
        self.raio = raio

    def getRaio(self):
        return self.raio

    def setRaio(self, novoRaio):
        self.raio = novoRaio

    def area(self):
        areaCirc = math.pi * (self.raio ** 2)
        return areaCirc

    def perimetro(self):
        return 2 * math.pi * self.raio
