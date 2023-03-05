	import java.io.IOException;
	import java.net.URI;
	import java.net.http.HttpClient;
	import java.net.http.HttpRequest;
	import java.net.http.HttpResponse;


public class ApiRequest {
	 	 String request (String search) throws IOException, InterruptedException{
         String resposta;
         HttpResponse<String> response;
         HttpRequest request = null;
         int searchLength = search.length();
         
         if (search.isEmpty() || search.equals("[]") || searchLength<=2) {return "[]";}
         
         
         try{          
         request = HttpRequest.newBuilder()
         .uri(URI.create("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/search?query="+search))
         .header("accept", "application/json")
         .header("X-RapidAPI-Key", "Add you key here")
         .header("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
         .method("GET", HttpRequest.BodyPublishers.noBody())
         .build();          
         } catch(Exception e) {
              System.out.println("Your API search to make the API call is blank " + e);
         }
         
         response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
         System.out.println("THis is my status code from my beautiful call: " +response.statusCode());
         resposta = response.body();
         resposta = resposta.substring(resposta.indexOf("["));
         resposta = resposta.substring(0, resposta.length()-1);
         //System.out.println("Here is the index we always wanted ******* " + resposta.indexOf("["));
         return resposta;
    }
}
