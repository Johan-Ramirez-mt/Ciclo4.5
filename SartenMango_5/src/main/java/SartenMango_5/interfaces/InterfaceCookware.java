package SartenMango_5.interfaces;

import SartenMango_5.modelo.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface InterfaceCookware extends MongoRepository <Cookware, String>{
    public List<Cookware> findByPriceLessThanEqual(double precio);
    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Cookware> findByDescriptionLike(String description);
}
