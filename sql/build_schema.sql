use documents;
INSERT INTO category (id, name)
VALUES
    (1, 'Khoa học viễn tưởng'),
    (2, 'Lịch sử'),
    (3, 'Văn học cổ điển'),
    (4, 'Tâm lý học'),
    (5, 'Nghệ thuật'),
    (6, 'Công nghệ thông tin');

INSERT INTO document (code, description, name, year, category_id)
VALUES
-- Khoa học viễn tưởng (category_id = 1)
('DOC001', 'Một trong những tác phẩm nổi tiếng nhất về khoa học viễn tưởng', 'Foundation', 1951, 1),
('DOC002', 'Một tác phẩm kinh điển trong thể loại khoa học viễn tưởng', '2001: A Space Odyssey', 1968, 1),

-- Lịch sử (category_id = 2)
('DOC003', 'Lịch sử loài người từ khởi nguyên đến hiện tại', 'Sapiens: Lược sử loài người', 2011, 2),
('DOC004', 'Một tác phẩm cổ điển về lịch sử La Mã', 'The History of the Decline and Fall of the Roman Empire', 1776, 2),

-- Văn học cổ điển (category_id = 3)
('DOC005', 'Một trong những tác phẩm vĩ đại của văn học Hy Lạp cổ đại', 'The Iliad', -750, 3),
('DOC006', 'Tác phẩm nổi tiếng về tội ác và sự trừng phạt', 'Crime and Punishment', 1866, 3),

-- Tâm lý học (category_id = 4)
('DOC007', 'Một trong những tác phẩm quan trọng nhất về tâm lý học phân tâm', 'The Archetypes and the Collective Unconscious', 1959, 4),
('DOC008', 'Tác phẩm kinh điển về giấc mơ và phân tâm học', 'The Interpretation of Dreams', 1899, 4),

-- Nghệ thuật (category_id = 5)
('DOC009', 'Tác phẩm nổi tiếng về nghệ thuật và hội họa', 'The Last Supper: Art and Symbolism', 1498, 5),
('DOC010', 'Tác phẩm nổi tiếng về nghệ thuật điêu khắc', 'David: The Masterpiece of Renaissance Sculpture', 1504, 5);
