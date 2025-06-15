
-- Створення таблиць

CREATE TABLE Project (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    start_date DATE,
    end_date DATE
);

CREATE TABLE User (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    role VARCHAR(50)
);

CREATE TABLE Task (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    user_id INT,
    project_id INT,
    status VARCHAR(50),
    deadline DATE,
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);

CREATE TABLE Comment (
    id INT PRIMARY KEY,
    text TEXT,
    date DATE,
    author_id INT,
    task_id INT,
    FOREIGN KEY (author_id) REFERENCES User(id),
    FOREIGN KEY (task_id) REFERENCES Task(id)
);
