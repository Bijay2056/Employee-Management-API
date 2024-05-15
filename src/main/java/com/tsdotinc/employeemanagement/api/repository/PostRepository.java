package com.tsdotinc.employeemanagement.api.repository;

import com.tsdotinc.employeemanagement.api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
