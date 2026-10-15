package expresionesregulares;

import java.util.List;
import javax.swing.JOptionPane;

public class ExpresionesRegulares {

    public static void main(String[] args) {

        //crear un objeto de la clase metodos
        metodos demostraciones = new metodos();

        //crear un objeto de la clase que tiene cada metodo
        regex solucion = new regex();

        //crear la lista de los formularios 
        List<Formularios> probar = solucion.obtenerTodo();//el obtenerTodo lo que hace es un llamado de la clase donde tiene reunido cada uno de los metodos 

        //MENU
        do {
            //================= MENU PRINCIPAL =================
            int opc = MenuPrincipal();
            switch (opc) {
                case 1:
                    elegirMetodo(demostraciones, probar.get(0));
                    break;

                case 2:
                    elegirMetodo(demostraciones, probar.get(1));
                    break;

                case 3:
                    elegirMetodo(demostraciones, probar.get(2));
                    break;

                case 4:
                    elegirMetodo(demostraciones, probar.get(3));
                    break;

                case 5:
                    elegirMetodo(demostraciones, probar.get(4));
                    break;
                case 6:
                    elegirMetodo(demostraciones, probar.get(5));
                    break;
                case 7:
                    elegirMetodo(demostraciones, probar.get(6));
                    break;
                case 8:
                    elegirMetodo(demostraciones, probar.get(7));
                    break;
                case 9:
                    elegirMetodo(demostraciones, probar.get(8));
                    break;
                case 10:
                    elegirMetodo(demostraciones, probar.get(9));
                    break;
                case 11:
                    elegirMetodo(demostraciones, probar.get(10));
                    break;
                case 12:
                    elegirMetodo(demostraciones, probar.get(11));
                    break;
                case 13:
                    elegirMetodo(demostraciones, probar.get(12));
                    break;
                case 14:
                    elegirMetodo(demostraciones, probar.get(13));
                    break;
                case 15:
                    elegirMetodo(demostraciones, probar.get(14));
                    break;
                case 16:
                    elegirMetodo(demostraciones, probar.get(15));
                    break;
                case 17:
                    elegirMetodo(demostraciones, probar.get(16));
                    break;
                case 18:
                    elegirMetodo(demostraciones, probar.get(17));
                    break;
                case 19:
                    elegirMetodo(demostraciones, probar.get(18));
                    break;
                case 20:
                    elegirMetodo(demostraciones, probar.get(19));
                    break;
                case 21:
                    elegirMetodo(demostraciones, probar.get(20));
                    break;

                case 0:
                    System.out.println("Salir del programa");
                    System.exit(0);
                    break;

                default:
                    System.out.println("opcion incorrecta");
            }
        } while (true);
    }//Este corchete cierra todo

    //MENU de los metodos 
    public static void elegirMetodo(metodos demostraciones, Formularios p) {
        int opc;
        do {
            //================= MENU METODOS =================
            opc = MenuMetodos();
            switch (opc) {
                case 1:
                    demostraciones.Matches(p);
                    break;

                case 2:
                    demostraciones.LookingAt(p);
                    break;

                case 3:
                    demostraciones.Find(p);
                    break;

                case 4:
                    demostraciones.ReplaceAll(p);
                    break;
                case 5:
                    demostraciones.Split(p);
                    break;
                case 6:
                    demostraciones.ReplaceFirst(p);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("opcion incorrecta");
            }
        } while (true);
    }//Este corchete cierra todo

    public static int MenuPrincipal() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog(
                "══════════════════════════════════════\n"
                + "             ♦ MENÚ PRINCIPAL ♦\n"
                + "══════════════════════════════════════\n\n"
                + "  1.  ➤  Placas de carro en Colombia\n"
                + "  2.  ➤  Códigos postales para Medellín\n"
                + "  3.  ➤  Números de teléfonos fijos en Medellín\n"
                + "  4.  ➤  Números de teléfonos celulares en Colombia\n"
                + "  5.  ➤  Direcciones de correo electrónico\n"
                + "  6.  ➤  Fecha en formato dd/mm/aaaa\n"
                + "  7.  ➤  Hora en formato de 24 horas hh:mm:ss\n"
                + "  8.  ➤  Hora en formato de 12 horas hh:mm:ss\n"
                + "  9.  ➤  Declaración de variables en Java\n"
                + "10.  ➤  URL\n"
                + "11.  ➤  Código ISBN\n"
                + "12.  ➤  Código de barras en Colombia\n"
                + "13.  ➤  Nombres y apellidos\n"
                + "14.  ➤  Contraseña segura\n"
                + "15.  ➤  Estructura de un ciclo for\n"
                + "16.  ➤  Código para representar un número double\n"
                + "17.  ➤  Leyes, decretos y artículos en Colombia\n"
                + "18.  ➤  Referencias de libros impresos en normas IEEE\n"
                + "19.  ➤  Referencias de libros impresos en normas APA\n"
                + "20.  ➤  Precios de productos\n"
                + "21.  ➤  Diptongos e hiatos\n"
                + "──────────────────────────────────────\n"
                + "  0.  ✖  Salir\n"
                + "══════════════════════════════════════\n\n"
                + "Ingrese una opción:"));
        return opc;
    }//cierre de menu

    public static int MenuMetodos() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog(
                "══════════════════════════\n"
                + "     ♦ MENÚ DE MÉTODOS ♦\n"
                + "══════════════════════════\n\n"
                + "  1.  ➤  Matches\n"
                + "  2.  ➤  LookingAt\n"
                + "  3.  ➤  Find\n"
                + "  4.  ➤  ReplaceAll\n"
                + "  5.  ➤  Split\n"
                + "  6.  ➤  ReplaceFirst\n"
                + "──────────────────────────\n"
                + "  0.  ✖  Volver al menú principal\n"
                + "══════════════════════════\n\n"
                + "Ingrese una opción:"));
        return opc;
    }//cierre de menu

}//fin del metodo
