package me.gu4rd.shop.repository;

import me.gu4rd.shop.entity.Folder;
import me.gu4rd.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    /**
     * SELECT *
     *   FROM folder
     *  WHERE user_id = :user
     *    AND name IN ( :folderNames )
     */

    List<Folder> findAllByUser(User user);

}
