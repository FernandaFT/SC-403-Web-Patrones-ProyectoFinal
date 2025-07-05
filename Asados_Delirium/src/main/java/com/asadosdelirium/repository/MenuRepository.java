package com.asadosdelirium.repository;

import com.asadosdelirium.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long>{
    
}
