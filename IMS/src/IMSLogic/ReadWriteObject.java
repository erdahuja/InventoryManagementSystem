package IMSLogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {


	public static boolean createObject(ReadWriteUser user) throws IOException {
		FileOutputStream fo=new FileOutputStream("/home/deepak/Workspace/IMS/src/user.txt");
		ObjectOutputStream wo=new ObjectOutputStream(fo);
		wo.writeObject(user);
		wo.close();
		return true;		
	}
	
	
		
 public static boolean readObject(ReadWriteUser currentUser) throws IOException {
		
		File f=new File("/home/deepak/Workspace/IMS/src/user.txt");
		FileInputStream fin=null;
		ObjectInputStream o=null;
		ReadWriteUser rw=null;
		
			
		if(!f.exists())
		{
			return false;
			
		}
		else{
			
			try{
			fin = new FileInputStream(f);
			 o = new ObjectInputStream(fin);
			rw= (ReadWriteUser)o.readObject();
			if(rw.getName().equals(currentUser.getName())&&rw.getPwd().equals(currentUser.getPwd())){
				System.out.println(rw.toString());
				return true;
				
			}
	
			
			 
			 
			 
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			finally{

				o.close();
			}
			}
		return false;
			 
			 
	
		// TODO Auto-generated method stub
		
	}
	



	
}

