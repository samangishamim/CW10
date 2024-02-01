create  table  if not exists  city
(
    id SERIAL PRIMARY KEY ,
    city_name varchar(50)
);

create table if not exists team
(
  id SERIAL PRIMARY KEY ,
  team_name varchar(50),
  city_id int references city (id)
);
CREATE TABLE IF NOT EXISTS player
(
    id SERIAL PRIMARY KEY ,
    player_name VARCHAR(50),
    salary DECIMAL(10,2) ,
    team_id int references team(id)
);

