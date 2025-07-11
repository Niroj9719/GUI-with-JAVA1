import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI{
    public ArrayList<Store> storelist=new ArrayList<>();
    public void main(String[]args){
        //creating JFrame
        JFrame frame=new JFrame("GUI");
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLayout(null);

        //creating JLabel and JTextfield 
        JLabel label=new JLabel("Store id");
        label.setBounds(50,50,100,30);
        frame.add(label);
        
        JTextField textfield=new JTextField();
        textfield.setBounds(150,50,140,25);
        frame.add(textfield);
        
        JLabel label1=new JLabel("Store name");
        label1.setBounds(50,100,100,30);
        frame.add(label1);
        
        JTextField textfield1=new JTextField();
        textfield1.setBounds(150,100,140,25);
        frame.add(textfield1);
        
        JLabel label2=new JLabel("Location");
        label2.setBounds(50,150,100,30);
        frame.add(label2);
        
        JTextField textfield2=new JTextField();
        textfield2.setBounds(150,150,140,25);
        frame.add(textfield2);
        
        JLabel label3=new JLabel("Opening hour");
        label3.setBounds(50,200,100,30);
        frame.add(label3);
        
        JTextField textfield3=new JTextField();
        textfield3.setBounds(150,200,140,25);
        frame.add(textfield3);
        
        JLabel label4=new JLabel("Total sales");
        label4.setBounds(50,250,100,30);
        frame.add(label4);
        
        JTextField textfield4=new JTextField();
        textfield4.setBounds(150,250,140,25);
        frame.add(textfield4);
    
        JLabel label5=new JLabel("Total discount");
        label5.setBounds(50,300,100,30);
        frame.add(label5);
        
        JTextField textfield5=new JTextField();
        textfield5.setBounds(150,300,140,25);
        frame.add(textfield5);
        
        JLabel label6=new JLabel("Product name");
        label6.setBounds(50,350,100,30);
        frame.add(label6);
        
        JTextField textfield6=new JTextField();
        textfield6.setBounds(150,350,140,25);
        frame.add(textfield6);
        
        JLabel label7=new JLabel("Marked price");
        label7.setBounds(50,400,100,30);
        frame.add(label7);
        
        JTextField textfield7=new JTextField();
        textfield7.setBounds(150,400,140,25);
        frame.add(textfield7);

        //creating button
        JButton button=new JButton("Add a department");
        button.setBounds(100,550,200,35);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //try and catch
                try{
                    int storeID= Integer.parseInt(textfield.getText());
                    String storeName = textfield1.getText();
                    String location = textfield2.getText();
                    String openingHour = textfield3.getText();
                    double totalSales = Double.parseDouble(textfield4.getText());
                    double totalDiscount = Double.parseDouble(textfield5.getText());
                    String productName = textfield6.getText();
                    double markedPrice = Double.parseDouble(textfield7.getText());
                    
                    Department department = new Department(storeID, storeName, location, openingHour,totalSales,totalDiscount,productName,markedPrice);
                    storelist.add(department);
                    
                    JOptionPane.showMessageDialog(frame,"Department added successfully.");
                    
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Please enter valid integers.","Input error",JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
        });
        frame.add(button);
        
        JLabel label8=new JLabel("VAT inclusive price");
        label8.setBounds(450,50,150,30);
        frame.add(label8);
        
        JTextField textfield8=new JTextField();
        textfield8.setBounds(580,50,150,25);
        frame.add(textfield8);
        
        JLabel label10=new JLabel("Is payment online");
        label10.setBounds(450,100,150,30);
        frame.add(label10);
        
        //creating JCheckBox
        JCheckBox checkbox=new JCheckBox();
        checkbox.setBounds(600,100,100,30);
        frame.add(checkbox);
        
        
        JLabel label11=new JLabel("Purchased Year");
        label11.setBounds(450,150,150,30);
        frame.add(label11);
        
        String[] year={"2020","2021","2022"};
        JComboBox combobox=new JComboBox(year);
        combobox.setBounds(580,150,90,40);
        frame.add(combobox);
        
        JButton button1=new JButton("Add a retailer");
        button1.setBounds(500,550,200,35);
        button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            //try and catch
            try{
                int storeId = Integer.parseInt(textfield.getText());
                String storeName = textfield1.getText();
                String location = textfield2.getText();
                String openingHour = textfield3.getText();
                double totalSales = Double.parseDouble(textfield4.getText());
                double totalDiscount = Double.parseDouble(textfield5.getText());
                int vatInclusivePrice = Integer.parseInt(textfield8.getText());
                boolean isPaymentOnline = checkbox.isSelected();
                String purchasedYear = (String) combobox.getSelectedItem();
                Retailer retailer = new Retailer(storeId, storeName, location, openingHour, totalSales,totalDiscount,vatInclusivePrice,isPaymentOnline,purchasedYear);
                storelist.add(retailer);
                JOptionPane.showMessageDialog(frame,"Retailer added successfully.");
            
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Please,enter valid integers.","Input error",JOptionPane.ERROR_MESSAGE);
                
            }
    
            }
        });
        frame.add(button1);
                
        JLabel label12=new JLabel("isinsales");
        label12.setBounds(800,50,150,30);
        frame.add(label12);
        //creating JCheckox
        JCheckBox checkbox1=new JCheckBox();
        checkbox1.setBounds(900,50,100,30);
        frame.add(checkbox1);
        
    
        JLabel label13=new JLabel("Selling price");
        label13.setBounds(800,100,150,30);
        frame.add(label13);
        
        JTextField textfield13=new JTextField();
        textfield13.setBounds(900,100,150,25);
        frame.add(textfield13);
        
        
        JLabel label14=new JLabel("Loyalty point");
        label14.setBounds(800,150,100,30);
        frame.add(label14);
        
        JTextField textfield14=new JTextField();
        textfield14.setBounds(900,150,150,25);
        frame.add(textfield14);
        
        
        JButton button2=new JButton("Calculate Discount Price");
        button2.setBounds(900,550,200,35);
        button2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                int storeId=Integer.parseInt(textfield.getText());
                boolean isInSales=Boolean.parseBoolean(checkbox1.getText());
                for (Store store:storelist){
                    if (store.getStore_id()==storeId&& store instanceof Department){
                        Department department=(Department) store;
                        department.calculateDiscountPrice(isInSales,department.getMarked_price());
                        JOptionPane.showMessageDialog(frame,"Discount price is calculated.");
                        return;
                        
                    }
                    
                }
                JOptionPane.showMessageDialog(frame,"Please,add the department first");
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Please,add the department first");
                
            }
            
            
            
        }
        });
        frame.add(button2);
        
        
                                
    
        
        
        
        
        
        JButton button3=new JButton("Set the Loyalty point");
        button3.setBounds(1200,550,200,35);
        button3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
            try{
                int storeId = Integer.parseInt(textfield.getText());
                boolean isPaymentOnline = checkbox.isSelected();
                for(Store store:storelist){
                    if(store.getStore_id()==storeId&& store instanceof Retailer){
                        Retailer retailer=(Retailer) store;
                        retailer.loyalty(isPaymentOnline,retailer.getVat_inclusive_price());
                        textfield14.setText(String.valueOf(retailer.getLoyalty_point()));
                        JOptionPane.showMessageDialog(frame,"Loyalty point is calculated");
                        return;
                        
                    }
                }
                JOptionPane.showMessageDialog(frame,"Please,add the retailer first.");
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Please,add the retailer first.");
            }
            
        }
        });
        frame.add(button3);
        
        JButton button4=new JButton("Remove the product");
        button4.setBounds(100,650,200,35);
        button4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                int storeId=Integer.parseInt(textfield.getText());
                for(Store store:storelist){
                    if(store.getStore_id()==storeId&&store instanceof Retailer){
                        Retailer retailer=(Retailer) store;
                        retailer.remove_product();
                        JOptionPane.showMessageDialog(frame,"Product removed");
                        return;
                                           
                    }
                }
                JOptionPane.showMessageDialog(frame,"Please,add the retailer first.");
                
                
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Please,add the retailer first.");
                
            }
            
            
        }
        });
        frame.add(button4);
        
        JButton button5=new JButton("Display");
        button5.setBounds(500,650,200,35);
        button5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            for(Store store:storelist){
                JOptionPane.showMessageDialog(frame,store.toString()+"\n");
            }
        }
        });
        frame.add(button5);
        
        JButton button6=new JButton("Clear");
        button6.setBounds(900,650,200,35);
        button6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            textfield.setText("");
            textfield1.setText("");
            textfield2.setText("");
            textfield3.setText("");
            textfield4.setText("");
            textfield5.setText("");
            textfield6.setText("");
            textfield7.setText("");
            textfield8.setText("");
            checkbox.setSelected(false);
            checkbox1.setSelected(false);
            textfield13.setText("");
            textfield14.setText("");
        }
            
        });
        frame.add(button6);
    
    }
}