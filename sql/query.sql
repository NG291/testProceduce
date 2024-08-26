#delete category
use documents;
DROP PROCEDURE sp_delete_category;

DELIMITER //
CREATE PROCEDURE sp_delete_category(categoryId BIGINT)
BEGIN
UPDATE document
SET category_id = NULL
WHERE category_id = categoryId;

DELETE FROM category WHERE id = categoryId;
END//
DELIMITER

#category document
SELECT category.name, count(document.id) as number
FROM category
         LEFT JOIN document
                   ON category_id = category.id
GROUP BY category.name;