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
    team_id int references team(id),
    contract_id int references contract(id)
);

create  table if not exists stadium
(
  id SERIAL primary key ,
  stadium_name varchar(50),
  city_id int references  city(id)
);

CREATE TABLE IF NOT EXISTS match(
    id SERIAL PRIMARY KEY ,
    number_of_goals  int,
    score  int,
    team_id int references team(id),
    stadium_id int references stadium(id)
);
CREATE TABLE IF NOT EXISTS contract
(
    id SERIAL PRIMARY KEY ,
    start DATE ,
    finish DATE ,
    salary DECIMAL (10,2)
);