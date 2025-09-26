class AnimalEstimacao:
    def __init__(self,nome,especie,idade):
        self.nome = nome
        self.especie = especie
        self.idade = idade
    def get_nome(self):
        return self.nome
    def set_nome(self,novo_nome):
        self.nome = novo_nome
        return


if __name__ == '__main__':
    animal1 = AnimalEstimacao("Toddy", "Cachorro", "5")
    animal2 = AnimalEstimacao("Bob", "Gato", "7")

    r = animal1.get_nome()
    print("Atributo: ", r)
    animal1.set_nome("Rex")
    print("Atributo: ", animal1.get_nome())