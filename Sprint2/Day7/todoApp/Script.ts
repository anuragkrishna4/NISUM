let taskIdCounter: number = 0;
let isAppRunning: boolean = true;
let appName: string = "Todo";
let taskTuple: [number, string]; 

enum Status {
  Pending = "PENDING",
  Completed = "COMPLETED"
}

type TaskID = number;

type TaskPriority = "High" | "Medium" | "Low";

interface Task {
  id: TaskID;
  description: string;
  status: Status;
  priority?: TaskPriority; 
}

let deletedTask: Task | null = null;

let tasks: Task[] = [];

const taskListContainer: object = document.getElementById("todoList")!;

const input = document.getElementById("todoInput") as HTMLInputElement;
const form = document.getElementById("todoForm") as HTMLFormElement;

function createElement<T extends HTMLElement>(tag: string): T {
  return document.createElement(tag) as T;
}

function isString(value: any): value is string {
  return typeof value === "string";
}


function addTask(description: string): void {
  if (!isString(description) || description.trim() === "") return;

  const newTask: Task = {
    id: ++taskIdCounter,
    description,
    status: Status.Pending,
  };

  tasks.push(newTask);
  renderTasks();
}

type TaskAction =
  | { type: "ADD"; payload: Task }
  | { type: "DELETE"; payload: TaskID }
  | { type: "TOGGLE"; payload: TaskID };

function taskReducer(state: Task[], action: TaskAction): Task[] {
  switch (action.type) {
    case "ADD":
      return [...state, action.payload];
    case "DELETE":
      return state.filter(task => task.id !== action.payload);
    case "TOGGLE":
      return state.map(task =>
        task.id === action.payload
          ? { ...task, status: task.status === Status.Completed ? Status.Pending : Status.Completed }
          : task
      );
    default:
      return state;
  }
}


function renderTasks(): void {
  (taskListContainer as HTMLElement).innerHTML = "";

  tasks.forEach(task => {
    const li = createElement<HTMLLIElement>("li");
    li.textContent = `${task.description} [${task.status}]`;

    const button = createElement<HTMLButtonElement>("button");
    button.textContent = task.status === Status.Pending ? "Complete" : "Undo";
    button.onclick = () => {
      tasks = taskReducer(tasks, { type: "TOGGLE", payload: task.id });
      renderTasks();
    };

    const del = createElement<HTMLButtonElement>("button");
    del.textContent = "Delete";
    del.onclick = () => {
      tasks = taskReducer(tasks, { type: "DELETE", payload: task.id });
      renderTasks();
    };

    li.appendChild(button);
    li.appendChild(del);
    (taskListContainer as HTMLElement).appendChild(li);
  });
}

form.addEventListener("submit", function (e: Event): void {
  e.preventDefault();
  addTask(input.value);
  input.value = "";
});

type PartialTask = {
  [K in keyof Task]?: Task[K];
};


function assertNever(x: never): never {
  throw new Error("Unexpected object: " + x);
}
