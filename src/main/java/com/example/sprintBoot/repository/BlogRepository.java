package com.example.sprintBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sprintBoot.modelo.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
