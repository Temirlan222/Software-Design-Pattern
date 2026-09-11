# Email Builder Project

This project demonstrates the Builder Design Pattern in Java.

It creates two different representations of the same email using the same construction steps:

- `EmailObjectBuilder` → `Email` object
- `EmailTextBuilder` → text representation

## Structure

- `Email` — Product
- `EmailBuilder` — Builder interface
- `EmailObjectBuilder` — Concrete Builder
- `EmailTextBuilder` — Concrete Builder
- `EmailDirector` — Director
- `Main` — Client

The Director contains predefined email configurations and works only with the `EmailBuilder` interface.

## Run

Run `Main.java`.