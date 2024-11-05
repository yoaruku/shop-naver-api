package me.gu4rd.shop.repository;

import me.gu4rd.shop.entity.Folder;
import me.gu4rd.shop.entity.Product;
import me.gu4rd.shop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
