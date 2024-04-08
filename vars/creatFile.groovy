def newFile() {
  new FileWriter("example.txt", true).with {
	write("Hello world\n")
	flush()
}
}
