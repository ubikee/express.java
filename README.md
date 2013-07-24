express.java
============

express.java is a experimental clon of express.js 3 using new jdk8 features:

- lambdas
- completableFuture
- others...

Believe it or not this is java:

	app.get   ("/world", (req, res) -> res.send("get world"));
	app.post  ("/world", (req, res) -> res.send("post world"));
	app.put   ("/world", (req, res) -> res.send("put world"));
	app.delete("/world", (req, res) -> res.send("delete world"));