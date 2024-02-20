package soa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import soa.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
	@Query("from person p where p.name=:name")
	public Person findByName(@Param("name") String name);

}
