-- Tabela de pizzas
CREATE TABLE IF NOT EXISTS pizzas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    image_url TEXT,
    category VARCHAR(50) DEFAULT 'pizza',
    sub_category VARCHAR(50),
    featured BOOLEAN DEFAULT FALSE,
    rating DECIMAL(2,1),
    discount INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;

-- Inserir dados das pizzas
INSERT INTO pizzas (name, description, price, image_url, category, sub_category, featured, rating, discount, created_at) VALUES
('Margherita', 'Classic pizza with tomato sauce, mozzarella, and fresh basil.', 12.99, 'https://images.pexels.com/photos/1146760/pexels-photo-1146760.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Classic', true, 4.8, NULL, NOW()),
('Pepperoni', 'Traditional favorite topped with tomato sauce, mozzarella, and pepperoni.', 14.99, 'https://images.pexels.com/photos/4109111/pexels-photo-4109111.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Classic', true, 4.9, NULL, NOW()),
('Supreme', 'Loaded with pepperoni, sausage, bell peppers, onions, and olives.', 16.99, 'https://images.pexels.com/photos/905847/pexels-photo-905847.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Special', false, 4.7, NULL, NOW()),
('Veggie', 'Fresh vegetables including mushrooms, bell peppers, onions, and olives.', 14.99, 'https://images.pexels.com/photos/1146760/pexels-photo-1146760.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Vegetarian', false, 4.5, NULL, NOW()),
('BBQ Chicken', 'Grilled chicken, red onions, and cilantro with tangy BBQ sauce.', 15.99, 'https://images.pexels.com/photos/1146760/pexels-photo-1146760.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Special', true, 4.6, 10, NOW()),
('Hawaiian', 'Ham and pineapple on a tomato sauce base with mozzarella cheese.', 14.99, 'https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Classic', false, 4.3, NULL, NOW()),
('Buffalo Chicken', 'Spicy buffalo chicken with blue cheese and mozzarella.', 15.99, 'https://images.pexels.com/photos/1146760/pexels-photo-1146760.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Special', false, 4.4, NULL, NOW()),
('Four Cheese', 'Rich blend of mozzarella, cheddar, provolone, and parmesan cheeses.', 13.99, 'https://images.pexels.com/photos/1146760/pexels-photo-1146760.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'pizza', 'Vegetarian', true, 4.7, NULL, NOW());

-- Tabela de sobremesas
CREATE TABLE IF NOT EXISTS desserts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    image_url TEXT,
    category VARCHAR(50) DEFAULT 'dessert',
    featured BOOLEAN DEFAULT FALSE,
    discount INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;


-- Tabela de bebidas
CREATE TABLE IF NOT EXISTS drinks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    image_url TEXT,
    category VARCHAR(50) DEFAULT 'drink',
    featured BOOLEAN DEFAULT FALSE,
    discount INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;

