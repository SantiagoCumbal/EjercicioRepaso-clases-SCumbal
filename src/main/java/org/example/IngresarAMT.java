package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class IngresarAMT {
    public JPanel MainPanel;
    private JTextField placaT;
    private JTextField marcaT;
    private JTextField cilindrajeT;
    private JTextField combustibleT;
    private JTextField colorT;
    private JTextField propietarioT;
    private JButton aceptarButton;
    private JButton cancelarButton;
    String url = "jdbc:mysql://localhost:3306/AMT";
    String user = "root";
    String password = "123456";
    String sql="INSERT INTO vehiculos24A (placa,marca,cilindraje,tipo_combustible,color,propietario) VALUES(?,?,?,?,?,?)";
    Vehiculos newV= new Vehiculos();

    public IngresarAMT() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(Connection connection = DriverManager.getConnection(url,user,password)){
                    System.out.println("Conexion exitosa");
                    newV.setPlaca(placaT.getText());
                    newV.setMarca(marcaT.getText());
                    newV.setCilindraje(Integer.parseInt(cilindrajeT.getText()));
                    newV.setTipoCombustible(combustibleT.getText());
                    newV.setColor(colorT.getText());
                    newV.setPropietario(propietarioT.getText());
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ps.setString(1,newV.getPlaca());
                    ps.setString(2,newV.getMarca());
                    ps.setInt(3,newV.getCilindraje());
                    ps.setString(4,newV.getTipoCombustible());
                    ps.setString(5,newV.getColor());
                    ps.setString(6,newV.getPropietario());
                    ps.executeUpdate();
                    System.out.println("Ingresado correctamente");

                }catch (SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placaT.setText("");
                marcaT.setText("");
                cilindrajeT.setText("");
                combustibleT.setText("");
                colorT.setText("");
                propietarioT.setText("");
            }
        });
    }
}
