
DROP TABLE IF EXISTS public.authors;
DROP TABLE IF EXISTS public.posts;

CREATE TABLE public.authors (
	id INT AUTO_INCREMENT  PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
    thumbnail VARCHAR(250)
);

CREATE TABLE public.posts (
	id INT AUTO_INCREMENT PRIMARY KEY,
	author_id INT NOT NULL,
	title VARCHAR(250) NOT NULL,
    text CLOB NOT NULL,
    category VARCHAR(250) NOT NULL,
    FOREIGN KEY (author_id) REFERENCES public.authors(id)
);


INSERT INTO authors (name) VALUES ('Author 1');

INSERT INTO posts (author_id, title, text, category) VALUES (1, 'Post 1', 'Text post 1', 'Cars');