package com.sj;

	import java.sql.Connection;
	import java.sql.DriverManager;                      //This code is for inserting data into the table
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class PreStDemo {

		public static void main(String[] args) throws ClassNotFoundException,SQLException //{
		{// TODO Auto-generated method stub
			//try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","Chandrika1@");
		    PreparedStatement pst=con.prepareStatement("insert into user values(?,?,?)");
		    pst.setInt(1,4);
		    pst.setString(2, "chandu");
		    pst.setString(3,"xyz");
		   int rows= pst.executeUpdate();
		   if(rows==1)
		   {
			   System.out.println("Data inserted successfully");
		   }
		   else
		   {
			   System.out.println("something went wrong");
		   }
			/*}catch(SQLException e) {
				e.printStackTrace();//This is because we should never leave the catch block empty. here and also for the below catch block
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}*/
			
		
		
		
		
		}

	

}
