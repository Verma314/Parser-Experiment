import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.*;
import java.util.*;
import java.io.*;


//https://fasterxml.github.io/jackson-databind/javadoc/2.2.0/com/fasterxml/jackson/databind/JsonNode.html#asText()
public class JsonParser {

    public static void main( String [] args){
        try {
            JsonNode rootNode;
            ObjectMapper objectMapper;
            objectMapper = new ObjectMapper();
            rootNode = objectMapper.readTree(new File("nested.json"));
					
			//example queries
			String [] query1 = {"batters", "bamboo"};
			String [] query2 = {"batters", "bamboo", "hi"};
			String [] query3 = {"batters", "bamboo", "random"};
			String [] query4 = {"batters", "batter"};
		
					
			JsonNode pointerNode = rootNode;
			for ( String i : query4 ) {
					pointerNode = pointerNode.path(i);
				
					//remove this s.o.p.
					System.out.println ( pointerNode.toString() + "\n\n" );
			
			
			}
			System.out.println("\n\nfinal value " + pointerNode.toString());
        }
		catch (Exception ex){System.out.println(ex);}

    }
}
