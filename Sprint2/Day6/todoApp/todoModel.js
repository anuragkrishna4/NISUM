export class Todo {
  static idCounter = 1;
  constructor(title = 'Untitled') {
    this.id = Todo.idCounter++;
    this.title = title;
    this.completed = false;
  }
}

export const createTodo = (title = 'New Task') => new Todo(title);