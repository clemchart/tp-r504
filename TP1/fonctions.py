def puissance(a, b):
    if not type(a) is int:
        raise TypeError("Only integers are allowed")
    if not type(b) is int:
        raise TypeError("Only integers are allowed")
    if a == 0 and b < 0:
        raise Exception("0 to a negative power is undefined")

    resultat = 1
    for i in range(abs(b)):
        resultat = resultat * a

    if b < 0:
        resultat = 1 / resultat

    return resultat
