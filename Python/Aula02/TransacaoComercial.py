#Esse programa é para calcular a balança comercial de uma empresa

compra = float(input("Digite o valor da compra: "))
venda = float(input("Digite o valor da venda: "))
balanca = venda - compra

print("A balança ficou: ", balanca)
if venda - compra > 0:
    print("Teve lucro")
elif venda - compra < 0:
    print("Teve prejuizo")
else:
    print("Os valores são iguais")