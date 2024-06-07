package br.com.api.reiapi.repository;

/* import org.hibernate.mapping.List; */
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.reiapi.model.Image;
import java.util.List;

public interface ImageRepository extends JpaRepository <Image, Long> {
    List<Image> findByCategory(String category);
    List<Image> findByName(String name);
}
