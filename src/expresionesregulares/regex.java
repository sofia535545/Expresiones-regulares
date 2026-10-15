package expresionesregulares;

import java.util.List;
import java.util.ArrayList;

public class regex {

    public List<Formularios> obtenerTodo() {
        List<Formularios> lista = new ArrayList<>();
        lista.add(placas());
        lista.add(codigoPostal());
        lista.add(telefonoFijo());
        lista.add(telefonoCelular());
        lista.add(correo());
        lista.add(fecha());
        lista.add(hora24());
        lista.add(hora12());
        lista.add(declaracionVariables());
        lista.add(URL());
        lista.add(ISBN());
        lista.add(codigoBarras());
        lista.add(nombres());
        lista.add(contraseñaSegura());
        lista.add(cicloFor());
        lista.add(numeroDouble());
        lista.add(leyes_Decretos_Articulos());
        lista.add(librosIEEE());
        lista.add(librosAPA());
        lista.add(precioProductos());
        lista.add(dictongos_hiatos());
        return lista;
    }

    private Formularios placas() {
        //crear objeto
        Formularios ficha = new Formularios();

        //nombre 
        ficha.setNombre("Placas de carros en Colombia");
        //regex
        ficha.setRegex("[A-Z]{3}-[0-9]{3}");
        //valido
        ficha.setValido(new String[]{"ABZ-788", "ACV-569"});
        //invalido
        ficha.setInvalido(new String[]{"abc-123", "AB-156", "ABC-12"});
        //texto prueba
        ficha.setPrueba("En el parqueadero quedaron registrados tres vehículos: el automóvil particular con placa ABC-123, la camioneta de servicio público STU-456 y la motocicleta XYZ-89A");
        //reemplazo
        ficha.setReemplazo("*CVF-490*");
        return ficha;
    }

    private Formularios codigoPostal() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Códigos postales para Medellín");
        //regex
        ficha.setRegex("0500[0-4][0-9]");
        //valido
        ficha.setValido(new String[]{"050012", "050021", "050031"});
        //invalido
        ficha.setInvalido(new String[]{"020012", "05002", "0500236"});
        //texto prueba
        ficha.setPrueba("Para enviar los paquetes en Medellín, debes usar el código 050015 para el Centro, 050021 para El Poblado y 050034 para Laureles");
        //reemplazo
        ficha.setReemplazo("*050023*");
        return ficha;
    }

    private Formularios telefonoFijo() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Números de teléfonos fijos en Medellín");
        //regex
        ficha.setRegex("604(\\s|\\-)[2-8][0-9]{2}(\\s|\\-)([0-9][0-9]){2}");
        //valido
        ficha.setValido(new String[]{"604 444 1234", "604-278-0915", "604-312 3020"});
        //invalido
        ficha.setInvalido(new String[]{"601 444 1234", "278 0914", "604-147 8963"});
        //texto prueba
        ficha.setPrueba("Para comunicarte a la sede central llama al 604 444 5566, para contabilidad al 604-312-8900 y para atención al cliente al 604 235-1122");
        //reemplazo
        ficha.setReemplazo("*604-320-1220*");
        return ficha;
    }

    private Formularios telefonoCelular() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Números de teléfonos celulares en Colombia");
        //regex
        ficha.setRegex("3[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}");
        //valido
        ficha.setValido(new String[]{"313-733-71-42", "312-547-32-68"});
        //invalido
        ficha.setInvalido(new String[]{"278-123-32-28", "123-456-78-98"});
        //texto prueba
        ficha.setPrueba("El equipo de coordinadores está disponible en los móviles 310-123-45-67 (Claro), 300-987-65-43 (Tigo) y 315-456-78-90 (Movistar)");
        //reemplazo
        ficha.setReemplazo("*314-789-91-28*");
        return ficha;
    }

    private Formularios correo() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Direcciones de correo electrónico (formato general)");
        //regex
        ficha.setRegex("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?");
        //valido
        ficha.setValido(new String[]{"juan_perez123@empresa.com", "contacto-soporte@servicio.org"});
        //invalido
        ficha.setInvalido(new String[]{"usuarioejemplo.com", "@dominio.com", "usuario@dominio..com"});
        //texto prueba
        ficha.setPrueba("Remite la propuesta institucional a contacto@empresa.com.co con copia a gerencia@dominio.org y soporte@servicio.net");
        //reemplazo
        ficha.setReemplazo("*nombre.apellido@universidad.edu.co*");
        return ficha;
    }

    private Formularios fecha() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Fecha en formato dd/mm/aaaa");
        //regex
        ficha.setRegex("((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)"//dias de 31 y sus meses
                + "|(0[1-9]|[12][0-9]|30)/(0[469]|11)"//dias de 30 y sus meses
                + "|(0[1-9]|1[0-9]|2[0-8])/02)"//dias de 28 de febrero
                + "/[0-9]{4}"//año normal
                + "|29/02/([0-9]{2}(0[48]|[2468][048]|[13579][26])"//año bisiesto divisible por 4
                + "|(0[48]|[2468][048]|[13579][26])00)");//año bisiesto divisible por 400
        //valido
        ficha.setValido(new String[]{"01/01/2023", "15/06/1998", "30/04/2025"});
        //invalido
        ficha.setInvalido(new String[]{"32/01/2026", "31/04/2026", "12-10-2026"});
        //texto prueba
        ficha.setPrueba("El proyecto inicia el 01/01/2023, tendrá su revisión intermedia el 25/09/2026 y finalizará oficialmente el 15/12/2026");
        //reemplazo
        ficha.setReemplazo("*12/10/2026*");
        return ficha;
    }

    private Formularios hora24() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Hora en formato de 24 horas hh:mm:ss");
        //regex
        ficha.setRegex("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        //valido
        ficha.setValido(new String[]{"14:30:00", "00:00:00", "23:59:59"});
        //invalido
        ficha.setInvalido(new String[]{"24:00:00", "14:60:00", "14.30.00"});
        //texto prueba
        ficha.setPrueba("La jornada laboral arranca a las 08:00:00, el receso de almuerzo es a las 12:30:00 y el cierre operativo a las 17:15:00");
        //reemplazo
        ficha.setReemplazo("*08:05:09*");
        return ficha;
    }

    private Formularios hora12() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Hora en formato de 12 horas hh:mm:ss");
        //regex
        ficha.setRegex("(0[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9]\\s(AM|PM)");
        //valido
        ficha.setValido(new String[]{"02:30:00 AM", "02:30:00 PM", "12:00:00 PM"});
        //invalido

        ficha.setInvalido(new String[]{"00:15:30 AM", "13:30:00 PM", "02:30:00"});
        //texto prueba
        ficha.setPrueba("La primera reunión es a las 08:30:00 AM, la cita médica a las 02:15:00 PM y el vuelo sale a las 10:45:00 PM");
        //reemplazo
        ficha.setReemplazo("*08:05:09 AM*");
        return ficha;
    }

    private Formularios declaracionVariables() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Declaración de variables en Java");
        //regex
        ficha.setRegex("(byte|short|int|long|float|double|char|boolean|String)\\s[A-Za-z][A-Za-z0-9]*(\\s?=\\s?[A-Za-z0-9.']+)?;");
        //valido
        ficha.setValido(new String[]{"int contador = 0;", "float descuento = 0.15f;", "long total;"});
        //invalido
        ficha.setInvalido(new String[]{"int 2contador = 0;", "int contador = 0", "entero contador = 0;"});
        //texto prueba
        ficha.setPrueba("En el método principal inicialicé tres variables: int contador = 0;, double promedio = 4.5; y boolean esValido = true;");
        //reemplazo
        ficha.setReemplazo("*char letra = 'a';*");
        return ficha;
    }

    private Formularios URL() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("URL (formato general)");
        //regex
        ficha.setRegex("(http://|https://)(www\\.)?[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}(:[0-9]{1,5})?(/[A-Za-z0-9._-]+)*/?");
        //valido
        ficha.setValido(new String[]{"https://google.com", "http://ejemplo.com:8080/carpeta/pagina.html", "https://ejemplo.com/noticias/"});
        //invalido
        ficha.setInvalido(new String[]{"https://googlecom", "www.google.com", "https://google.com//inicio"});
        //texto prueba
        ficha.setPrueba("Puedes consultar las bases del concurso en https://www.ejemplo.gov.co o descargar el formulario en http://subdominio.portal.edu.co/documentos/form.pdf.");
        //reemplazo
        ficha.setReemplazo("*https://www.udea.edu.co/inicio*");
        return ficha;
    }

    private Formularios ISBN() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Código ISBN");
        //regex
        ficha.setRegex("ISBN-13:?\\s(978|979)-[0-9]{2}-[0-9]{3}-[0-9]{4}-[0-9]"
             + "|ISBN-10:?\\s[0-9]{2}-[0-9]{3}-[0-9]{4}-[0-9X]");
        //valido
        ficha.setValido(new String[]{"ISBN-10 0-321-53496-4", "ISBN-10 968-16-5085-X", "ISBN-13: 978-0-321-53496-5"});
        //invalido
        ficha.setInvalido(new String[]{"ISBN-10 0-321-53496-A", "ISBN-13 878-0-321-53496-5", "978-0-321-53496-5"});
        //texto prueba
        ficha.setPrueba("La obra cuenta con registro ISBN-10: 958-42-0000-1 para su versión de bolsillo y ISBN-13: 978-958-42-0000-0 para la edición de lujo");
        //reemplazo
        ficha.setReemplazo("*978-3-16-148410-0*");
        return ficha;
    }

    private Formularios codigoBarras() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Código de barras en Colombia");
        //regex
        ficha.setRegex("(770|771)([0-9]{4}[0-9]{5}|[0-9]{5}[0-9]{4}|[0-9]{6}[0-9]{3}|[0-9]{7}[0-9]{2})[0-9]");
        //valido
        ficha.setValido(new String[]{"7701234567897", "7710000000015", "7709999888875"});
        //invalido
        ficha.setInvalido(new String[]{"7801234567897", "770 1234 56789 7", "770123456789"});
        //texto prueba
        ficha.setPrueba("La caja del lote contiene productos nacionales con códigos EAN-13 7701234567890, 7709876543210 y 7700001112223");
        //reemplazo
        ficha.setReemplazo("*7719876543212*");
        return ficha;
    }

    private Formularios nombres() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Nombres y apellidos con tildes y 'ñ'");
        //regex
        ficha.setRegex("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+(\\s(de\\s|del\\s|de\\sla\\s)?[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+)+");
        //valido
        ficha.setValido(new String[]{"Alejandra Roque", "María del Carmen", "Angie Sofia Giron"});
        //invalido
        ficha.setInvalido(new String[]{"María123", "-Carlos", "Lucía  Gómez"});
        //texto prueba
        ficha.setPrueba("Los autores del informe final son los investigadores René Bermeño, María José Peña y Héctor Córdova");
        //reemplazo
        ficha.setReemplazo("*María José Pérez*");
        return ficha;
    }

    private Formularios contraseñaSegura() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Contraseña segura");
        //regex
        ficha.setRegex("(?=\\S*[A-Z])(?=\\S*[a-z])(?=\\S*[0-9])(?=\\S*[@#$%&*!?._-])[A-Za-z0-9@#$%&*!?._-]{8,20}");
        //valido
        ficha.setValido(new String[]{"Clave2026!", "Medellin#45", "!Hola123"});
        //invalido
        ficha.setInvalido(new String[]{"clave2026!", "Clave 2026!", "Contraseña2026!"});
        //texto prueba
        ficha.setPrueba("Para proteger los tres niveles de acceso se asignaron las claves P@ssw0rd2026!, Seguridad#9876$ y clave123");
        //reemplazo
        ficha.setReemplazo("*aB3\\$xyzW*");
        return ficha;
    }

    private Formularios cicloFor() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Estructura de un ciclo for");
        //regex
        ficha.setRegex("(for|For)\\s?\\(((byte|short|int|long|float|double|char|boolean|String)\\s)?[a-zA-Z][a-zA-Z0-9]*\\s?=\\s?[0-9]+;\\s?" //inicializar la variable
                + "[a-zA-Z][a-zA-Z0-9]*\\s?(<|>|<=|>=|==|!=)\\s?[A-Za-z0-9]+;\\s?"//indicar la funcion a realizar
                + "[a-zA-Z][a-zA-Z0-9]*(\\+\\+|--|(\\+=|-=)[0-9]+)\\)");//aumentar
        //valido
        ficha.setValido(new String[]{"For(k=1; k<N;k++)", "for(int i=0; i<10; i++)", "for (contador=10; contador>=0; contador--)"});
        //invalido
        ficha.setInvalido(new String[]{"for(k=1; k<N; k+++)", "for(k=1, k<N, k++)", "for(k=1; k<N; k++"});
        //texto prueba
        ficha.setPrueba("Para procesar la matriz utilizamos un ciclo anidado con for (k = 1; k < N; k++) para las filas y for (int j = 0; j < M; j++) para las columnas");
        //reemplazo
        ficha.setReemplazo("*for (contador=10; contador>=0; contador++)*");
        return ficha;
    }

    private Formularios numeroDouble() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre(" Código para representar un número double");
        //regex
        ficha.setRegex("(\\-|\\+)?[0-9]+\\.[0-9]+([eE](\\-|\\+)?[0-9]+)?[dD]?");
        //valido
        ficha.setValido(new String[]{"3.14159", "-2.5", "2.0E-4", "1.5e3D"});
        //invalido
        ficha.setInvalido(new String[]{"1.5e", "3.14x", "3,14", "3.14dd"});
        //texto prueba
        ficha.setPrueba("El valor de PI es 3.14159, la temperatura bajó a -4.75 grados, el producto cuesta 12500.99d pesos y el estudiante tiene 20 años");
        //reemplazo
        ficha.setReemplazo("*3.14d*");
        return ficha;
    }

    private Formularios leyes_Decretos_Articulos() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Leyes, decretos y artículos en Colombia");
        //regex
        ficha.setRegex("(Ley|Decreto)\\s[0-9]{1,4}\\sde\\s[0-9]{4}|(Articulo|Artículo|Art\\.)\\s[0-9]+");
        //valido
        ficha.setValido(new String[]{"Ley 1581 de 2012", "Decreto 1072 de 2015", "Artículo 15"});
        //invalido
        ficha.setInvalido(new String[]{"Ley 1581 del 12", "Decreto 1072 de 201", "Artículo -5"});
        //texto prueba
        ficha.setPrueba("La normativa ambiental exige el cumplimiento del Artículo 79 constitucional y la Ley 99 de 1993");
        //reemplazo
        ficha.setReemplazo("*Ley 100 de 1993, Art. 157*");
        return ficha;
    }

    private Formularios librosIEEE() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Referencias de libros impresos en normas IEEE");
        //regex
        ficha.setRegex("\\[[0-9]+\\]\\s([A-Z]\\.\\s)+[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+"//numero y primer autor
                + "((,\\s|\\sand\\s|,\\sand\\s|\\sy\\s|,\\sy\\s)([A-Z]\\.\\s)+[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+)*,\\s"//mas autores
                + "'[^']+',\\s[0-9]+(st|nd|rd|th)\\sed\\.\\s"//titulo y edicion
                + "[A-ZÁÉÍÓÚÑ][A-Za-záéíóúñ ]*(,\\s[A-ZÁÉÍÓÚÑ][A-Za-záéíóúñ ]*)*:\\s"//ciudad y pais
                + "[A-Za-záéíóúÁÉÍÓÚÑñ0-9&\\s-]+,\\s[0-9]{4}\\.");//editorial y año
        //valido
        ficha.setValido(new String[]{"[1] R. C. Dorf and J. A. Svoboda, 'Circuits, Devices and Systems', 9th ed. Hoboken, NJ, USA: John Wiley & Sons, 2014.",
            "[2] S. Haykin, 'Adaptive Filter Theory', 4th ed. Upper Saddle River, NJ, USA: Prentice Hall, 2002."});
        //invalido
        ficha.setInvalido(new String[]{"[1] Richard C. Dorf y James A. Svoboda. Circuits, Devices and Systems. John Wiley & Sons, 2014.",
            "[2] S. Haykin, Adaptive Filter Theory. Upper Saddle River: Prentice Hall, 2002."});
        //texto prueba
        ficha.setPrueba("Para la revisión bibliográfica se citaron: [1] R. C. Hibbeler, 'Mecánica vectorial para ingenieros', 12th ed. México: Pearson, 2010. y [2] J. K. Rowling, Harry Potter, Bogotá: Planeta, 1999");
        //reemplazo
        ficha.setReemplazo("*[4] B. P. Lathi, 'Modern Digital and Analog Communication Systems', 3rd ed. New York, NY, USA: Oxford University Press, 1998.*");
        return ficha;
    }

    private Formularios librosAPA() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Referencias de libros impresos en normas APA");
        //regex
        ficha.setRegex("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+,\\s[A-ZÁÉÍÓÚÑ]\\.(\\s[A-ZÁÉÍÓÚÑ]\\.)*"//autor principal
                + "(,\\s((&|y)\\s)?[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+,\\s[A-ZÁÉÍÓÚÑ]\\.(\\s[A-ZÁÉÍÓÚÑ]\\.)*)*" //mas autores
                + "\\s\\([0-9]{4}\\)\\.\\s" //año
                + "\\*[^*]+\\*(\\s\\([0-9]+(st|nd|rd|th|\\.ª|a)\\sed\\.\\))?\\.\\s"//titulo y edicion
                + "[A-Za-záéíóúÁÉÍÓÚÑñ0-9&\\s-]+\\.");//editorial
        //valido
        ficha.setValido(new String[]{"Dorf, R. C., & Svoboda, J. A. (2014). *Circuits, devices and systems* (9th ed.). John Wiley & Sons.",
            "Haykin, S. (2002). *Adaptive filter theory* (4th ed.). Prentice Hall."});
        //invalido
        ficha.setInvalido(new String[]{"[1] R. C. Dorf, & J. A. Svoboda (2014). *Circuits, devices and systems*. John Wiley & Sons.",
            "Haykin, S. (2002). Adaptive filter theory. Prentice Hall."});
        //texto prueba
        ficha.setPrueba("En la bibliografía se incluyeron: Hibbeler, R. C. (2010). *Mecánica vectorial para ingenieros* (12a ed.). Pearson. y García Márquez, G. (1967). Cien años de soledad. Editorial Sudamericana");
        //reemplazo
        ficha.setReemplazo("*Tanenbaum, A. S., & Wetherall, D. J. (2011). *Computer networks* (5th ed.). Pearson.*");
        return ficha;
    }

    private Formularios precioProductos() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Precios de productos");
        //regex
        ficha.setRegex("(\\$\\s?)?[0-9]{1,3}(\\.[0-9]{3})*(,[0-9]{2})?");
        //valido
        ficha.setValido(new String[]{"49,99", "$ 125,50", "$ 1.250.000"});
        //invalido
        ficha.setInvalido(new String[]{"-25.50", "15..99", "$15,00,50"});
        //texto prueba
        ficha.setPrueba("La canasta de compra incluyó el café de $25.500 COP, un termo reutilizable de $45.000 COP y una maleta deportiva de $120.900 COP");
        //reemplazo
        ficha.setReemplazo("*\\$ 1.100.000*");
        return ficha;

    }

    private Formularios dictongos_hiatos() {
        //crear objeto
        Formularios ficha = new Formularios();
        //nombre
        ficha.setNombre("Diptongos e hiatos.");
        //regex
        ficha.setRegex("([A-Za-zÁÉÍÓÚÑÜáéíóúñü])*"//letras antes
                + "([aeoáéó][iuü]|[iuü][aeoáéó]|iu|ui|iú|uí"//diptongos
                + "|[aeoáéó]{2}|[aeoáéó][íú]|[íú][aeoáéó])"//hiatos
                + "([A-Za-zÁÉÍÓÚÑÜáéíóúñü])*");//letras despues
        //valido
        ficha.setValido(new String[]{"ciudad", "deuda", "león", "poema", "María", "baúl"});
        //invalido
        ficha.setInvalido(new String[]{"casa", "pato", "mesa", "Luna", "123"});
        //texto prueba
        ficha.setPrueba("El poeta comió maíz en la ciudad con alegría");
        //reemplazo
        ficha.setReemplazo("*caer y triunfo*");
        return ficha;
    }
}//fin clase
