import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.*;
import java.util.*;
import java.io.*;

public class JsonParserArrays {
	
	public static ArrayList<JsonNode> parseJson (JsonNode pointerNode, String [] query) {
	
			int numberOfQueryValuesParsed = 0;
			ArrayList<JsonNode> parsedNodeElements = new ArrayList<>();
			boolean hasArray = false;
			for ( String i : query ) {
			
					if ( pointerNode.isArray() ) {
						hasArray = true;
						break;
					}
					pointerNode = pointerNode.path(i);
					numberOfQueryValuesParsed ++;
					
			}
			//now parse those arrays starting from 'numberOfQueryValuesParsed': 
			ArrayList<JsonNode> arrayKeyValues = new ArrayList<>();
			if ( hasArray == true ) {
				String[] newQuery = Arrays.copyOfRange(query, numberOfQueryValuesParsed, query.length);
				// isolate all the arrays, call the parseJson 
				Iterator<JsonNode> itr = pointerNode.iterator();
				
				while( itr.hasNext() ) {
					JsonNode arrayElement = itr.next();
					//call the parseJson on it 
					arrayKeyValues.addAll( parseJson ( arrayElement, newQuery) );
				}			
			}
			else {
				if ( !pointerNode.isNull() ) 
					parsedNodeElements.add( pointerNode);
				return parsedNodeElements;
			}
			return arrayKeyValues;
	}
	
	
    public static void main( String [] args) {
		
		try {
            JsonNode rootNode;
            ObjectMapper objectMapper;
            objectMapper = new ObjectMapper();
            rootNode = objectMapper.readTree(new File("nested2.json"));

			//write your queries here:
			String [] query = {"topping", "type", "a", "c"};
			
			
			JsonNode pointerNode = rootNode;
			ArrayList<JsonNode> endNodes = new ArrayList<>();
			endNodes = parseJson( pointerNode, query);
			endNodes.stream().filter(value -> value != null).forEach(System.out::println);			
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}

