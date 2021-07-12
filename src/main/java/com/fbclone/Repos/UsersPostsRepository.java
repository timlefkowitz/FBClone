package com.fbclone.Repos;

import com.fbclone.models.postTable.postTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersPostsRepository extends JpaRepository<postTable, Long> {
}
