import javax.swing.*;


import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
public class Window extends JFrame implements ActionListener  {
    JLabel l1=new JLabel("ID ");
	JLabel l2=new JLabel("LIBELLE");
	JLabel l3=new JLabel("PRIX");
	JTextField txt1=new JTextField(20);
	JTextField txt2=new JTextField(20);
	JTextField txt3=new JTextField(20);
	JButton b1=new JButton("Ajouter");
	JButton b2=new JButton("Supprimer");
	JButton b3=new JButton("Quitter");
	JTable table=new JTable();
	String[]Titre={"ID","LIBELLE","PRIX"};
    DefaultTableModel model;
    JScrollPane tpan=new JScrollPane(table);

    Traitement tr=new Traitement();
    public Window() {
        model=new DefaultTableModel();
        model.setColumnIdentifiers(Titre);
        ArrayList<Produit>list=tr.getAll();
        for(Produit p:list){
            model.addRow(new String[]{String.valueOf(p.getId()),p.getLibelle(),String.valueOf(p.getPrix())});
        }
        
        
              
        table.setModel(model);
              
    JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(0,2));
    p1.add(l1);
    p1.add(txt1);
    p1.add(l2);
    p1.add(txt2);  
    p1.add(l3);
    p1.add(txt3);
    JPanel p2=new JPanel();
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);


	this.getContentPane().add(tpan, BorderLayout.NORTH);
	this.getContentPane().add(p1,BorderLayout.CENTER);
	this.getContentPane().add(p2,BorderLayout.SOUTH);
	
	setSize(400,600);
	setVisible(true);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	tr.addProduct(new Produit(Integer.parseInt(txt1.getText()),txt2.getText(),Double.parseDouble(txt3.getText())));
            model=new DefaultTableModel();
            model.setColumnIdentifiers(Titre);
            ArrayList<Produit>list1=tr.getAll();
            for(Produit p:list1){
                model.addRow(new String[]{String.valueOf(p.getId()),p.getLibelle(),String.valueOf(p.getPrix())});
            }
            
            
                  
            table.setModel(model);
        }
    });
    b2.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            int x=table.getSelectedRow();
            int ids=Integer.parseInt(String.valueOf(model.getValueAt(x, 0)));
            tr.deleteProduit(ids);
            model=new DefaultTableModel();
            model.setColumnIdentifiers(Titre);
            ArrayList<Produit>list=tr.getAll();
            for(Produit p:list){
                model.addRow(new String[]{String.valueOf(p.getId()),p.getLibelle(),String.valueOf(p.getPrix())});
            }
            table.setModel(model);
        }
    
    });
    
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
	
 
