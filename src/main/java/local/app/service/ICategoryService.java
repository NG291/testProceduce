package local.app.service;

import local.app.model.Category;
import local.app.model.dto.ICategoryDocumentNumber;

import java.util.List;

public interface ICategoryService extends IGenericService<Category> {
    void deleteCategoryById(Long id);
    List<Category> findALl();
    List<ICategoryDocumentNumber> getCategoryDocumentNumber();
}
