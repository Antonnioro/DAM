def extension(texto):
    return len(texto)

palabra1 = input("Mete la primera palabra: ")
palabra2 = input("Mete la segunda palabra: ")

cantidad1 = extension(palabra1)
cantidad2 = extension(palabra2)

if cantidad1 == cantidad2:
    print("Tienen el mismo numero de caracteres")
elif cantidad1 < cantidad2:
    print("La segunda palabra tiene más caracteres")
else:
    print("La primero palabra tiene más caracteres")