sueldo = int(input("Introduce el sueldo: "))
antiguedad = int(input("Introduce los años de antiguedad: "))

if sueldo < 500 and antiguedad >= 10:
    incremento = sueldo * 0.20
    nuevoSueldo = sueldo + incremento
    print(f"Sueldo a pagar: {nuevoSueldo}")
elif sueldo < 500 and antiguedad < 10:
    nuevoSueldo = sueldo * 1.05
    print(f"Sueldo a pagar: {nuevoSueldo}")
else:
    print(f"Sueldo a pagar: {sueldo}")