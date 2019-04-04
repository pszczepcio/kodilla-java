package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    List<Company> deleteById(int id);

    @Query(nativeQuery = true)
    List<Company> findByLetter (@Param("NAME") String NAME);

    @Query(nativeQuery = true)
    List<Company> findBySequenceOfCharacters(@Param("NAME") String Name);

}
