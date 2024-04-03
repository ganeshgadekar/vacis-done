package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class confo_uti {
Properties pro;
public confo_uti() throws IOException
{
	String path="C:\\Users\\admin\\eclipse-workspace\\vacis_demo\\info.properties";
	pro=new Properties();
	
	FileInputStream file =new FileInputStream(path);
	pro.load(file);
}

public String getusername()
{
	return pro.getProperty("USERNAME");
}

public String getpassword()
{
	return pro.getProperty("PASSWORD");
	
}

}
