
import java.sql.*;
import java.util.ArrayList;
public class Traitement {
	private ConnectDb con=new ConnectDb();
	private Connection conn=con.getconnexion();
	public void addProduct(Produit p) {
		try {
			PreparedStatement pd=conn.prepareStatement("insert into produit values(?,?,?)");
			pd.setInt(1,p.getId());
			pd.setString(2, p.getLibelle());
			pd.setDouble(3, p.getPrix());
			pd.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Produit> getAll() {
		ArrayList<Produit> list=new ArrayList<Produit>();
		try {
			PreparedStatement pd=conn.prepareStatement("select * from produit");
			ResultSet rs=pd.executeQuery();
			while(rs.next()) {
				Produit p=new Produit(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				list.add(p);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void deleteProduit(int id) {
		try {
			PreparedStatement pd=conn.prepareStatement("delete from produit where id=?");
			pd.setInt(1, id);
			pd.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
}
