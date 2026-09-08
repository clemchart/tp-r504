import fonctions as f

while True:
    a = int(input("Entrez le premier nombre (base) : "))
    b = int(input("Entrez le deuxième nombre (exposant) : "))
    res = f.puissance(a, b)
    print(f"{a} puissance {b} = {res}")
