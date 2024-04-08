def newFile() {
  writeFile(file: "filename.txt", text: "This is final", encoding: "UTF-8")
  println "(==========================)"
  readFile('filename.txt')
}
