# Task Tracker CLI
Task Tracker CLI is a command-line application that helps you manage your tasks efficiently. You can add, update, delete, and track tasks with ease. All tasks are stored in a JSON file for persistence.
## Features
- Add, update, and delete tasks
- Mark tasks as in progress or done
- List tasks by status (todo, in-progress, done)
- Store tasks in a JSON file
## Prerequisites
- Java JDK 8 or higher
- IntelliJ IDEA or any Java IDE
## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/username/task-tracker-cli.git
   ```
2. Open the project in IntelliJ IDEA.
3. Build the project to ensure all dependencies are resolved.
## Usage
Run the application using the following commands:

- Add a task:
  ```bash
  task-cli add "Buy groceries"
  ```
- Update a task:
  ```bash
  task-cli update 1 "Buy groceries and cook dinner"
  ```
- Delete a task:
  ```bash
  task-cli delete 1
  ```
- List tasks by status:
  ```bash
  task-cli list done
  task-cli list todo
  task-cli list in-progress
  ```
## Project Structure
task-tracker-cli
├── src
│   └── Main.java    # Entry point for the application
├── tasks.json       # Stores tasks data
└── README.md        # Project documentation
## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.
## License
This project is licensed under the MIT License.
## Acknowledgments
- [Gson](https://github.com/google/gson) for JSON serialization
- Stack Overflow for problem-solving tips
