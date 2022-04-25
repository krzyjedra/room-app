import org.scalatest._
import flatspec._
import matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {
  "A room" should "have a name" in {
    val room = new Room("english", capacity = 1)
    room.name shouldBe "english"
  }

  it should "have a capacity" in {
    val room = new Room("english", capacity = 1)
    room.capacity shouldBe 1
  }

  it should "let person enter" in {
    val room = new Room("hobby", capacity = 1)
    room.enter("Krzysiek") shouldBe true
  }

  it should "fail to let person in when there is no free space" in {
    val room = new Room("hobby", capacity = 1)
    room.enter("Paulina")
    room.enter("Krzysiek") shouldBe false
  }

  it should "let person in when there is free space" in {
    val room = new Room("hobby", capacity = 1)
    room.enter("Paulina")
    room.leave("Paulina")
    room.enter("Krzysiek") shouldBe true
  }

  it should "inform about quantity of all persons whom are inside the room" in {
    val room = new Room("hobby", capacity = 28)
    room.enter("Paulina")
    room.enter("Krzysiek")
    room.report shouldBe 2
  }

  it should "inform about quantity of all persons whom are inside the room after enter and leave methods" in {
    val room = new Room("hobby", capacity = 28)
    room.enter("Paulina")
    room.enter("Darek")
    room.leave("Darek")
    room.report shouldBe 1
  }

}