# Abstraccion

## Definicion
La abstraccion representa solo las caracteristicas esenciales de un concepto,
ocultando los detalles irrelevantes. En Java se logra con clases abstractas o interfaces.

## Idea clave
Modelar la idea general primero, y dejar que cada clase concreta implemente los detalles.

## Clases del ejemplo
- `Figura`: clase abstracta con el metodo abstracto `calcularArea()`.
- `Circulo`: implementa el area usando la formula del circulo.
- `Rectangulo`: implementa el area usando base por altura.
- `Main`: instancia ambas figuras y muestra sus areas.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Soy una figura geometrica.
Area del circulo: 78.53981633974483
Soy una figura geometrica.
Area del rectangulo: 24.0
```

## Aprendizaje logrado
Figura define la idea general pero no impone una formula. Cada subclase resuelve
el detalle segun su forma. Primero el concepto, luego la implementacion.
