# Low-Level-Designs

- Low-Level Design (LLD) stands at the core of software development.
- It provides a crucial bridge between a High-Level Solution and the practicality of its implementation. 
- This will assess your ability to create scalable, flexible, and maintainable software

## Fundamental Concepts


## Design Patterns

## UML
- [Derek Banas - UML Playlist](https://www.youtube.com/playlist?list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc)
- [UML Class Diagram Tutorial](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/)
- [Relationships in UML](https://blog.visual-paradigm.com/what-are-the-six-types-of-relationships-in-uml-class-diagrams/)

## How to approach Low-Level Design problems in Interviews
* **Clarify and Gather Requirements:**
    - Ask Relevant/Good Questions which help in understanding sytem features and behavior.
    - Ask What needs to be included in the current  system and future scope.
    - Don't assume anything and clarify with the interviewer.
    - Ask who is going to call the system.
* **System Visualisation:** Visualize the system starting from outside to inside and identify Components, Objects, and behaviors:
    -  Nouns can be Entities
    -  Verbs can be your behavior/functions
* **Identify Components:** Find the entities(classes) of the system and Identify the  relationship(Is a/Has a), and cardinality between them between different classes.
* **Schema Diagram :** Based on Entities and Relationships draw Schema Diagram(ER Diagram- optional)
    - Each class in the class diagram becomes a table in the Schema Diagram and the relationship between classes becomes the multiplicity between tables.
* **UML Diagram :** Create Class Diagram(optional ask interviewer)  and Code against interfaces
* **Actual Code :** Once thoughts are structured start coding, keep in mind to follow the SOLID Principle, Design Pattern, and OOPS wherever possible
* **Explanation:** Clearly explain your thought process and design decisions to the interviewer.

  Note: Some of them have hidden DSA Problems interviewer may ask you. Take care of time consideration.
  
## Schema Design Tips/Approach

* Gather Requirements : Gather Requirements/Clarify
* Class Diagram : Find Entities and attributes
* Schema diagram :
      - Gather nouns or the nouns for which we store info and create a table for that.
      - Keep table name in the plural and in snake case.
      - Everything for which you have to store info about the table(which is not a relationship with other entities) creates that as column of the table.
* Cardinality of Relationships/ Foreign key : 
    - Define the relationship about which entity.
    - Define which relation b/w entities
    - Figure out cardinality: Represent cardinality in the database, Lookup tables/or mapping tables follow below
        - 1:1 => we need FK, put FK on any side
        - 1:M/M:1 => we need Fk, FK on many sides
        - M:M => Mapping table or lookup table 
    - Even relationships can have an attribute in a mapping table
* Finalizing Table structure

## Low-Level Design Interview Problems





## Refrences

| Topic         | Link |
| :---         |     :---:      |   
| Schema Design   | https://www.youtube.com/watch?v=EavNLiTk-eo     | 
| git diff     | git diff       | 
