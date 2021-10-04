# Course work (in progress)
This is my rethought coursework for the third year of the university.
It is a simple spring project with simple db that contains info about movies, cinema theaters and sessions.

##  🚀 Getting Started
This section provides a high-level quick start guide

### Prerequisites
- [Java](https://www.oracle.com/java/technologies/) 11
- [Maven](https://maven.apache.org/) 3.8.1
- [PostgreSQL](https://www.postgresql.org/) 11 or higher
- [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/)

**Step 1. Set up environment variables**
- ```POSTGRES_USER```  = postgres user
- ```POSTGRES_PASS```  = postgres password

**Step 2. Configure DB**

Create DB ```cinemaDB``` with 5432 port on your local machine

**Step 3. Build app**

>mvn clean install

**Step 4. Run**

_Idea_:
- create SpringBoot configuration
- set up environment variables to configuration
- run

### Examples
You can find example-request in package ```requests```
