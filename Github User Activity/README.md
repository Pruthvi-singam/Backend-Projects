# GitHub Activity CLI

**GitHub Activity CLI** is a command-line interface (CLI) tool that allows you to fetch and display the recent activity of a GitHub user. This project demonstrates how to interact with the GitHub API to retrieve and display user activity such as commits, issues, and pull requests.

**Project URL:** (https://github.com/Pruthvi-singam/Backend-Projects/tree/main/Github%20User%20Activity)

---

## 🚀 Features

- **Fetch Recent Activity**: Display the latest events (such as commits, issues, and stars) from a specified GitHub user.
- **Error Handling**: Gracefully handles invalid usernames, network failures, and API issues.
- **Event Filtering**: Filter events by type (e.g., `PushEvent`, `IssuesEvent`).
- **Easy Setup**: Get started with a simple command line input.
- **No Dependencies**: Built from scratch using only native Java libraries (no external dependencies required for API requests).

---

## 📦 Prerequisites

To use this tool, you need to have **Java** installed on your system.

1. Install **Java** (JDK 8 or later) from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Verify Java installation:
   ```bash
   java -version
## ⚙️ Installation

1. **Clone this repository**:
   ```bash
   git clone https://github.com/your-username/github-activity-cli.git
   cd github-activity-cli
   ```

2. **Compile and Run**:
   - If you're using **Maven**, you can compile the project using:
     ```bash
     mvn clean compile
     ```

   - To run the application:
     ```bash
     mvn exec:java -Dexec.mainClass="GitHubActivityCLI"
     ```

---

## 🧑‍💻 Usage

1. **Fetch activity for a GitHub user**:
   Run the following command in your terminal, replacing `<GitHubUsername>` with the GitHub username you want to check:
   ```bash
   java -jar github-activity-cli.jar <GitHubUsername>
   ```

2. **Example Output**:
   ```bash
   Fetching activity for user: kamranahmedse
   - Pushed 3 commits to kamranahmedse/developer-roadmap
   - Opened a new issue in kamranahmedse/developer-roadmap
   - Starred kamranahmedse/developer-roadmap
   ```

3. **Filter events by type**:
   You can filter the results to show specific events, for example, only `PushEvent`:
   ```bash
   java -jar github-activity-cli.jar <GitHubUsername> --filter PushEvent
   ```

---

## 🛠️ Development

### 1. **Clone the repo**:
   ```bash
   git clone https://github.com/your-username/github-activity-cli.git
   ```

### 2. **Contributing**:
We welcome contributions! If you want to contribute to this project, please follow these steps:

- Fork the repository.
- Create a new branch (`git checkout -b feature/your-feature`).
- Make your changes and commit them (`git commit -am 'Add new feature'`).
- Push to your branch (`git push origin feature/your-feature`).
- Create a pull request.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📝 Acknowledgements

- Thanks to [GitHub API](https://docs.github.com/en/rest/reference/events) for providing the API used to fetch user activity.

---

## 🤖 Example of the CLI in Action

```bash
$ java -jar github-activity-cli.jar kamranahmedse
Fetching activity for user: kamranahmedse
- Pushed 5 commits to kamranahmedse/awesome-project
- Opened a new issue in kamranahmedse/awesome-project
- Starred kamranahmedse/awesome-project
```

---
```

This `README.md` file provides a clean structure for your GitHub Activity CLI project. You can customize the repository URL, examples, and other project details as per your needs! 😊
