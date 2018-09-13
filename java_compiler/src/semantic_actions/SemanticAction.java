package semantic_actions;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class SemanticAction {

	
	public void execute(StringBuilder buffer, BufferedReader br, Integer token) throws IOException {
		buffer = buffer.append((char)br.read());
	}
	
}
