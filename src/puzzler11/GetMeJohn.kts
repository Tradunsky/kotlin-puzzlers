package puzzler11

class Person(name: String) {
  var name = name
    get() = if (name == "John") "Jaan" else name
}

println(Person("John").name)

// What will it print?
// a) John
// b) Jaan
// c) Will not compile
// d) None of the above
