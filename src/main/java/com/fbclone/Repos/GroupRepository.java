package com.fbclone.Repos;


import com.fbclone.models.groupTable.groupTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<groupTable, Long>{
}
