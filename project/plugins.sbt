//LS Plugin
resolvers ++= Seq(
  "less is" at "http://repo.lessis.me",
  "coda" at "http://repo.codahale.com")

//addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")

