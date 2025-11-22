from Superclasse import conta
from Subclasses import PF, PJ

if __name__ == '__main__':
    conta1 = conta('Fabricio Galego', 3.00)
    conta2 = conta('CARLOS CABELUDO AUTOPEÇAS LTDA.', 400000.00)

    print('Titular da conta: ', conta1.getnome(), ', saldo: ', '{:.2f}'.format(conta1.getsaldo()))
    print('Titular da conta: ', conta2.getnome(), ', saldo: ', '{:.2f}'.format(conta2.getsaldo()), '\n')

    conta1.setsaldo(-2.00)
    conta2.setnome('CARECA AGIOTAGEM LTDA.')

    print('Titular da conta: ', conta1.getnome(), ', saldo: ', '{:.2f}'.format(conta1.getsaldo()))
    print('Titular da conta: ', conta2.getnome(), ', saldo: ', '{:.2f}'.format(conta2.getsaldo()), '\n')

    pf1 = PF('Fabricio Galego', -2.00,'N/A')

    print('Titular da conta: ', pf1.getnome(), ', saldo: ', '{:.2f}'.format(pf1.getsaldo()), ', genero: ', pf1.getgenero(), '\n')

    pf1.setgenero('M')

    print('Titular da conta: ', pf1.getnome(), ', saldo: ', '{:.2f}'.format(pf1.getsaldo()), ', genero: ', pf1.getgenero(), '\n')

    pj1 = PJ('CARECA AGIOTAGEM LTDA.', 400000.00, 'Serviços')

    print('Titular da conta: ', pj1.getnome(), ', saldo: ', '{:.2f}'.format(pj1.getsaldo()), ' ,modalidade da PJ: ', pj1.getmodalidade(), '\n')

    pj1.setmodalidade('Investimentos')

    print('Titular da conta: ', pj1.getnome(), ', saldo: ', '{:.2f}'.format(pj1.getsaldo()), ' ,modalidade da PJ: ', pj1.getmodalidade(), '\n')

    conta1.deposito(30.00)

    print('Titular da conta: ', conta1.getnome(), ', saldo: ', '{:.2f}'.format(conta1.getsaldo()), '\n')

    conta2.saque(1000000.00)

    print('Titular da conta: ', conta2.getnome(), ', saldo: ', '{:.2f}'.format(conta2.getsaldo()), '\n')

