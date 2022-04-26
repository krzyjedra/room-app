case class Room(name: String, capacity: Int) {
//  assert(capacity > 0, "capacity must be greater than zero")
  if (capacity < 1) {
    throw new IllegalStateException("capacity must be greater than zero")
  }
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