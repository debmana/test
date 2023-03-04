import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class TestMain {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String result = ("My name is nice lady @ ^ c ++++");
		//System.out.println(result);
		
		String item = URLEncoder.encode(result, StandardCharsets.UTF_8.toString());
		item = item.replace("+", "%20");
		System.out.println(item);
		
	}
	
	
	
	

	static String prepSearch(String untreated){
		
		if (untreated.contains("&")) {
			
			untreated = untreated.replace("&", "%26");
		}
		
		if (untreated.contains(":")) {
			
			untreated = untreated.replace(":", "%3A");
		}
		
		if (untreated.contains("/")) {
			
			untreated = untreated.replace("/", "%2F");
		}
		
		if (untreated.contains("\\")) {
			
			untreated = untreated.replace("\\", "%5C");
		}
		
		if (untreated.contains("?")) {
			
			untreated = untreated.replace("?", "%3F");
		}
		
		if (untreated.contains("#")) {
			
			untreated = untreated.replace("#", "%23");
		}
		
		if (untreated.contains("[")) {
			
			untreated = untreated.replace("[", "%5B");
		}
		
		if (untreated.contains("]")) {
			
			untreated = untreated.replace("]", "%5D");
		}

		if (untreated.contains("@")) {
			
			untreated = untreated.replace("@", "%40");
		}
		
		if (untreated.contains("$")) {
			
			untreated = untreated.replace("$", "%24");
		}
		
		if (untreated.contains(",")) {
			
			untreated = untreated.replace(",", "%2C");
		}
		
		if (untreated.contains("+")) {
			
			untreated = untreated.replace("+", "%2B");
		}
		
		if (untreated.contains(";")) {
			
			untreated = untreated.replace(";", "%3B");
		}
		
		if (untreated.contains("=")) {
			
			untreated = untreated.replace("=", "%3D");
		}
		
		if (untreated.contains("`")) {
			
			untreated = untreated.replace("`", "%60");
		}
		
		if (untreated.contains("^")) {
			
			untreated = untreated.replace("^", "%5E");
		}
		
		if (untreated.contains("{")) {
			
			untreated = untreated.replace("{", "%7B");
		}

		if (untreated.contains("}")) {
			
			untreated = untreated.replace("}", "%7D");
		}
		
		if (untreated.contains("|")) {
			
			untreated = untreated.replace("|", "%7C");
		}	
		
		return untreated;
		
	}
	
	

}
