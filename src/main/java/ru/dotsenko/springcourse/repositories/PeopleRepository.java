package ru.dotsenko.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dotsenko.springcourse.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
