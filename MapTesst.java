package saskes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class MapTesst {

	
	@Test
	public void test() {
		
		Map dt = new Map();
		boolean doesCheckersExistOnTheMap = true;
		int num = 2;
		boolean sample = Arrays.asList(dt.map).contains(num);
		
		assertEquals(doesCheckersExistOnTheMap,sample);
	
	
		}
		
		
		
	}


