package com.techfacts.springdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.techfacts.springdatarest.model.OnlineBook;

/*@RepositoryRestResource: To customize the Spring Data Rest service path.
 Default value: pluralizing the entity name. Book -> books
 */

@RepositoryRestResource(path = "books")
public interface BookRepository extends CrudRepository<OnlineBook, Long> {
	public OnlineBook findBookByAuthor(String author);
}
