import { Todo, createTodo } from './todoModel.js';

const _privateData = new WeakMap();

export class TodoApp {
  constructor() {
    const todos = [];
    const todoMap = new Map();
    const todoSet = new Set();
    _privateData.set(this, { todos, todoMap, todoSet });
  }

  addTodo(title) {
    const todo = createTodo(title);
    const state = _privateData.get(this);
    state.todos.push(todo);
    state.todoMap.set(todo.id, todo);
    state.todoSet.add(todo);
    return todo;
  }

  toggleTodo(id) {
    const { todoMap } = _privateData.get(this);
    const todo = todoMap.get(id);
    if (todo) todo.completed = !todo.completed;
  }

  deleteTodo(id) {
    const state = _privateData.get(this);
    const todo = state.todoMap.get(id);
    state.todos = state.todos.filter(t => t.id !== id);
    state.todoMap.delete(id);
    state.todoSet.delete(todo);
  }

  getAllTodos() {
    return [..._privateData.get(this).todos];
  }

  *[Symbol.iterator]() {
    for (const todo of _privateData.get(this).todos) {
      yield todo;
    }
  }

  getTodoTitles() {
    return Array.from(_privateData.get(this).todoSet, t => t.title);
  }

  compareTodos(todo1, todo2) {
    return Object.is(todo1, todo2);
  }
}
