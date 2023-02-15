# Demo Kotlin - WebFlux - GraphQL

A server-side Kotlin application Demo

## 🛠️ Built with

- Kotlin 1.7
- Maven
- JVM 17
- Spring Web Flux - Annotation-based reactive components
- GraphQL
- Log4j-api-kotlin

***
## ☕ how it works?
```
# Clone this repository
$ git clone https://github.com/guilhermezamoner/demo-webflux-graphql.git

# Run the app
$  ./mvnw spring-boot:run

```

## 🏃 Testing
Start service and open in browser http://localhost:8080/graphiql?path=/graphql 
to open GraphiQL IDE

```graphql
# Get All Players
query  {
  getAllPlayers {
    id
    name
    age
    club
    nationality
  }
} 
```
```graphql
# Get players by club
query {
  getPlayersByClub(club: "Liverpool") {
    id
    name
    age
    club
    nationality
  }
}
```

```graphql
# Get player by name
query {
  getPlayerByName(name: "Casemiro") {
    id
    name
    age
    club
    nationality
  }
}
```
```graphql
# Add player
mutation addPlayer ($player: PlayerInput!) {
  addPlayer(player: $player) {
    id
    name
    age
    club
    nationality
  }
}

# Variables:

{
  "player":
     {
      "name": "Silva",
      "age": 29,
      "club": "Man City",
      "nationality": "Portugal"
  }
}
```
