import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1;
  public static String texto = ""; //Esta variable ayuda a que otra interfaz pueda utilizar su dato guardado en ella//
  public Welcome(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);//para evitar a los demonios.>
    setTitle("John Alassio les da la bienvenida al programa");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(150,25,250,150);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(130,200,300,30);
    label2.setFont(new Font("Andale Mono", 3, 20));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre completo");
    label3.setBounds(160,280,300,30);
    label3.setFont(new Font("Andale Mono", 4, 18));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("2022 The Coca-Cola Company");
    label4.setBounds(190,480,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(125,310,300,30);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(255,0,0));
    add(textfield1);

    boton1 = new JButton("Acceder");
    boton1.setBounds(150,420,250,30);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);
  }

//Ahora recuperamos el dato de JTextFile y lo alojamos en la variable texto.>
   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
      texto = textfield1.getText().trim();
      //si la variable esta vacia, debe enviar una alerta.>
       if(texto.equals("")){
         JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
       }else {
        License ventanalicense = new License();
        ventanalicense.setBounds(0,0,700,550);
        ventanalicense.setVisible(true);
        ventanalicense.setResizable(false);
        ventanalicense.setLocationRelativeTo(null);
        this.setVisible(false);//Esto es para que al saltar la interfaz de License no salgan al mismo tiempo sino que una sustitulla a la otra con un booleano.>
        }
      }
    }

  public static void main(String args[]){
    Welcome ventanawelcome = new Welcome();
    ventanawelcome.setBounds(0,0,550,650);
    ventanawelcome.setVisible(true);
    ventanawelcome.setResizable(false);
    ventanawelcome.setLocationRelativeTo(null);
  }
}