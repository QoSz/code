import sqlite3

connection = sqlite3.connect('dbtest.db')

cursor = connection.cursor()

cursor.execute("""
CREATE TABLE IF NOT EXISTS persons (
    first_name,
    last_name,
    age
)
""")

cursor.execute("""
INSERT INTO persons VALUES
("Mark", "Rober", 31),
("Emma", "Watson", 27),
("Jack", "Rober", 14)
""")

cursor.execute("""
SELECT * FROM persons
WHERE last_name = "Rober"
""")

result = cursor.fetchall()
print(result)

connection.commit()
connection.close()