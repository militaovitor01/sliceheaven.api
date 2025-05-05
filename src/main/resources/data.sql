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

-- Inserir dados das sobremesas
INSERT INTO desserts (name, description, price, image_url, category, featured, discount, created_at) VALUES
('Chocolate Brownie', 'Warm chocolate brownie served with vanilla ice cream.', 8.99, 'https://images.pexels.com/photos/45202/brownie-dessert-cake-sweet-45202.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'dessert', true, NULL, NOW()),
('Tiramisu', 'Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone cream.', 9.99, 'https://images.pexels.com/photos/2144112/pexels-photo-2144112.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'dessert', true, NULL, NOW()),
('Cheesecake', 'Creamy New York style cheesecake with berry compote.', 7.99, 'https://images.pexels.com/photos/1126359/pexels-photo-1126359.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'dessert', false, 15, NOW()),
('Ice Cream Sundae', 'Three scoops of ice cream with chocolate sauce, whipped cream, and a cherry.', 6.99, 'https://images.pexels.com/photos/1352281/pexels-photo-1352281.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'dessert', false, NULL, NOW());

-- Inserir dados das bebidas
INSERT INTO drinks (name, description, price, image_url, category, featured, discount, created_at) VALUES
('Coca-Cola', 'Classic carbonated soft drink.', 3.99, 'https://images.pexels.com/photos/50593/coca-cola-cold-drink-soft-drink-coke-50593.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'drink', true, NULL, NOW()),
('Sprite', 'Lemon-lime flavored carbonated drink.', 3.99, 'https://images.pexels.com/photos/50593/coca-cola-cold-drink-soft-drink-coke-50593.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'drink', false, NULL, NOW()),
('Orange Juice', 'Fresh squeezed orange juice.', 4.99, 'https://images.pexels.com/photos/42059/citrus-diet-food-fresh-42059.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'drink', true, NULL, NOW()),
('Lemonade', 'Fresh squeezed lemonade with mint.', 4.49, 'https://images.pexels.com/photos/42059/citrus-diet-food-fresh-42059.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2', 'drink', false, 10, NOW()); 