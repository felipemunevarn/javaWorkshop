package com.sofka.model;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    public String removeSpaces(String sentence){
        String[] ar = sentence.split(" ");
        String withoutSpaces = "";
        for (String elem : ar) {
            withoutSpaces += elem;
        }
        return withoutSpaces;
    }

    public void compareSentences(String word1, String word2){
        if (word1.equals(word2)) {
            System.out.println("Las palabras son iguales");
        } else {
            for (int i = 0; i < word1.split("").length; i++) {
                if (!word1.split("")[i].equals(word2.split("")[i])) {
                    System.out.println("Palabras distintas en posición " + (i + 1) + ". En palabra 1 es: '" + word1.split("")[i] + "', y en la 2 es: '" + word2.split("")[i] + "'");
                    break;
                }
            }
        }
    }

    public void actualDate(){
        Date now = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println("Fecha actual: " + ft.format(now));
    }

    public void numbersToThousand(int init){
        for (int i = init; i < 1001; i += 2) {
            System.out.println(i);
        }
    }

    public void menu(){
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
            System.out.println("Ingrese opcion? ");
            int option = in.nextInt();
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    exit = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        } while(exit);
        System.out.println("Gracias, adios!");
        in.close();
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

//        System.out.println(app.replaceAndCocatenate());
//        System.out.println("Ingrese frase: ");
//        String sentence = in.nextLine();
//        System.out.println(app.removeSpaces(sentence));

//        System.out.println("Ingrese primera palabra : ");
//        String word1 = in.nextLine();
//        System.out.println("Ingrese segunda palabra : ");
//        String word2 = in.nextLine();
//        app.compareSentences(word1, word2);

//        app.actualDate();

//        System.out.println("Ingrese un numero: ");
//        int number = in.nextInt();
//        app.numbersToThousand(number);

//        app.menu();

        in.close();
    }
}

//        Hacer un programa que muestre el siguiente menú de opciones
//
//
//
//
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
