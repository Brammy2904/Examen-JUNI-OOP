package helloWorld;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.stereotype.Service;
public class TestClass {

@Test
public void test() {
	System.out.println("test");
	assertEquals(new Playlist(1, "Bram"), new Playlist(1, "Bram"));
	assertEquals(new Track(1, "Test", 10.5),new Track(1, "Test", 10.5) );
}

	
}
