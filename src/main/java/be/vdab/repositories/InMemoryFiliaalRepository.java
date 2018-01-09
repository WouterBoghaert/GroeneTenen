package be.vdab.repositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import be.vdab.entities.Filiaal;
import be.vdab.valueobjects.Adres;

@Repository
class InMemoryFiliaalRepository implements FiliaalRepository {
	private final Map<Long,Filiaal> filialen = new ConcurrentHashMap<>();
	
	InMemoryFiliaalRepository() {
		filialen.put(1L, new Filiaal(1, "Andros", true, BigDecimal.valueOf(1000),
			LocalDate.now(), new Adres("Keizerslaan", "11", 1000, "Brussel")));
		filialen.put(2L, new Filiaal(2, "Delos", false, BigDecimal.valueOf(2000),
			LocalDate.now(), new Adres("Gasthuisstraat", "31", 1000, "Brussel")));
		filialen.put(3L, new Filiaal(3, "Gavdos", false, BigDecimal.valueOf(3000),
			LocalDate.now(), new Adres("Koestraat", "44", 9700, "Oudenaarde")));
	}
	
	
	@Override
	public void create(Filiaal filiaal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Filiaal> read(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Filiaal filiaal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Filiaal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findAantalFilialen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long findAantalWerknemers(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
