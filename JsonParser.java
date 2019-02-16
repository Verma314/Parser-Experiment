import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.*;
import java.util.*;
import java.io.*;

public class JsonParser {

    public static void main( String [] args){
        try {
            JsonNode rootNode;
            ObjectMapper objectMapper;
            objectMapper = new ObjectMapper();
            rootNode = objectMapper.readTree(new File("nested.json"));
					
			String [] query1 = {"batters", "bamboo"};
			String [] query2 = {"batters", "bamboo", "hi"};
			String [] query3 = {"batters", "bamboo", "random"};
			String [] query4 = {"batters", "batter"};
		
					
			JsonNode pointerNode = rootNode;
			for ( String i : query4 ) {
					pointerNode = pointerNode.path(i);
					System.out.println ( pointerNode.toString() + "\n\n" );
			
			
			}
			System.out.println("\n\nfinal value " + pointerNode.toString());
        }
		catch (Exception ex){System.out.println(ex);}

    }
}