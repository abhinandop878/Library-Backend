package com.nestDigital.libraryBackend.dao;

import com.nestDigital.libraryBackend.model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDAO extends CrudRepository<LibraryModel,Integer> {
}
