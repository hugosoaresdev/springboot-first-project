-- Migrations para adicionar a coluna de data na tb_trips

ALTER TABLE tb_trips
ADD COLUMN trip_date DATE;