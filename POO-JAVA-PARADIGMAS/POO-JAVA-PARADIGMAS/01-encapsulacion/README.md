# Encapsulacion

## Definicion
La encapsulacion protege los datos de un objeto y obliga a modificar su estado
mediante metodos controlados. Los atributos son privados y solo se accede a ellos
por getters y setters.

## Idea clave
Evitar que otros objetos modifiquen el estado interno sin validacion.

## Clases del ejemplo
- `CuentaBancaria`: tiene saldo y titular privados, con metodos para depositar y retirar con validacion.
- `Main`: instancia la cuenta y prueba las operaciones.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Titular: Laura
Saldo inicial: 500000.0
Deposito realizado correctamente.
Retiro realizado correctamente.
Saldo final: 540000.0
```

## Aprendizaje logrado
El saldo no se puede modificar directamente desde Main. Toda operacion pasa
por metodos que validan antes de cambiar el estado. Eso es encapsulacion.
