name := "ergosample"

scalaVersion := "2.12.10"

lazy val sonatypePublic = "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"
lazy val sonatypeReleases = "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
lazy val sonatypeSnapshots = "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers ++= Seq(Resolver.mavenLocal, sonatypeReleases, sonatypeSnapshots, Resolver.mavenCentral)

libraryDependencies += "org.ergoplatform" %% "ergo-appkit" % "develop-d77acfb8-SNAPSHOT"

libraryDependencies += "org.ergoplatform" %% "ergo-scala-compiler" % "0.0.0-32-aaadbee1-SNAPSHOT"

libraryDependencies += "org.ergoplatform" %% "ergo-playground-env" % "0.0.0-94-a3ea79fe-SNAPSHOT"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test

