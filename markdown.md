# Markdown

Lenguaje de texto plano el cual fue diseñado para marcar mensajes, una de sus grandes ventajas es que fue diseñado de forma que tenga mucha legibilidad y sea facil de publicar.

## Tabla de contenido
- [Markdown](#markdown)
  - [Tabla de contenido](#tabla-de-contenido)
    - [Titulos](#titulos)
- [Titulo 1](#titulo-1)
  - [Titulo 2](#titulo-2)
    - [Titulo 3](#titulo-3)
      - [Titulo 4](#titulo-4)
        - [Titulo 5](#titulo-5)
          - [Titulo 6](#titulo-6)
    - [Cursivas](#cursivas)
    - [Negrilla](#negrilla)
    - [Vinetas](#vinetas)
  - [Párrafos y saltos de línea](#párrafos-y-saltos-de-línea)
    - [Insertar imagenes](#insertar-imagenes)
    - [Insertar enlaces](#insertar-enlaces)
    - [Hacer anclaje](#hacer-anclaje)
    - [Insertar una linea de codigo](#insertar-una-linea-de-codigo)
    - [Insertar tablas](#insertar-tablas)
    - [Editores en Markdown](#editores-en-markdown)
    - [Otras referencias sobre Markdown](#otras-referencias-sobre-markdown)
### Titulos 

Dependiendo de la cantidad de # que añadas al principio de la linea el tamaño del título es diferente, cuantos más # más pequeño el título. Existen hasta un máximo de 6 titulos.

# Titulo 1
## Titulo 2
### Titulo 3
#### Titulo 4
##### Titulo 5
###### Titulo 6


### Cursivas
Para que un fragmento del texto aparezca en cursiva simplemente hay que poner un _ al inicio y al final de una frase en una linea nueva.
<br>_Frase en cursiva_

### Negrilla

Para que un fragmento del texto aparezca en negrita simplemente hay que poner dos * al inicio y al final de una frase en una linea nueva.
<br>**Frase en negrita**

### Vinetas

Para una lista numerada simplemente se el añadira un número delante con un . y despues el texto (Ej. 1. Primero)
1. Priemro
2. Segundo
3. Tercero
4. Cuarto
Para la lista no numerada simplemente un guion al inicio y ya se crea correctamente.
- Cursiva
- Negrita
- Viñetas
- Titulos

## Párrafos y saltos de línea

Para insertar un salto de linea se puede hacer como en html, poniendo una eqitueta br entre sus mayor y menor que.
<br>

### Insertar imagenes

![Vegetta Arabe](arabe.jpeg)

### Insertar enlaces
Para insertar un enlace simplemente se pone como si fuera una etiqueta de html, entre un menor y un mayor que.
<br><https://ejemplo.com>

### Hacer anclaje

Para poder anclar, simplemente ponenos entre [] el nombre de lo que queremos que aparezca, en mi caso yo puse link text, al cerrar el corchete ponemos dentro de los parentesis # y nos apareceran una serie de sugerencias, nada mas empezar a buscar tabla ya aparece el resto del resultado.

[link text](#tabla-de-contenido)

### Insertar una linea de codigo

Insertar ejemplo de código formateado en Java, PHP, Javascript y HTML.

Para poder insertar codigo simplemente hay que poner tres ` si despues de esto ponemos el lenguaje nos lo coloreará, justo debajo ponemos unos corchetes y dentro es donde escribimos todo el contenido, luego para cerrarlo de nuevo escribiremos otras tres comillas.

JAVA
```java
{
    public class HolaMundo{
        public static void main(String[] args){
            System.out.println("¡Hola mundo!");
        }
    }
}
```
PHP
```php
{
    <?php phpinfo(); ?>
}
```

JavaScript
```Javascript
{
    console.log("Hello world!");
}
```

HTML
```HTML
{
    <h1>Mi título principal</h1>
    <h2>Mi título de nivel superior</h2>
    <h3>Mi subtítulo</h3>
    <h4>Mi sub-subtítulo</h4>
}
```
### Insertar tablas

Para insertar una tabla añadimos | entre cada apartado (ej |Titulo1|Titulo2|), debajo de esta lo mismo solo que sustituimos los titulos por - y debajo ya los contenidos que queramos añadir.

| Titulo1 | Titulo2 |
| - | - |
|Contenido|Contenido|

### Editores en Markdown 

Estes son varios de los editores específicos para markdown:

- [Writemonkey](<https://writemonkey.com/>)
- [MarkdownPad2](<http://markdownpad.com/>)
- [MdCharm](<https://github.com/zhangshine/MdCharm>)
- [Focused](<https://www.focus-md.com/>)

### Otras referencias sobre Markdown

Referencias sobre markdown

<https://markdown.es/sintaxis-markdown/>
<https://daringfireball.net/projects/markdown/syntax>

