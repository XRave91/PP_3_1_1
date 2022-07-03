package org.xrave.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.xrave.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
