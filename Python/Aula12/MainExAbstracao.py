from AbstracaoExemplo import FormaGeometrica,quadrado,circulo

if __name__ == '__main__':
    quadrado1 = quadrado('Azul', 5)
    quadrado2 = quadrado('Verde')

    print('Quadrado 1: ', quadrado1.getCor(), ', lado: ', quadrado1.getLado(),'cm, area: ', quadrado1.area(), 'cm², perimetro: ', quadrado1.perimetro(), ' cm')
    print('Quadrado 2: ', quadrado2.getCor(), ', lado: ', quadrado2.getLado(), 'cm, area: ', quadrado2.area(),'cm², perimetro: ', quadrado2.perimetro(), ' cm')

    circulo1 = circulo('Vermelho', 3)
    circulo2 = circulo('Amarelo')

    print('Circulo 1: ',circulo1.getCor(),', raio: ',circulo1.getRaio(),'cm, area: ','{:.2f}'.format(circulo1.area()),'cm², perimetro: ','{:.2f}'.format(circulo1.perimetro()),'cm')
    print('Circulo 2: ',circulo2.getCor(),', raio: ',circulo2.getRaio(),'cm, area: ','{:.2f}'.format(circulo2.area()),'cm², perimetro: ','{:.2f}'.format(circulo2.perimetro()),'cm')


    print('Quantidade de formas: ', FormaGeometrica.getCountFigura())