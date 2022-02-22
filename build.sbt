name := "ergosample"

scalaVersion := "2.12.10"

lazy val sonatypePublic = "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"
lazy val sonatypeReleases = "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
lazy val sonatypeSnapshots = "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers ++= Seq(Resolver.mavenLocal, sonatypeReleases, sonatypeSnapshots, Resolver.mavenCentral)

libraryDependencies += "org.ergoplatform" %% "ergo-appkit" % "4.0.7"

libraryDependencies += "com.dav009" %% "ergopilot" % "0.0.0+13-d7214d69+20220218-2155" % Test
libraryDependencies += ("org.scorexfoundation" %% "sigma-state" % "4.0.5" ).classifier("tests")
