object Yes extends App {
  val str = if(!args.isEmpty) args(0) else "y"

  while(true) {
    print(str + "\n")
  }
}
