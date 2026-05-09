# Interfaces From Scratch in Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-Interfaces-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/OOP-Abstraction-7C3AED?style=for-the-badge" alt="OOP" />
  <img src="https://img.shields.io/badge/Revision-LLD%20Notebook-16A34A?style=for-the-badge" alt="Revision" />
</p>

This repository explains Java interfaces from first principles. It includes examples for interface methods, fields, multiple inheritance through interfaces, nested interfaces, and implementation classes.

## What It Covers

- Basic interface declaration.
- Interface methods and implementation classes.
- Fields inside interfaces.
- Multiple inheritance using interfaces.
- Nested interface examples.
- Practical OOP relationship between contracts and concrete classes.

## Repository Map

```text
Bird.java, Eagle.java, Hen.java                    Basic interface examples
InterfaceMethod_Bird.java                          Interface method examples
Fields_In_Interface.java                           Interface field behavior
MultipleInheritance_*                              Multiple inheritance through interfaces
NestedInterface_Bird.java, NestedEagle*.java       Nested interface examples
Main.java                                          Entry point for examples
interface_docs                                     Supporting notes
```

## Concept Flow

```mermaid
flowchart LR
    A[Interface Contract] --> B[Implementing Class]
    A --> C[Multiple Inheritance]
    A --> D[Nested Interface]
    B --> E[Runtime Behavior]
    classDef contract fill:#dbeafe,stroke:#2563eb,color:#1e3a8a,stroke-width:2px
    classDef impl fill:#ede9fe,stroke:#7c3aed,color:#4c1d95,stroke-width:2px
    classDef behavior fill:#dcfce7,stroke:#16a34a,color:#14532d,stroke-width:2px
    class A contract
    class B,C,D impl
    class E behavior
```

## Run Locally

```powershell
javac *.java
java Main
```

## Revision Notes

- An interface defines what a class can do, not how it does it.
- Java supports multiple inheritance of type through interfaces.
- Interface fields are public, static, and final by default.
- Interfaces are central to dependency inversion and clean LLD.

## Interview Talking Points

```text
I use this repo to revise how interfaces support abstraction and dependency inversion.
The examples show why code should depend on contracts instead of concrete classes.
```
