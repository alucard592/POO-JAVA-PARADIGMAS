# Herencia

## Definicion
La herencia permite que una clase hija reutilice atributos y metodos de una clase padre,
agregando o especializando comportamiento propio.

## Idea clave
Reutilizar codigo y organizar jerarquias entre tipos relacionados sin repetir logica.

## Clases del ejemplo
- `Empleado`: clase padre con nombre y salario comunes.
- `Gerente`: hereda de Empleado y agrega el atributo area.
- `Desarrollador`: hereda de Empleado y agrega el lenguaje de programacion.
- `Main`: crea instancias de ambas clases hija y muestra su informacion.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Nombre: Maria
Salario: 4500000.0
Area: Tecnologia
-----
Nombre: Carlos
Salario: 3800000.0
Lenguaje principal: Java
```

## Aprendizaje logrado
Gerente y Desarrollador no repiten nombre ni salario. Los heredan de Empleado
y cada uno agrega solo lo que lo hace diferente.
