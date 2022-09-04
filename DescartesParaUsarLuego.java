//Material de Bienvenida-> Welcome
 texto = textfield1.getText().trim();
       if(texto.equals("")){
         JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
       } else {
         Licencia ventanalicencia = new Licencia();
         ventanalicencia.setBounds(0,0,600,360);
         ventanalicencia.setVisible(true);
         ventanalicencia.setResizable(false);
         ventanalicencia.setLocationRelativeTo(null);
         this.setVisible(false);
       }

//Material de Licencia-> License  
         Bienvenida ventanaBienvenida = new Bienvenida();
         nombre = ventanaBienvenida.texto;  
         --------------------------------
         public void stateChanged(ChangeEvent e){
            if(check1.isSelected() == true){
               boton1.setEnabled(true);
               boton2.setEnabled(false);
            } else {
               boton1.setEnabled(false);
               boton2.setEnabled(true);
            }
         ----------------------------------
         public void actionPerformed(ActionEvent e){
            if(e.getSource() == boton1){
                Principal ventanaPrincipal = new Principal();
                ventanaPrincipal.setBounds(0,0,640,535);
                ventanaPrincipal.setVisible(true);
                ventanaPrincipal.setResizable(false);
                ventanaPrincipal.setLocationRelativeTo(null);
                this.setVisible(false);
            } else if(e.getSource() == boton2){
                Bienvenida ventanabienvenida = new Bienvenida();
                ventanabienvenida.setBounds(0,0,350,450);
                ventanabienvenida.setVisible(true);
                ventanabienvenida.setResizable(false);
                ventanabienvenida.setLocationRelativeTo(null);
                this.setVisible(false);   
            } 
            ---------------------------------------------
//Material de Principal-> Maine
                setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
                Bienvenida ventanaBienvenida = new Bienvenida();
                nombreAdministrador = Bienvenida.texto;
                -----------------------------------------

                public void actionPerformed(ActionEvent e){
                  if(e.getSource() == miCalculo){
          
                      String nombreEmpleado = txtNombreEmpleado.getText();
                      String APaternoEmpleado = txtAPaternoEmpleado.getText();
                      String AMaternoEmpleado = txtAMaternoEmpleado.getText();
                      String Departamento = comboDepartamento.getSelectedItem().toString();
                      String Antiguedad = comboAntiguedad.getSelectedItem().toString();
                        
                  if(nombreEmpleado.equals(" ") || APaternoEmpleado.equals(" ") || AMaternoEmpleado.equals(" ") || Departamento.equals(" ") || Antiguedad.equals(" ")){
          
                      JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
          
                  }else{
                      Licencia ventanalicencia = new Licencia();
                      ventanalicencia.setBounds(0,0,600,360);
                      ventanalicencia.setVisible(true);
                      ventanalicencia.setResizable(false);
                      ventanalicencia.setLocationRelativeTo(null);
                      this.setVisible(false);
                          
                  if(Departamento.equals("Atencion al cliente")){
                  
                  } 
                  if(Antiguedad.equals("1 anio de servicio")){
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 6 dias de Licencia.");
                  }
                  if(Antiguedad.equals("2 a 6 anios de servicio")){
                     textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                     "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                     "\n recibe 14 dias de Licencia.");
                  }
                  if(Antiguedad.equals("7 anios o mas de servicio")){
          
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 20 dias de Licencia.");
                                      
                  }
                  if(Departamento.equals("Departamento de Logistica")){
                  
                  if(Antiguedad.equals("1 anio de servicio")){
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 7 dias de Licencia.");
                  }
                  if(Antiguedad.equals("2 a 6 anios de servicio")){
                     textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                     "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                     "\n recibe 15 dias de Licencia.");
                  }
                  if(Antiguedad.equals("7 o mas anios de servicio")){
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 22 dias de Licencia.");
                      }
                  }
                  if(Departamento.equals("Departamento de Gerencia")){
                  
                  
                  if(Antiguedad.equals("1 anio de servicio")){
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 10 dias de Licencia.");
                  }
                  if(Antiguedad.equals("2 a 6 anios de servicio")){
                     textarea1.setText("\n El Empleado" + nombreEmpleado + "" + APaternoEmpleado + "" + AMaternoEmpleado +
                                     "\n quien Trabaja en el" + Departamento + "con " + Antiguedad +
                                     "\n recibe 20 dias de Licencia.");
                  }
                  if(Antiguedad.equals("7 o mas anios de servicio")){
                      textarea1.setText("\n El Empleado" + nombreEmpleado + " " + APaternoEmpleado + " " + AMaternoEmpleado +
                                      "\n quien Trabaja en el" + Departamento + " con " + Antiguedad +
                                      "\n recibe 30 dias de Licencia.");
                        }
                      }
                    }
                    -----------------
                    getContentPane().setBackground(new Color(255,0,0));
                    -----------------
                    getContentPane().setBackground(new Color(0,0,0));
                    -----------------
                    getContentPane().setBackground(new Color(51,0,51));
        ------------------------------------------
      }
      if(e.getSource() == miNuevo){
          txtNombreEmpleado.setText("");
          txtAPaternoEmpleado.setText("");
          txtAMaternoEmpleado.setText("");
          comboDepartamento.setSelectedIndex(0);
          comboAntiguedad.setSelectedIndex(0);
          textarea1.setText("\n Aqui aparece el resultado del calculo de la Licencia."); 
      
      }
      if(e.getSource() == miSalir){

          Bienvenida ventanaBienvenida = new Bienvenida();
          ventanaBienvenida.setBounds(0,0,350,450);
          ventanaBienvenida.setVisible(true);
          ventanaBienvenida.setResizable(false);
          ventanaBienvenida.setLocationRelativeTo(null);
          this.setVisible(false);
          ----------------------------
          
          extracted();
          -------------------------
         }
         private void extracted() {
             JOptionPane.showMessageDialog(null, "Desarrollado por Jhon Alassio \n" + " https://github.com/JohnAlassio");
         }
    