package com.example.library.dao;

import com.example.library.model.BookModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookDao extends CrudRepository<BookModel,Integer> {

@Query(value = "SELECT `id`, `author`, `description`, `image`, `price`, `released_year`, `title` FROM `books` WHERE `title` LIKE %:name%",nativeQuery = true)
List<BookModel> SearchBooks(@Param("name")String name);


@Modifying
@Transactional
@Query(value = "DELETE FROM `books` WHERE `id` =:id",nativeQuery = true)
void DeleteBooks(@Param("id")Integer id);

}
