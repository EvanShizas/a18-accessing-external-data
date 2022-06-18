/**
 * Creates and prints an XML file.
 * 
 * modified     20220617
 * date         20220615
 * @filename    XMLCreate.java
 * @author      Evan Shizas
 * @author      Alvin Chan
 * @author      Hammad Hassan
 * @author		Oscar Lam
 * @version     1.0.0
 * @see         A18 - Accessing External Data
 */

import java.io.*;
import javax.xml.parsers.ParserConfigurationException;

public class XMLCreate {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		try {
			OutputStream fout = new FileOutputStream("course-information.xml");
			OutputStream bout = new BufferedOutputStream(fout);
			OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");

			out.write("<?xml version=\"1.0\" ");
			out.write("encoding=\"ISO-8859-1\"?>\r\n");
			out.write("<class>\r\n");
			out.write("<code>ISC4U1-01</code>\r\n");
			out.write("<description>Computer Science, Grade 12, University</description>\r\n");
			out.write("<schoolBoard>TDSB</schoolBoard>\r\n");
			out.write("<teacher>teacherbot</teacher>\r\n");
			out.write("<fileType>Unmodified</fileType>\r\n");
			out.write("</class>\r\n");

			out.flush();
			out.close();
			
			// Print out xml file in terminal...
		}

		catch (UnsupportedEncodingException e) {
			System.out.println("This VM does not support the Latin-1 character set.");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
