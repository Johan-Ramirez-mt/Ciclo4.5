package SartenMango_5.interfaces;

import SartenMango_5.modelo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InterfaceOrder extends MongoRepository <Order,Integer> {
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);

    Optional<Order> findTopByOrderByIdDesc();

}
