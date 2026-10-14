CREATE DATABASE tallerjdbc;

SELECT*FROM vehiculos;

CREATE TABLE vehiculos(
	placa VARCHAR(10) PRIMARY KEY,
	marca VARCHAR(50) NOT NULL,
	modelo VARCHAR(50) NOT NULL,
	anio INT NOT NULL,
	precio NUMERIC(10,2) NOT NULL,
	color VARCHAR(30),
	disponible BOOLEAN NOT NULL
);

INSERT INTO vehiculos (placa, marca, modelo, anio, precio, color, disponible)
VALUES
('PBC-2045', 'Chevrolet', 'Spark GT', 2021, 10500.00, 'Rojo', TRUE),
('PBD-3078', 'Hyundai', 'Tucson', 2023, 28500.00, 'Negro', TRUE),
('PBE-4091', 'Kia', 'Sportage', 2022, 26000.00, 'Gris', FALSE),
('PBF-5012', 'Nissan', 'Sentra', 2020, 16000.00, 'Azul', TRUE),
('PBG-6134', 'Mazda', 'CX-5', 2023, 32000.00, 'Blanco', TRUE),
('PBH-7245', 'Ford', 'Ranger', 2022, 35000.00, 'Plata', FALSE),
('PBI-8356', 'Volkswagen', 'Gol', 2020, 12000.00, 'Rojo', TRUE),
('PBJ-9467', 'Honda', 'Civic', 2021, 22000.00, 'Negro', TRUE),
('PBK-1578', 'Chevrolet', 'D-Max', 2023, 33000.00, 'Blanco', TRUE),
('PBL-2689', 'Toyota', 'Hilux', 2024, 42000.00, 'Gris', FALSE),
('PBM-3790', 'Suzuki', 'Swift', 2022, 14500.00, 'Azul', TRUE),
('PBN-4801', 'Renault', 'Duster', 2021, 19000.00, 'Verde', TRUE),
('PBO-5912', 'Mitsubishi', 'L200', 2022, 31000.00, 'Blanco', FALSE),
('PBP-6023', 'Hyundai', 'Accent', 2019, 11500.00, 'Plata', TRUE),
('PBQ-7134', 'Kia', 'Rio', 2020, 13000.00, 'Negro', TRUE),
('PBR-8245', 'Mazda', 'Mazda 3', 2023, 24000.00, 'Rojo', TRUE),
('PBS-9356', 'Ford', 'EcoSport', 2021, 18500.00, 'Azul', FALSE),
('PBT-0467', 'Toyota', 'Yaris', 2024, 19500.00, 'Blanco', TRUE),
('PBU-1689', 'Chevrolet', 'Tracker', 2023, 25000.00, 'Gris', TRUE);

ALTER TABLE vehiculos ADD kilometraje int;

ALTER USER postgres WITH PASSWORD 'yukiyasrael676*';