package lv.venta.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Subject;

public interface ISubjectRepo extends CrudRepository<Subject, Integer> {

}
