INSERT INTO retail_store (store_id, name, area, opening_hours) VALUES
    ('123e4567-e89b-12d3-a456-426614174000', 'Store A', 'Area 1', '09:00-18:00');


INSERT INTO review (review_id, num_stars, comment, is_verified, retail_store_store_id) VALUES
    ('223e4567-e89b-12d3-a456-426614174001', 5, 'Great store!', true, '123e4567-e89b-12d3-a456-426614174000'),
    ('323e4567-e89b-12d3-a456-426614174002', 4, 'Good service.', true, '123e4567-e89b-12d3-a456-426614174000'),
    ('423e4567-e89b-12d3-a456-426614174003', 3, 'Average experience.', false, '123e4567-e89b-12d3-a456-426614174000'),
    ('523e4567-e89b-12d3-a456-426614174004', 2, 'Not satisfied.', true, '123e4567-e89b-12d3-a456-426614174000'),
    ('623e4567-e89b-12d3-a456-426614174005', 1, 'Terrible service. The store ', false, '123e4567-e89b-12d3-a456-426614174000');