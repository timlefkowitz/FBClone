package com.fbclone.Repos;


import com.fbclone.models.groupTable.groupTable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepo extends JpaRepository<groupTable, Long>{
}
