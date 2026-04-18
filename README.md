# springboot-db1

Simple Spring Boot CRUD example using Spring WebMVC + Spring Data JPA with an in-memory H2 database.

## Requirements

- Java 17+

## Run

Windows (PowerShell):

```powershell
./mvnw.cmd spring-boot:run
```

macOS/Linux:

```bash
./mvnw spring-boot:run
```

App runs on `http://localhost:8081`.

## H2 Console

- URL: `http://localhost:8081/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: empty by default (can be set via `SPRING_DATASOURCE_PASSWORD`)

## API

Base path: `/api/utilisateurs`

- `GET /api/utilisateurs` – list all
- `GET /api/utilisateurs/{id}` – get by id
- `POST /api/utilisateurs` – create/update
- `DELETE /api/utilisateurs/{id}` – delete

Example:

```bash
curl -X POST http://localhost:8081/api/utilisateurs \
  -H "Content-Type: application/json" \
  -d "{\"nom\":\"Alice\",\"email\":\"alice@example.com\"}"
```

## Configuration

Database credentials can be overridden with:

- `SPRING_DATASOURCE_USERNAME` (default `sa`)
- `SPRING_DATASOURCE_PASSWORD` (default empty)

