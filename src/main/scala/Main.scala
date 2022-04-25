object Main extends App {

  val akcja = new Room("fun", 28)
  akcja.enter("Beata")
  akcja.enter("Tomasz")
  akcja.enter("Krystyna")
  akcja.enter("Grzegorz")
  akcja.leave("Karol")
  akcja.enter("Katarzyna")
  print(akcja.report)
}
