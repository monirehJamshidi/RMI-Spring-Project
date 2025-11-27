# RMI-Spring-Project


# RMI Spring Project
A simple Java RMI application built with **Spring Framework (XML configuration)** and **Maven**.

This project demonstrates how to create:  
✔ An **RMI Server** that exposes a remote service  
✔ An **RMI Client** that calls the remote service  
✔ A shared `Person` model and `PersonProviderRemote` interface  
✔ Spring-powered dependency injection (XML configuration)  
✔ Fully buildable with Maven + GitHub Actions CI workflow

---

## 📂 Project Structure


rmi-spring-project\
│── server\
│ ├── src/main/java\
│ ├── pom.xml\
│── client\
│ ├── src/main/java\
│ ├── pom.xml\
│── pom.xml (root)\
│── .github/workflows/maven.yml\
│── README.md\




---

## 🚀 How It Works

### 🖥 Server
1. Starts an RMI registry on port **1099**
2. Publishes remote service under name:  sap

3. The remote method returns a `Person` object.

### 💻 Client
1. Looks up:  //localhost/sap


2. Invokes remote method
3. Receives `Person` from server and prints name + family

---

## 🛠 Technologies Used

- **Java 17**
- **Spring Framework 5.x (XML config)**
- **Maven**
- **RMI (Remote Method Invocation)**
- **GitHub Actions (CI/CD)**

---

## 🔧 Build & Run

### 1) Build the entire project
bash
    mvn clean install

## 2) Run Server
Inside server module:

    mvn exec:java -Dexec.mainClass="org.j2os.Main"


3) Run Client 
Inside client module:

        mvn exec:java -Dexec.mainClass="org.j2os.Main"

### ⚙ GitHub Actions CI
This project includes a workflow located at:

    .github/workflows/maven.yml

It automatically:

✔ Builds the project
✔ Runs tests
✔ Uses Java 21
✔ Caches Maven dependencies

### 📡 RMI Service

Remote Interface

    public interface PersonProviderRemote extends Remote {
        Person getPersonFromRemote() throws Exception;
    }

### Model

    public class Person implements Serializable {
        private String name;
        private String family;
    }

❤️ Author\
Developed by Monireh Jamshidi\
Java Developer | Spring | Microservices | RMI