package SartenMango_5.repositorio;


import SartenMango_5.modelo.Cookware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import SartenMango_5.interfaces.InterfaceCookware;

@Repository
public class CookwareRepositorio {
    @Autowired
    private InterfaceCookware cookWarerepository;

    public List<Cookware> getAll() {
        return cookWarerepository.findAll();
    }

    public Optional<Cookware> getcook(String reference) {
        return cookWarerepository.findById(reference);
    }

    public Cookware create(Cookware cook) {
        return cookWarerepository.save(cook);
    }

    public void update(Cookware cook) {
        cookWarerepository.save(cook);
    }

    public void delete(Cookware cook) {
        cookWarerepository.delete(cook);
    }
    public List<Cookware> findByPriceLessThanEqual(double precio) {
        return cookWarerepository.findByPriceLessThanEqual(precio);
    }

    public List<Cookware> findByDescriptionLike(String description) {
        return cookWarerepository.findByDescriptionLike(description);
    }
}
