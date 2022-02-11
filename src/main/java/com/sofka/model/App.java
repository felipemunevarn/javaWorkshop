package com.sofka.model;

import java.util.Scanner;

public class App {
    private final double IVA = 21;

    public void firstAndSecond(int num1, int num2){
        if (num1 > num2) System.out.println("El numero " + num1 + " es mayor que " + num2);
        else if (num2 > num1) System.out.println("El numero " + num2 + " es mayor que " + num1);
        else System.out.println("El numero " + num1 + " es igual que " + num2);
    }

    public double areaCirle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateIVA(double price){
        return price * IVA / 100;
    }

    public void evenAndOddWhile(){
        int i = 1;
        while (i < 101){
            if (i % 2 == 0) System.out.println("par: " + i);
            else System.out.println("impar: " + i);
            i++;
        }
    }

    public void evenAndOddFor(){
        for (int i = 1; i < 101; i++){
            if (i % 2 == 0) System.out.println("par: " + i);
            else System.out.println("impar: " + i);
        }
    }

    public void tillGreaterZero(){
        Scanner in = new Scanner(System.in);
        String number;
        do {
            System.out.println("Ingrese un numero: ");
            number = in.nextLine();
        } while (Integer.parseInt(number) < 0);
        System.out.println("Felicitaciones!");
    }

    public String workingDaysCalc(String day){
        String typeOfDay = "";
        switch (day){
            case "lunes":
                typeOfDay = "laboral";
                break;
            case "martes":
                typeOfDay = "laboral";
                break;
            case "miercoles":
                typeOfDay = "laboral";
                break;
            case "jueves":
                typeOfDay = "laboral";
                break;
            case "viernes":
                typeOfDay = "laboral";
                break;
            case "sabado":
                typeOfDay = "no laboral";
                break;
            case "domingo":
                typeOfDay = "no laboral";
                break;
        }
        return typeOfDay;
    }

    public String replaceAndCocatenate(){
        String original = "La sonrisa sera la mejor arma contra la tristeza";
        String finalString = original.replace("a", "e");
        finalString += ". Esto es producto del lenguaje inclusivo";
        return finalString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        App app = new App();

//        System.out.println("Ingrese el primer numero: ");
//        int input1 = in.nextInt();
//        System.out.println("Ingrese el segundo numero: ");
//        int input2 = in.nextInt();
//        app.firstAndSecond(input1, input2);
//
//        System.out.println("Ingrese el radio del circulo: ");
//        double radius = in.nextDouble();
//        System.out.println("El area del cirulo es: " + app.areaCirle(radius));
//
//        System.out.println("Ingrese el precio del producto: ");
//        in.nextLine();
//        String price = in.nextLine();
//        System.out.println("El IVA del producto es: " + app.calculateIVA(Double.parseDouble(price)));

//        app.evenAndOddWhile();
//        app.evenAndOddFor();

//        app.tillGreaterZero();

//        System.out.println("Ingrese dia de la semana: ");
//        String day = in.nextLine();
//        System.out.println(app.workingDaysCalc(day));

        System.out.println(app.replaceAndCocatenate());

        in.close();
    }
}


//        Del texto, “La sonrisa sera la mejor arma contra la tristeza' Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
//        Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
//        Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u'.
//        Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
//        Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
//        Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
//        Hacer un programa que muestre el siguiente menú de opciones
//        ****** GESTION CINEMATOGRAFICA ********
//        1-NUEVO ACTOR
//        2-BUSCAR ACTOR
//        3-ELIMINAR ACTOR
//        4-MODIFICAR ACTOR
//        5-VER TODOS LOS ACTORES
//        6- VER PELICULAS DE LOS ACTORES
//
//        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
//        8-SALIR
//
//
//        EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
//        PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
//
//
//        Haz una clase llamada Persona que siga las siguientes condiciones:
//
//        Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
//
//
//        Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo será hombre por defecto, usa una constante para ello.
//
//
//        Se implantarán varios constructores:
//
//        Un constructor por defecto.
//        Un constructor con el nombre, edad y sexo, el resto por defecto.
//        Un constructor con todos los atributos como parámetro.
//
//        Los métodos que se implementaran son:
//
//
//        calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
//
//        esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//        comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
//        toString(): devuelve toda la información del objeto.
//        generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
//        Métodos set de cada parámetro, excepto de DNI.
//
//        Ahora, crea una clase ejecutable que haga lo siguiente:
//
//
//        Pide por teclado el nombre, la edad, sexo, peso y altura.
//        Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
//        Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//        Indicar para cada objeto si es mayor de edad.
//        Por último, mostrar la información de cada objeto.
//
//        Crearemos una superclase llamada Electrodoméstico con las siguientes características:
//        Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indican que se podrán heredar.
//        Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
//        Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
//        Los constructores que se implementarán serán:
//
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con todos los atributos.
//
//        Los métodos que implementara serán:
//
//        Métodos get de todos los atributos.
//        comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no será visible.
//        comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.
//        precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
//
//
//
//
//
//
//        Crearemos una subclase llamada Lavadora con las siguientes características:
//
//        Su atributo es carga, además de los atributos heredados.
//        Por defecto, la carga es de 5 kg. Usa una constante para ello.
//        Los constructores que se implementarán serán:
//
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//
//        Los métodos que se implementara serán:
//        Método get de carga.
//        precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
//
//        Crearemos una subclase llamada Television con las siguientes características:
//
//        Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
//        Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
//        Los constructores que se implementarán serán:
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//
//        Los métodos que se implementara serán:
//        Método get de resolución y sintonizador TDT.
//        precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
//
//        Ahora crea una clase ejecutable que realice lo siguiente:
//
//        Crea un array de Electrodomesticos de 10 posiciones.
//        Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
//        Ahora, recorre este array y ejecuta el método precioFinal().
//        Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
//
//        Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
//
//
//        Crear una clase llamada Serie con las siguientes características:
//        Sus atributos son título, numero de temporadas, entregado, género y creador.
//        Por defecto, el número de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
//        Los constructores que se implementarán serán:
//        Un constructor por defecto.
//        Un constructor con el titulo y creador. El resto por defecto.
//        Un constructor con todos los atributos, excepto de entregado.
//
//        Los métodos que se implementara serán:
//
//        Métodos get de todos los atributos, excepto de entregado.
//        Métodos set de todos los atributos, excepto de entregado.
//        Sobrescribe los métodos toString.
//
//        Crearemos una clase Videojuego con las siguientes características:
//
//        Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
//        Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
//        Los constructores que se implementaran serán:
//        Un constructor por defecto.
//        Un constructor con el titulo y horas estimadas. El resto por defecto.
//        Un constructor con todos los atributos, excepto de entregado.
//        Los métodos que se implementara serán:
//        Métodos get de todos los atributos, excepto de entregado.
//        Métodos set de todos los atributos, excepto de entregado.
//        Sobrescribe los métodos toString.
//        Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
//
//        entregar(): cambia el atributo prestado a true.
//        devolver(): cambia el atributo prestado a false.
//        isEntregado(): devuelve el estado del atributo prestado.
//        Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
//
//        Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:
//
//        Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
//        Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
//        Entrega algunos Videojuegos y Series con el método entregar().
//        Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
//        Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muéstralos en pantalla con toda su información (usa el método toString()).
//
