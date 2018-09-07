lazy val utesttoy =
  (project in file(".")).
    settings(
      name := "utesttoy",
      organization := "com.wiladamec",
      version := "0.1",
      scalaVersion := "2.12.6",
      test in assembly := {},
      assemblyMergeStrategy in assembly := {
        case PathList("log4j.properties") => MergeStrategy.discard
        case PathList("log4j.xml") => MergeStrategy.discard
        case x =>
          val oldStrategy = (assemblyMergeStrategy in assembly).value
          oldStrategy(x)
      },
      testFrameworks += new TestFramework("utest.runner.Framework"),
      libraryDependencies ++= Seq(
        "com.lihaoyi" %% "utest" % "0.6.3" % "test"
      )
)
