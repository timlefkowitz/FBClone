package com.fbclone.Repos;


import com.fbclone.models.RelationshipHome.groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<groups, Long>{
}
