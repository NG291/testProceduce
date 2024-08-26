package local.app.repository;

import local.app.model.Category;
import local.app.model.dto.ICategoryDocumentNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

    // get data and parse to DTO: ICategoryDocumentNumber
    @Query(nativeQuery = true, value = "SELECT category.name, count(document.id) as number FROM category LEFT JOIN document ON category_id = category.id GROUP BY category.name")
    List<ICategoryDocumentNumber> getCategoryDocumentNumber();

    // use stored procedure to delete
    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "CALL sp_delete_category(:id)")
    void deleteCategoryById(@Param("id") Long id);
}
