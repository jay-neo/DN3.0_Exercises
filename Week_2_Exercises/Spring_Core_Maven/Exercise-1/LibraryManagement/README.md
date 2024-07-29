## Solution

To initialize project using `mvn` command
```sh
mvn archetype:generate "-DgroupId=com.library" "-DartifactId=LibraryManagement" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"
```

Folder Structure
```
LibraryManagement/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── library/
│   │   │           ├── service/
│   │   │           │   └── BookService.java
│   │   │           ├── repository/
│   │   │           │   └── BookRepository.java
│   │   │           └── App.java
│   │   └── resources/
│   │       └── applicationContext.xml
│   └── test/
│
├── pom.xml
└── README.md
```

## Testing


To compile and run the project
```sh
mvn clean package
```

```sh
java -cp target/LibraryManagement-1.0-SNAPSHOT.jar com.library.App
```

