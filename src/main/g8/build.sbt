val sparkVersion = "2.1.1"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.11.8"
    )),
    name := "Hello Spark",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "com.typesafe" % "config" % "1.3.1",
      "joda-time" % "joda-time" % "2.9.9"
    )
  )