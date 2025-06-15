# Students API - Angelina Smyk

Проект: REST API для управления студентами, адаптированный из Java-программы на базе Fastify и PostgreSQL.

**Автор:** Angelina Smyk  
**Курс:** 2  
**Группа:** ІО-з31

## Структура

- `src/` — исходный код API (контроллеры, модели, маршруты)
- `tests/` — модульные тесты
- `docs/` — документация VuePress
- `legacy-java-version/` — исходный Java-код до адаптации
- `docker-compose.yml` — запуск PostgreSQL
- `package.json` — зависимости и скрипты

## Запуск

```bash
docker-compose up --build
```

API будет доступен на `http://localhost:3000`

## Конечные точки API

- `GET /students` — список студентов
- `GET /students/:id` — студент по ID
- `POST /students` — создать студента
- `DELETE /students/:id` — удалить студента
