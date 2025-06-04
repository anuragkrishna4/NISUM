export const renderTodo = ({ id, title, completed }) =>
  `<li data-id="${id}" class="${completed ? 'done' : ''}">${title}</li>`;

export const updateUI = (app, container) => {
  container.innerHTML = Array.from(app).map(renderTodo).join('');
};