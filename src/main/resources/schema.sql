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