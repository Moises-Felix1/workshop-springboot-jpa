package com.deb.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deb.course_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
