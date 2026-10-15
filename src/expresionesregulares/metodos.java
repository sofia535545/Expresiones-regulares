package expresionesregulares;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class metodos {

    public void obtener(Formularios p) {
        JOptionPane.showMessageDialog(null, "=====================================");
        JOptionPane.showMessageDialog(null, "Nombre: " + p.getNombre());
        JOptionPane.showMessageDialog(null, "Regex: " + p.getRegex());

        //metodos que serian para evaluar 
        Matches(p);
        LookingAt(p);
        Find(p);
        ReplaceAll(p);
        ReplaceFirst(p);
        Split(p);
    }

    //compruba que toda la cadena cumpla con la condicion 
    public void Matches(Formularios p) {
        JOptionPane.showMessageDialog(null, "---Metodo matches---");
        //obtener el regex para poder usarlo con el metodo de matches 
        String regex = p.getRegex();

        //obtener la cadena valida e invalida de las funciones 
        String[] valido = p.getValido();
        String[] invalido = p.getInvalido();

        //verificar cada uno de ellos cual cumple con su respectivo mensaje 
        //validas
        for (int i = 0; i < valido.length; i++) {
            //coger cada dato 
            String s = valido[i];
            boolean evaluar = s.matches(regex);

            //comprobar si cumple
            if (evaluar) {
                JOptionPane.showMessageDialog(null, s + " -> ¡CUMPLE!");
            } else {
                JOptionPane.showMessageDialog(null, s + " -> ¡NO CUMPLE!");
            }
        }

        //invalidas
        for (int j = 0; j < invalido.length; j++) {
            //coger cada dato 
            String x = invalido[j];
            boolean evaluar = x.matches(regex);

            //comprobar si cumple
            if (evaluar) {
                JOptionPane.showMessageDialog(null, x + " -> ¡CUMPLE!");
            } else {
                JOptionPane.showMessageDialog(null, x + " -> ¡NO CUMPLE!");
            }
        }
    }

    //comprueba que la condicion se cumpla al inicio de la cadena 
    public void LookingAt(Formularios p) {
        //crea el patron de la expresion regular
        String regex = p.getRegex();
        Pattern pattern = Pattern.compile(regex);

        // Crea el objeto matcher
        String texto = p.getPrueba();
        Matcher matcher = pattern.matcher(texto);

        // comprueba que la entrada comienza con el patron
        boolean resultado = matcher.lookingAt();
        if (resultado) {
            JOptionPane.showMessageDialog(null, "El texto inicia con la condicion");

        } else {
            JOptionPane.showMessageDialog(null, "El texto no inicia con la condicion");
        }
    }

    public void Find(Formularios p) {
        //crea el patron de la expresion regular
        String regex = p.getRegex();
        Pattern pattern = Pattern.compile(regex);

        // Crea el objeto matcher
        String texto = p.getPrueba();
        Matcher matcher = pattern.matcher(texto);

        // comprueba que la entrada comienza con el patron
        boolean resultado = matcher.find();
        if (resultado) {
            JOptionPane.showMessageDialog(null, "El texto contiene la condicion");

        } else {
            JOptionPane.showMessageDialog(null, "El texto no contiene la condicion");
        }

    }

    public void ReplaceAll(Formularios p) {
        //saca el texto 
        String texto = p.getPrueba();
        String regex = p.getRegex();
        String cambio = p.getReemplazo();

        String resultado = texto.replaceAll(regex, cambio);

        JOptionPane.showMessageDialog(null,
        "══════════ ANTES DEL CAMBIO ══════════\n"
        + texto + "\n\n"
        + "══════════ DESPUÉS DEL CAMBIO ══════════\n"
        + resultado,
        "replaceFirst()", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Split(Formularios p) {
        String texto = p.getPrueba();
        String regex = p.getRegex();

        String[] cadena = texto.split(regex);

        String mensaje = " ";
        for (int i = 0; i < cadena.length; i++) {
            mensaje = mensaje + "Pedazo " + i + ": [" + cadena[i] + "]\n";
        }

        JOptionPane.showMessageDialog(null, mensaje, "split()",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void ReplaceFirst(Formularios p) {
        //saca el texto 
        String texto = p.getPrueba();
        String regex = p.getRegex();
        String cambio = p.getReemplazo();

        String resultado = texto.replaceFirst(regex, cambio);

        JOptionPane.showMessageDialog(null,
        "══════════ ANTES DEL CAMBIO ══════════\n"
        + texto + "\n\n"
        + "══════════ DESPUÉS DEL CAMBIO ══════════\n"
        + resultado,
        "replaceFirst()", JOptionPane.INFORMATION_MESSAGE);
    }

}//fin de la clase
