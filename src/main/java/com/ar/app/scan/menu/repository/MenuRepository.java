package com.ar.app.scan.menu.repository;

import com.ar.app.scan.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByIdResto(int idResto);

}
