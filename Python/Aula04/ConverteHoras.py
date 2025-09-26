def converte_hora (p_hora, p_minuto):
    p_hora = p_hora * 60
    total_min = p_hora + p_minuto
    return total_min

if __name__ == '__main__':
    v_hora = int(input("Digite as horas: "))
    v_minuto = int(input("Digite os minutos: "))
    print("O total é de ", converte_hora(v_hora, v_minuto), " minutos")