package com.example.demo.repository;

import com.example.demo.model.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMenuRepository extends JpaRepository<TypeMenu,Long> {

    TypeMenu findByName(String name);
}
