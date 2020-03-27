CREATE TABLE IF NOT EXISTS posts (id SERIAL PRIMARY KEY, title VARCHAR(255), content VARCHAR(255));

DELETE FROM posts;

INSERT INTO  posts (title, content) VALUES ('post one', 'content of post one');