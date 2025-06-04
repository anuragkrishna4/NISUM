import { TodoApp } from './todoApp.js';
import { updateUI } from './utils.js';

const app = new TodoApp();

const todoList = document.getElementById('todo-list');
const input = document.getElementById('todo-input');
const addBtn = document.getElementById('add-btn');

const getInputTitle = () => input.value.trim();

const handleAdd = () => {
  const title = getInputTitle();
  if (!title) return;
  app.addTodo(title);
  input.value = '';
  updateUI(app, todoList);
};

const handleToggle = e => {
  if (e.target.tagName === 'LI') {
    const id = parseInt(e.target.dataset.id);
    app.toggleTodo(id);
    updateUI(app, todoList);
  }
};

const init = async () => {
  await new Promise(resolve => setTimeout(resolve, 100));
  addBtn.addEventListener('click', handleAdd);
  todoList.addEventListener('click', handleToggle);
};

init();
