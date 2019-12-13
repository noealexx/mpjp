package s053;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	@Test // annotazione. ci ricorda che è un test. jupiter considera da testare solo i
			// metodi sotto l'annotazione @test
	void barkPlain() { // prima era test bark; cambiato così per dire che stiamo testando in modo
						// semplice
		Dog dog = new Dog();
		fail("Not yet implemented");
	} // riga rossa perchè è fallito

}
