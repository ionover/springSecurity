package org.example.spring_security.repositories;

import com.example.orm.entitys.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByCityName(String cityName);

    List<Person> findByAgeLessThanOrderByAgeAsc(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);

    List<Person> findByAge(int age);

    List<Person> findByNameContainingIgnoreCase(String name);

    List<Person> findBySurnameContainingIgnoreCase(String surname);
}
