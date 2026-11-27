# hedwig-server

Chat server for [hedwig](https://github.com/ajaykotian7/hedwig), an Android chat app.
It's moving from Firebase to its own backend. A React web client comes next.

**Stack:** Java 25 · Spring Boot 4 · PostgreSQL 18 · Flyway · Docker

## Run locally
```bash
docker compose up -d        # Postgres on localhost:5432
./mvnw spring-boot:run      # API on localhost:8080
curl localhost:8080/api/health
```