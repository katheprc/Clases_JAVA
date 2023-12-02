package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

public class SociosDAO 
{
	
	Connection conexion=null;
	
	public SociosDAO() throws ClassNotFoundException
	{
		Conexion con=new Conexion();
		conexion=con.getConnection();
	}

	
	public List<Socios> listarSocios()
	{
		PreparedStatement ps;
		ResultSet rs;
		List<Socios> lista=new ArrayList<Socios>();
		
		try
		{
		ps=conexion.prepareStatement("select * from socios");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			int id=rs.getInt("id_socio");
			String nombre=rs.getNString("nombre");
			String apellido=rs.getNString("apellido");
			int dni=rs.getInt("dni");
			String mail=rs.getNString("mail");
			boolean estado=rs.getBoolean("estado");		
			LocalDate fecha=rs.getDate("fecha_alta").toLocalDate();				
			Socios socio=new Socios(id,nombre,apellido,dni,mail,estado,fecha);			
			lista.add(socio);			
		}
		return lista;
		
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return null;
		}		
	}
	
	
	public boolean insertarSocio(Socios socio) 
	{
		PreparedStatement ps;		
		try
		{
			ps=conexion.prepareStatement("insert into socios (nombre,apellido,dni,mail,fecha_alta,estado) values(?,?,?,?,?,?)");
			ps.setString(1, socio.getNombre());
			ps.setString(2, socio.getApellido());
			ps.setInt(3, socio.getDni());
			ps.setString(4, socio.getMail());
			ps.setObject(5, LocalDate.now());
			ps.setBoolean(6, true);
			ps.execute();
			return true;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public boolean actualizarSocio(Socios socio)
	{
		PreparedStatement ps;	
		try
		{
		 ps=conexion.prepareStatement("update socios set nombre=?,apellido=?,dni=?,Mail=? where id_socio=?");
		 ps.setString(1, socio.getNombre());
		 ps.setString(2, socio.getApellido());
		 ps.setInt(3, socio.getDni());
		 ps.setString(4, socio.getMail());
		 ps.setInt(5, socio.getId_socio());
		 ps.execute();
		return true;		
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}		
	}
	
	
	public boolean eliminarSocio(int _id)
	{
		PreparedStatement ps;	
		try
		{
			ps=conexion.prepareStatement("delete from socios where id_socio=?");
			ps.setInt(1, _id);
			ps.execute();
			return true;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}	
		
	}
	
	
	public Socios mostrarSocio(int _id)
	{
		PreparedStatement ps;
		ResultSet rs;
		Socios socio=null;
		
		
		try
		{
			ps=conexion.prepareStatement("select * from socios where id_socio=?");
			ps.setInt(1, _id);
			rs=ps.executeQuery();	
			
			while(rs.next())
			{
			int id=rs.getInt("id_socio");		
			String nombre=rs.getNString("nombre");
			String apellido=rs.getNString("apellido");
			int dni=rs.getInt("dni");
			String mail=rs.getNString("mail");
			boolean estado=rs.getBoolean("estado");		
			LocalDate fecha=rs.getDate("fecha_alta").toLocalDate();			
			
			socio=new Socios(id,nombre,apellido,dni,mail,estado,fecha);	
			}
			return socio;
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return null;
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
