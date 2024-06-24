
INSERT INTO customer (name) VALUES
    ('Jürgen'),
    ('Hans'),
    ('Günther'),
    ('Fabio'),
    ('Sofía'),
    ('Iñaki'),
    ('Aïcha'),
    ('Mario'),
    ('Emilia'),
    ('Zoë');

INSERT INTO customer_orders (customer, name) VALUES
    (1, 'Order 1 for Jürgen'),
    (1, 'Order 2 for Jürgen'),
    (1, 'Order 3 for Jürgen'),
    (2, 'Order 1 for Hans'),
    (2, 'Order 2 for Hans'),
    (3, 'Order 1 for Günther'),
    (3, 'Order 2 for Günther'),
    (3, 'Order 3 for Günther'),
    (4, 'Order 1 for Fabio'),
    (5, 'Order 1 for Sofía');

-- Insert data into customer_profiles table
INSERT INTO customer_profiles (customer, username, password) VALUES
    (1, 'jurgen123', 'password123'),
    (2, 'hans456', 'password456'),
    (3, 'gunther789', 'password789'),
    (4, 'fabio000', 'password000'),
    (5, 'sofia999', 'password999');

