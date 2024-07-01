C:.
│  README.md
│
├─.vscode
│      settings.json
│
└─demo
    │  .gitignore
    │  mvnw
    │  mvnw.cmd
    │  pom.xml
    │
    ├─.mvn
    │  └─wrapper
    │          maven-wrapper.properties
    │
    ├─src
    │  ├─main
    │  │  ├─java
    │  │  │  └─com
    │  │  │      └─example
    │  │  │          │  DemoApplication.java
    │  │  │          │
    │  │  │          ├─controller
    │  │  │          │      MyController.java
    │  │  │          │
    │  │  │          ├─model
    │  │  │          │      Answer.java
    │  │  │          │      Question.java
    │  │  │          │
    │  │  │          └─repository
    │  │  │                  AnswerRepository.java
    │  │  │                  QuestionRepository.java
    │  │  │
    │  │  └─resources
    │  │      │  application.properties
    │  │      │
    │  │      ├─static
    │  │      │      index.html
    │  │      │
    │  │      └─tamplates
    │  │              question_list.html
    │  │
    │  └─test
    │      └─java
    │          └─com
    │              └─example
    │                  └─demo
    │                          DemoApplicationTests.java
    │
    └─target
        ├─classes
        │  │  application.properties
        │  │
        │  ├─com
        │  │  └─example
        │  │      │  DemoApplication.class
        │  │      │
        │  │      ├─controller
        │  │      │      MyController.class
        │  │      │
        │  │      ├─model
        │  │      │      Answer.class
        │  │      │      Question.class
        │  │      │
        │  │      └─repository
        │  │              AnswerRepository.class
        │  │              QuestionRepository.class
        │  │
        │  ├─static
        │  │      index.html
        │  │
        │  └─tamplates
        │          question_list.html
        │
        ├─generated-sources
        │  └─annotations
        ├─generated-test-sources
        │  └─test-annotations
        └─test-classes
            └─com
                └─example
                    └─demo
                            DemoApplicationTests.class