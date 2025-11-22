from Aula10.ClasseVeiculo import veiculo
from ClasseVeiculo import carro
from ClasseVeiculo import moto

if __name__ == '__main__':
    veiculo1 = veiculo(20000.00, '17000 km')
    veiculo2 = veiculo(70000.00,'100000 km')
    veiculo3 = veiculo(90000.00, '30000 km')

    carro1 = carro(20000.00,'17000 km', 4)
    carro2 = carro(90000.00, '30000 km')

    moto1 = moto(70000.00,'100000 km', '401cc')

    print(f'Valor do Veículo 1: , {veiculo1.getValor():.2f}')
    print('Kilometragem do Veículo 1: ', veiculo1.getKm())

    veiculo1.setValor(50000.00)
    veiculo1.setKm('100000 km')

    print(f'Novo valor do Veículo 1: , {veiculo1.getValor():.2f}')
    print('Nova kilometragem do Veículo 1: ', veiculo1.getKm())

    print('Valor do carro 2: ', carro2.getValor(), ', Kilometragem do carro 2', carro2.getKm(), ', Qtd de portas do carro 2: ', carro2.getPortas())

    carro2.setPortas(4)
    print('Nova qtd de portas do carro 1: ', carro2.getPortas())

    print('Valor da moto 1: ', moto1.getValor(),', Kilometragem da moto 1', moto1.getKm(), ', cilindradas da moto 1: ', moto1.getCilindrada())

    moto1.setCilidradra('500cc')
    print('Nova cilindrada da moto 1: ', moto1.getCilindrada())

    carro2.aumentaValor(5000) #O metodo está presente na classe veículo porém se aplica para a subclasse também.
    print('Valor do carro 2 com acrescimo: ',carro2.getValor())
