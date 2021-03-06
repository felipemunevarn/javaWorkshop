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
                    System.out.println("Palabras distintas en posici??n " + (i + 1) + ". En palabra 1 es: '" + word1.split("")[i] + "', y en la 2 es: '" + word2.split("")[i] + "'");
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

        System.out.println("Nombre ? ");
        String name = in.nextLine();
        System.out.println("Edad ? ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Sexo (H/M) ? ");
        String genderStr = in.nextLine();
        char gender = genderStr.charAt(0);
        System.out.println("Peso (kg) ? ");
        double weight = in.nextDouble();
        in.nextLine();
        System.out.println("Altura (m) ? ");
        double height = in.nextDouble();
        in.nextLine();
        Persona p1 = new Persona(name, age, gender, weight, height);
        Persona p2 = new Persona(name, age, gender);
        Persona p3 = new Persona();
        p3.setAge(40);
        p3.setGender('M');
        p3.setHeight(1.71);
        p3.setWeight(75);
        p3.setName("Andy");

        System.out.println(p1);
        if (p1.calcularIMC() < 0) System.out.println("Esta en su peso ideal");
        else if (p1.calcularIMC() > 0) System.out.println("Tiene sobrepeso");
        else System.out.println("Esta por debajo de su peso ideal");

        System.out.println(p2);
        if (p2.calcularIMC() < 0) System.out.println("Esta en su peso ideal");
        else if (p2.calcularIMC() > 0) System.out.println("Tiene sobrepeso");
        else System.out.println("Esta por debajo de su peso ideal");

        System.out.println(p3);
        if (p3.calcularIMC() < 0) System.out.println("Esta en su peso ideal");
        else if (p3.calcularIMC() > 0) System.out.println("Tiene sobrepeso");
        else System.out.println("Esta por debajo de su peso ideal");
        
        in.close();
    }
}


//
//
//
//
//
//
//        Crearemos una subclase llamada Lavadora con las siguientes caracter??sticas:
//
//        Su atributo es carga, adem??s de los atributos heredados.
//        Por defecto, la carga es de 5 kg. Usa una constante para ello.
//        Los constructores que se implementar??n ser??n:
//
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//
//        Los m??todos que se implementara ser??n:
//        M??todo get de carga.
//        precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 ???, sino es as?? no se incrementara el precio. Llama al m??todo padre y a??ade el c??digo necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico tambi??n deben afectar al precio.
//
//        Crearemos una subclase llamada Television con las siguientes caracter??sticas:
//
//        Sus atributos son resoluci??n (en pulgadas) y sintonizador TDT (booleano), adem??s de los atributos heredados.
//        Por defecto, la resoluci??n ser?? de 20 pulgadas y el sintonizador ser?? false.
//        Los constructores que se implementar??n ser??n:
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la resoluci??n, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//
//        Los m??todos que se implementara ser??n:
//        M??todo get de resoluci??n y sintonizador TDT.
//        precioFinal(): si tiene una resoluci??n mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 ???. Recuerda que las condiciones que hemos visto en la clase Electrodomestico tambi??n deben afectar al precio.
//
//        Ahora crea una clase ejecutable que realice lo siguiente:
//
//        Crea un array de Electrodomesticos de 10 posiciones.
//        Asigna a cada posici??n un objeto de las clases anteriores con los valores que desees.
//        Ahora, recorre este array y ejecuta el m??todo precioFinal().
//        Deber??s mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora tambi??n son electrodom??sticos). Recuerda el uso operador instanceof.
//
//        Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisi??n de 500, el resultado final sera de 1000 (300+200+500) para electrodom??sticos, 200 para lavadora y 500 para televisi??n.
//
//
//        Crear una clase llamada Serie con las siguientes caracter??sticas:
//        Sus atributos son t??tulo, numero de temporadas, entregado, g??nero y creador.
//        Por defecto, el n??mero de temporadas es de 3 temporadas y entregado false. El resto de atributos ser??n valores por defecto seg??n el tipo del atributo.
//        Los constructores que se implementar??n ser??n:
//        Un constructor por defecto.
//        Un constructor con el titulo y creador. El resto por defecto.
//        Un constructor con todos los atributos, excepto de entregado.
//
//        Los m??todos que se implementara ser??n:
//
//        M??todos get de todos los atributos, excepto de entregado.
//        M??todos set de todos los atributos, excepto de entregado.
//        Sobrescribe los m??todos toString.
//
//        Crearemos una clase Videojuego con las siguientes caracter??sticas:
//
//        Sus atributos son titulo, horas estimadas, entregado, genero y compa??ia.
//        Por defecto, las horas estimadas ser??n de 10 horas y entregado false. El resto de atributos ser??n valores por defecto seg??n el tipo del atributo.
//        Los constructores que se implementaran ser??n:
//        Un constructor por defecto.
//        Un constructor con el titulo y horas estimadas. El resto por defecto.
//        Un constructor con todos los atributos, excepto de entregado.
//        Los m??todos que se implementara ser??n:
//        M??todos get de todos los atributos, excepto de entregado.
//        M??todos set de todos los atributos, excepto de entregado.
//        Sobrescribe los m??todos toString.
//        Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en com??n, por eso vamos a hacer una interfaz llamada Entregable con los siguientes m??todos:
//
//        entregar(): cambia el atributo prestado a true.
//        devolver(): cambia el atributo prestado a false.
//        isEntregado(): devuelve el estado del atributo prestado.
//        M??todo compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como par??metro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
//
//        Implementa los anteriores m??todos en las clases Videojuego y Serie. Ahora crea una aplicaci??n ejecutable y realiza lo siguiente:
//
//        Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
//        Crea un objeto en cada posici??n del array, con los valores que desees, puedes usar distintos constructores.
//        Entrega algunos Videojuegos y Series con el m??todo entregar().
//        Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devu??lvelos.
//        Por ??ltimo, indica el Videojuego tiene m??s horas estimadas y la serie con mas temporadas. Mu??stralos en pantalla con toda su informaci??n (usa el m??todo toString()).
//
