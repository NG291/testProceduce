package local.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGenericService<T> {
    T findById(Long id);
    void save(T t);
    void delete(T t);
}
