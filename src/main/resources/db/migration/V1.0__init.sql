CREATE TABLE movies (
    movie_id SERIAL PRIMARY KEY,
    title VARCHAR(128) NOT NULL,
    country VARCHAR(32) NOT NULL,
    genre VARCHAR(64) NOT NULL,
    duration INTEGER NOT NULL
);

create table halls
(
    hall_id SERIAL PRIMARY KEY,
    hall_number INTEGER UNIQUE NOT NULL,
    hall_name VARCHAR(32),
    capacity INTEGER NOT NULL
);

create table sessions
(
    session_id SERIAL PRIMARY KEY,
    hall_id INTEGER unique,
    movie_id INTEGER unique,
    start_time TIMESTAMP NOT NULL,
    price NUMERIC(5,2) NOT NULL,
    sold_tickets INTEGER NOT NULL,
    FOREIGN KEY (hall_id) REFERENCES halls(hall_id),
    FOREIGN KEY (movie_id) REFERENCES movies(movie_id)
);