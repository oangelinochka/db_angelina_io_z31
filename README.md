# Students API - Angelina Smyk

Проєкт: REST API для керування студентами, адаптований з Java-програми на базі Fastify та PostgreSQL.

**Автор:** Angelina Smyk  
**Курс:** 2  
**Група:** ІО-з31

## Структура

- `src/` — вихідний код API (контролери, моделі, маршрути)
- `tests/` — модульні тести
- `docs/` — документація VuePress
- `legacy-java-version/` — вихідний Java-код до адаптації
- `docker-compose.yml` — запуск PostgreSQL
- `package.json` — залежності та скрипти

## Запуск

```bash
docker-compose up --build
```

API буде доступне за адресою `http://localhost:3000`

## Кінцеві точки API

- `GET /students` — список студентів
- `GET /students/:id` — студент за ID
- `POST /students` — створити студента
- `DELETE /students/:id` — видалити студента

