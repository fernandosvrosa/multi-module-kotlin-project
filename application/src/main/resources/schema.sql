CREATE TABLE IF NOT EXISTS posts (
    id int generated by default as identity,
    title VARCHAR(255),
    content VARCHAR(255)
);

