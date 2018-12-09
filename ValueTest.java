package saskes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ValueTest {

	@Test
public void Valuetest() {
		
		Player dt = new Player();
		boolean turn = true;
		dt.changeValue(turn);
		
		assertEquals(5,dt.getValue());
	
	
		}
		
		
		
	}
 