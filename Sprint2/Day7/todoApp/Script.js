var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var taskIdCounter = 0;
var isAppRunning = true;
var appName = "Todo";
var taskTuple;
var Status;
(function (Status) {
    Status["Pending"] = "PENDING";
    Status["Completed"] = "COMPLETED";
})(Status || (Status = {}));
var deletedTask = null;
var tasks = [];
var taskListContainer = document.getElementById("todoList");
var input = document.getElementById("todoInput");
var form = document.getElementById("todoForm");
function createElement(tag) {
    return document.createElement(tag);
}
function isString(value) {
    return typeof value === "string";
}
function addTask(description) {
    if (!isString(description) || description.trim() === "")
        return;
    var newTask = {
        id: ++taskIdCounter,
        description: description,
        status: Status.Pending,
    };
    tasks.push(newTask);
    renderTasks();
}
function taskReducer(state, action) {
    switch (action.type) {
        case "ADD":
            return __spreadArray(__spreadArray([], state, true), [action.payload], false);
        case "DELETE":
            return state.filter(function (task) { return task.id !== action.payload; });
        case "TOGGLE":
            return state.map(function (task) {
                return task.id === action.payload
                    ? __assign(__assign({}, task), { status: task.status === Status.Completed ? Status.Pending : Status.Completed }) : task;
            });
        default:
            return state;
    }
}
function renderTasks() {
    taskListContainer.innerHTML = "";
    tasks.forEach(function (task) {
        var li = createElement("li");
        li.textContent = "".concat(task.description, " [").concat(task.status, "]");
        var button = createElement("button");
        button.textContent = task.status === Status.Pending ? "Complete" : "Undo";
        button.onclick = function () {
            tasks = taskReducer(tasks, { type: "TOGGLE", payload: task.id });
            renderTasks();
        };
        var del = createElement("button");
        del.textContent = "Delete";
        del.onclick = function () {
            tasks = taskReducer(tasks, { type: "DELETE", payload: task.id });
            renderTasks();
        };
        li.appendChild(button);
        li.appendChild(del);
        taskListContainer.appendChild(li);
    });
}
form.addEventListener("submit", function (e) {
    e.preventDefault();
    addTask(input.value);
    input.value = "";
});
function assertNever(x) {
    throw new Error("Unexpected object: " + x);
}
