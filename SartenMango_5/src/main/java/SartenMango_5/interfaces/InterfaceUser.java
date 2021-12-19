package SartenMango_5.interfaces;

import SartenMango_5.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface InterfaceUser extends MongoRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    List<User> findByMonthBirthtDay(String monthBirthtDay);
    Optional<User> findTopByOrderByIdDesc();

}
