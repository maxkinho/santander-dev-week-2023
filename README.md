# Santander Dev Week 2023

classDiagram
  class User {
    -name: String
    -account: Account
    -features: Feature[]
    -card: Card
    -news: News[]
  }
  
  class Account {
    -number: String
    -agency: String
    -balance: Float
    -limit: Float
  }
  
  class Feature {
    -icon: String
    -description: String
  }
  
  class Card {
    -number: String
    -limit: Float
  }
  
  class News {
    -icon: String
    -description: String
  }
  
  User "1" *-- "1" Account : has
  User "1" *-- "n" Feature : has
  User "1" *-- "1" Card : has
  User "1" *-- "n" News : has
