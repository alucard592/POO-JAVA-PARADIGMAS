# Polimorfismo

## Definicion
El polimorfismo permite tratar objetos de distintas clases a traves de una misma referencia
comun. Cada objeto responde al mismo mensaje segun su implementacion concreta.

## Idea clave
Un mismo metodo produce comportamientos distintos segun el tipo real del objeto.

## Clases del ejemplo
- `Animal`: clase base con el metodo `hacerSonido()`.
- `Perro`: sobrescribe `hacerSonido()` para ladrar.
- `Gato`: sobrescribe `hacerSonido()` para maullar.
- `Main`: declara variables de tipo Animal y les asigna Perro y Gato.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
El perro ladra.
El gato maulla.
```

## Aprendizaje logrado
Ambas variables son de tipo Animal pero cada una responde diferente al mismo metodo.
Esa variacion de comportamiento bajo una misma referencia es el polimorfismo.
