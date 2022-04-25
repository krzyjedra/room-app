class Room(val name: String, val capacity: Int) {

  var peopleCount = 0

  def enter(person: String): Boolean = {
    if (peopleCount >= capacity) false
    else {
      peopleCount += 1
      true
    }
  }

  def leave(person: String): Boolean = {
    if (peopleCount == 0) false
    else {
      peopleCount -= 1
      true
    }
  }

  def report: Int = peopleCount

}