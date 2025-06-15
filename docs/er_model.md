
# ER-модель

**Project** (id, name, description, start_date, end_date)  
**User** (id, name, email, role)  
**Task** (id, name, description, user_id → User, project_id → Project, status, deadline)  
**Comment** (id, text, date, author_id → User, task_id → Task)

Зв'язки:
- Project 1—N Task
- User 1—N Task
- Task 1—N Comment
- User 1—N Comment
