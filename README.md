# Low-Level-Designs

- Low-Level Design (LLD) stands at the core of software development.
- It provides a crucial bridge between a High-Level Solution and the practicality of its implementation. 
- This will assess your ability to create scalable, flexible, and maintainable software

## Fundamental Concepts
    TO DO
## Design Patterns

## UML
- [Derek Banas - UML Playlist](https://www.youtube.com/playlist?list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc)
- [UML Class Diagram Tutorial](https://www.scaler.com/topics/software-engineering/Drawing-uml-diagrams-online/)
- [Relationships in UML](https://blog.visual-paradigm.com/what-are-the-six-types-of-relationships-in-uml-class-diagrams/)

## How to approach Low-Level Design problems in Interviews

#### *Step 1: After getting problem (5-10 mins)*

* **Clarify and Gather Requirements:**
    - Ask Relevant/Good Questions which help in understanding sytem features and behavior.
    - Ask What needs to be included in the current  system and future scope.
    - Don't assume anything and clarify with the interviewer.
    - Ask who is going to call the system.
      
#### *Step 2: Getting the solution (10-15 mins)*

* **System Visualisation:** Visualize the system starting from outside to inside and identify Components, Objects, and behaviors:
    -  Nouns can be Entities
    -  Verbs can be your behavior/functions
* **Identify Components:** Find the entities(classes) of the system and Identify the  relationship(Is a/Has a), and cardinality between them between different classes.
* **Schema Diagram :** Based on Entities and Relationships draw Schema Diagram(ER Diagram- optional)
    - Each class in the class diagram becomes a table in the Schema Diagram and the relationship between classes becomes the multiplicity between tables.
* **UML Diagram :** Create Class Diagram(optional ask interviewer)  and Code against interfaces
  
#### *Step 3 : Actual Coding (60-75 mins)*

* **Start Code(45-60 mins) :** Once thoughts are structured start coding, keep in mind to follow the SOLID Principle, Design Pattern, and OOPS wherever possible
* **Explanation:** Clearly explain your thought process and design decisions to the interviewer.

  Note: Some of them have hidden DSA Problems interviewer may ask you. Take care of time consideration.
  
## Schema Design Approach

* **Gather Requirements :** Gather Requirements/Clarify
* **Create tables and their attributes as columns :**
      - Find all the nouns in the tables.
      - For each noun just ask if we have to store data about that entity, if yes create a table.
      - Keep table name in the plural, column name in singular, and in snake case.
* **Add Primary Key :** In all the tables that you created just add the primary key.
  - Don't care about Foreign keys now.
  - Don't define the relationship now.
* **Identify Relationship Using Cardinality :** Find two entities and decide how they are related ( 1:1, 1:M, M:1, M:M )
    - go left to right put 1 on left side
    - go right to left and put 1 on the right side
    - if M is on any side put M on that side
* **Cardinality of Relationships/ Foreign key :**
    - Figure out cardinality: Represent cardinality in the database, Lookup tables/or mapping tables follow below
        - 1:1 => we need FK, put FK on any side
        - 1:M/M:1 => we need Fk,put FK on many sides
        - M:M => New Mapping table or lookup table
        - In 1:M or M:1 where a lot of entries are not part of the relation create a new table(Spare relation-The disadvantage is increased join think properly).
        - There can be cases when we have to store info about the relation/mapping table so create a separate table(eg: husband, wife, marriage detail)
* **Finalizing Table structure**

## Low-Level Design Interview Problems





## Refrences
 ~~~
 LLD Design:
    https://workat.tech/machine-coding/article/how-to-ace-machine-coding-round-hi8lnpp8tlmo
 Design Pattern
    https://www.interviewbit.com/design-patterns-interview-questions/#factory-design-pattern
 Schema Design
    https://www.youtube.com/watch?v=EavNLiTk-eo
 TO DO :
 * Pen Design
 * Practice Schema Design
 * Creation Design Pattern
~~~
