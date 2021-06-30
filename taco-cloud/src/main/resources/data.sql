DELETE FROM Taco_Order_Tacos;
DELETE FROM Taco_Ingredients;
DELETE FROM Taco;
DELETE FROM Taco_Order;
DELETE FROM Ingredient;
INSERT INTO Ingredient (id, name, type)
                values ('FLTO', 'Flour Tortilla', 'WRAP');
INSERT INTO Ingredient (id, name, type)
                values ('COTO', 'Corn Tortilla', 'WRAP');
INSERT INTO Ingredient (id, name, type)
                values ('BLCO', 'Blue Corn Tortilla', 'WRAP');
INSERT INTO Ingredient (id, name, type)
                values ('GRBF', 'Ground Beef', 'PROTEIN');
INSERT INTO Ingredient (id, name, type)
                values ('CARN', 'Carnitas', 'PROTEIN');
INSERT INTO Ingredient (id, name, type)
                values ('CHCK', 'Chicken', 'PROTEIN');
INSERT INTO Ingredient (id, name, type)
                values ('IMPB', 'Impossible Plant-based', 'PROTEIN');
INSERT INTO Ingredient (id, name, type)
                values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
INSERT INTO Ingredient (id, name, type)
                values ('FAJT', 'Fajita Veggies', 'VEGGIES');
INSERT INTO Ingredient (id, name, type)
                values ('JLPN', 'Jalapeno', 'VEGGIES');
INSERT INTO Ingredient (id, name, type)
                values ('PCKO', 'Pickled Onions', 'VEGGIES');
INSERT INTO Ingredient (id, name, type)
                values ('LETC', 'Lettuce', 'VEGGIES');
INSERT INTO Ingredient (id, name, type)
                values ('CHED', 'Cheddar', 'CHEESE');
INSERT INTO Ingredient (id, name, type)
                values ('QSFR', 'Queso Fresco', 'CHEESE');
INSERT INTO Ingredient (id, name, type)
                values ('JACK', 'Monterrey Jack', 'CHEESE');
INSERT INTO Ingredient (id, name, type)
                values ('MISA', 'Mild Salsa', 'SAUCE');
INSERT INTO Ingredient (id, name, type)
                values ('MESA', 'Medium Salsa', 'SAUCE');
INSERT INTO Ingredient (id, name, type)
                values ('SLVR', 'Salsa Verde', 'SAUCE');
INSERT INTO Ingredient (id, name, type)
                values ('PCSL', 'Pico de Gallo', 'SAUCE');
INSERT INTO Ingredient (id, name, type)
                values ('RTSA', 'Roasted Tomatillo', 'SAUCE');
INSERT INTO Ingredient (id, name, type)
                values ('SRCR', 'Sour Cream', 'SAUCE');
