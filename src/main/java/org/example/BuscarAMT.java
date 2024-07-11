package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BuscarAMT {
    public JPanel MainPanel;
    private JTextField ingreseLaPlacaDelTextField;
    private JButton buscarButton;
    private JLabel placaT;
    private JLabel marcaT;
    private JLabel cilindrajeT;
    private JLabel combustibleT;
    private JLabel colorT;
    private JLabel propietarioT;
    private JLabel Error;
    String url="jdbc:mysql://localhost:3306/AMT";
    String user="root";
    String password="123456";

    public BuscarAMT() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("Conexion exitosa");
                    String query="select * from vehiculos24A where placa= '"+ingreseLaPlacaDelTextField.getText()+"'";
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);

                    while(resultSet.next()){
                       placaT.setText(resultSet.getString("placa"));
                       marcaT.setText(resultSet.getString("marca"));
                       cilindrajeT.setText(resultSet.getString("cilindraje"));
                       combustibleT.setText(resultSet.getString("Tipo_combustible"));
                       colorT.setText(resultSet.getString("color"));
                       propietarioT.setText(resultSet.getString("propietario"));
                       Error.setText("");
                    }
                    if(propietarioT.getText()=="¨¨"){
                        Error.setText("------ERROR NO EXISTE ESTE VEHICULO------");
                    }


                }
                catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
    }
}
