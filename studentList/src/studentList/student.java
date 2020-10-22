package studentList;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;
public class student {
		public void add() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name=");
			String name=sc.next();
			System.out.println("enter pnone number=");
			 String phone=sc.next();
			
			 try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","14597");
				PreparedStatement st =con.prepareStatement("insert into student(name,phone)"
						+ "value(?,?)");
				st.setString(1,name);
				st.setString(2, phone);
				st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		public void print() {
			 try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","14597");
					PreparedStatement st =con.prepareStatement("select * from student");
					
				ResultSet rs=st.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		public void remove() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter student id to remove=");
			int id=sc.nextInt();
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","14597");
				PreparedStatement st =con.prepareStatement("delete from student\r\n"
						+ "where s_no = ?");
				st.setInt(1, id);
				
				st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


