var fs = require("fs")
var contents = fs.readFileSync("new.json")
var jsonObject = JSON.parse(contents)
console.log(jsonObject.z)
console.log(jsonObject.Hello)