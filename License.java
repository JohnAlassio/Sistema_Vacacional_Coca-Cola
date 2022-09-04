import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

//Aqui tendra un JtextArea, que sera el principal componente al desarrollar este software, ya que las actualizaciones de los terminos o leyes de utilizacion constantemente se estaran modificando, y el JScrollPane nos ayudara en caso de que exeda los limites visibles si necesidad de modificar las dimenciones de la interfaz grafica. Y con el JCheckBox podremos tener un juego de aceptaciones o retracciones de Usuario, la cual nos llevaran a la siguiente interfaz o por lo contrario nos regresaran al no aceptar los terminos.// 

public class License extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;
  String nombre = "";//Esta variable nos ayudara a alojar el dato de la variable "texto" que esta alojada en la clase Welcome.>

  public License(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);//para evitar a los demonios.>
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Welcome ventanaWelcome = new Welcome();
    nombre = ventanaWelcome.texto;//Con esto capturamos el valor y la utiliciamos en la clase License.>
       
    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1); 

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0,10));   
    textarea1.setText("\n\n          TERMINOS Y CONDICIONES:" +
                  "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE JOHN ALASSIO." +
                  "\n          B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE LAS INTERFACES GRAFICAS." +
                  "\n          C.  JOHN ALASSIO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n        (EL AUTOR JOHN ALASSIO), NO SE RESPONSABILIZA DEL USO QUE USTED" + 
                "\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS." +
                "\n\n        PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n        SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n       PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                        "\n            https://johnalassio.github"+ 
                "\n\n\n");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(15,50,650,295);
    add(scrollpane1);   

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(10,370,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(15,400,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(125,400,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);  
    label2.setBounds(320,250,270,300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }//Esto es para la funcion de activar o desactivar los botones.>
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      Mainescreen ventanaMainescreen = new Mainescreen();
      ventanaMainescreen.setBounds(0,0,700,555);
      ventanaMainescreen.setVisible(true);
      ventanaMainescreen.setResizable(false);
      ventanaMainescreen.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if(e.getSource() == boton2){
      Welcome ventanaWelcome = new Welcome();
      ventanaWelcome.setBounds(0,0,550,650);
      ventanaWelcome.setVisible(true);
      ventanaWelcome.setResizable(false);
      ventanaWelcome.setLocationRelativeTo(null);
      this.setVisible(false); 
    }
  }

  public static void main(String args[]){
    License ventanalicense = new License();
    ventanalicense.setBounds(0,0,700,550);
    ventanalicense.setVisible(true);
    ventanalicense.setResizable(false);
    ventanalicense.setLocationRelativeTo(null);
  }
}