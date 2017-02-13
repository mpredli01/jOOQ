SELECT title,publish_date,authors.last_name,types.type,publishers.publisher
FROM publications
INNER JOIN authors ON authors.id = publications.author_id
INNER JOIN types ON types.id = publications.type_id
INNER JOIN publishers ON publishers.id = publications.publisher_id;

SELECT last_name, first_name, states.state, zip_code, home_email
FROM authors
INNER JOIN states on states.id = authors.state_id;

SELECT COUNT(*) FROM publications;
