# Agregacion

## Definicion
La agregacion es una relacion todo-parte debil. Un objeto agrupa a otros,
pero esos objetos pueden existir aunque el contenedor desaparezca.

## Idea clave
Los jugadores pertenecen al equipo, pero fueron creados antes y pueden existir sin el.

## Clases del ejemplo
- `Jugador`: clase independiente con su nombre.
- `Equipo`: agrupa jugadores en una lista, pero no los crea internamente.
- `Main`: crea los jugadores por separado y luego los agrega al equipo.

## Como ejecutar
1. Abrir terminal en la carpeta src
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

## Salida esperada
```
Equipo: Tigres
- Luis
- Pedro
```

## Aprendizaje logrado
Los jugadores se crean primero y luego se agregan al equipo. No nacen dentro
del equipo ni dependen de el. Esa pertenencia flexible es la agregacion.
